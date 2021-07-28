package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	N, M int
	G    [][]int
	C    [][]bool
	dx   = [4]int{1, -1, 0, 0}
	dy   = [4]int{0, 0, 1, -1}
)

type pair struct {
	x, y int
}

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	N, M = scanInt(), scanInt()
	G = make([][]int, N+1)
	C = make([][]bool, N+1)
	for i := 1; i <= N; i++ {
		G[i] = scanGraph()
		C[i] = make([]bool, M+1)
	}

	answerNumber := 0
	answerSize := 0

	for i := 1; i <= N; i++ {
		for j := 1; j <= M; j++ {
			if G[i][j] == 1 && !C[i][j] {
				answerSize = max(answerSize, bfs(pair{i, j}))
				answerNumber++
			}
		}
	}

	fmt.Fprintln(w, answerNumber)
	fmt.Fprintln(w, answerSize)
}

func bfs(p pair) int {
	q := make([]pair, 0)
	q = append(q, p)
	C[p.x][p.y] = true
	size := 1

	for len(q) != 0 {
		nx, ny := q[0].x, q[0].y
		q = q[1:]
		for k := range dx {
			nnx, nny := nx+dx[k], ny+dy[k]
			if 1 <= nnx && nnx <= N && 1 <= nny && nny <= M {
				if !C[nnx][nny] && G[nnx][nny] == 1 {
					q = append(q, pair{nnx, nny})
					C[nnx][nny] = true
					size++
				}
			}
		}
	}
	return size
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanGraph() []int {
	A := make([]int, M+1)
	for i := 1; i <= M; i++ {
		A[i] = scanInt()
	}
	return A
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
