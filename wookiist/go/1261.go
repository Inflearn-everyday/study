package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	G  [][]string
	D  [][]int
	dx = [4]int{1, 0, -1, 0}
	dy = [4]int{0, 1, 0, -1}
)

type pair struct {
	x, y int
}

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	M, N := scanInt(), scanInt()
	G = make([][]string, N+1)
	D = make([][]int, N+1)
	D[0] = make([]int, M+1)
	for i := 1; i <= N; i++ {
		G[i] = scanGraph()
		D[i] = make([]int, M+1)
		for j := range D[i] {
			D[i][j] = -1
		}
	}
	currQ := make([]pair, 0)
	nextQ := make([]pair, 0)
	currQ = append(currQ, pair{1, 1})
	D[1][1] = 0
	for len(currQ) != 0 {
		nx, ny := currQ[0].x, currQ[0].y
		currQ = currQ[1:]
		for k := range dx {
			nnx, nny := nx+dx[k], ny+dy[k]
			if 1 <= nnx && nnx <= N && 1 <= nny && nny <= M {
				if D[nnx][nny] == -1 {
					if G[nnx][nny] == "0" {
						D[nnx][nny] = D[nx][ny]
						currQ = append(currQ, pair{nnx, nny})
					} else {
						D[nnx][nny] = D[nx][ny] + 1
						nextQ = append(nextQ, pair{nnx, nny})
					}
				}
			}
		}
		if len(currQ) == 0 {
			currQ = nextQ
			nextQ = make([]pair, 0)
		}
	}
	fmt.Fprintln(w, D[N][M])
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanGraph() []string {
	sc.Scan()
	s := strings.Split("0"+sc.Text(), "")
	return s
}
