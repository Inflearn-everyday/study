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

func init() {
	sc.Split(bufio.ScanWords)
}

var (
	M, N int
	A    [][]int
	D    [][]int
	dx   = [4]int{1, -1, 0, 0}
	dy   = [4]int{0, 0, 1, -1}
)

func main() {
	defer w.Flush()
	M, N = scanInt(), scanInt()
	A = make([][]int, M+1)
	D = make([][]int, M+1)
	for i := 1; i <= M; i++ {
		A[i] = make([]int, N+1)
		D[i] = make([]int, N+1)
		for j := 1; j <= N; j++ {
			A[i][j] = scanInt()
			D[i][j] = -1
		}
	}
	fmt.Fprintln(w, solve(M, N))
}

func solve(x, y int) int {
	if x == 1 && y == 1 {
		return 1
	}
	if D[x][y] != -1 {
		return D[x][y]
	}
	D[x][y] = 0
	for k := range dx {
		nx, ny := x+dx[k], y+dy[k]
		if 1 <= nx && nx <= M && 1 <= ny && ny <= N {
			if A[x][y] < A[nx][ny] {
				D[x][y] += solve(nx, ny)
			}
		}
	}
	return D[x][y]
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
