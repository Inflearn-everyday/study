package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	N      int
	A      [][]int
	C      [][]bool
	answer []int
	dx     = [4]int{1, -1, 0, 0}
	dy     = [4]int{0, 0, 1, -1}
)

type pair struct {
	x, y int
}

func main() {
	defer w.Flush()
	N = scanInt()
	A = make([][]int, N+1)
	C = make([][]bool, N+1)
	for i := 1; i <= N; i++ {
		A[i] = scanGraph()
		C[i] = make([]bool, N+1)
	}

	answer = make([]int, 0)
	for i := 1; i <= N; i++ {
		for j := 1; j <= N; j++ {
			if A[i][j] == 1 && !C[i][j] {
				answer = append(answer, bfs(i, j))
			}
		}
	}
	sort.Slice(answer, func(i, j int) bool {
		return answer[i] < answer[j]
	})
	fmt.Fprintln(w, len(answer))
	for i := range answer {
		fmt.Fprintln(w, answer[i])
	}
}

func bfs(x, y int) int {
	q := make([]pair, 0)
	q = append(q, pair{x, y})
	C[x][y] = true
	res := 1
	for len(q) != 0 {
		nx, ny := q[0].x, q[0].y
		q = q[1:]
		for k := range dx {
			nnx, nny := nx+dx[k], ny+dy[k]
			if 1 <= nnx && nnx <= N && 1 <= nny && nny <= N && !C[nnx][nny] && A[nnx][nny] == 1 {
				q = append(q, pair{nnx, nny})
				C[nnx][nny] = true
				res++
			}
		}
	}
	return res
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanGraph() []int {
	sc.Scan()
	s := strings.Split("0"+sc.Text(), "")
	res := make([]int, len(s))
	for i := range res {
		res[i], _ = strconv.Atoi(s[i])
	}
	return res
}
