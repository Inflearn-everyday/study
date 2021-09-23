package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	A  [][]string
	D  [][][]int
	dx = [9]int{-1, -1, -1, 0, 0, 0, 1, 1, 1}
	dy = [9]int{-1, 0, 1, -1, 0, 1, -1, 0, 1}
)

/*
x-1, y-1     x-1, y        x-1, y+1
x, y-1        x,  y        x, y+1
x+1, y-1      x+1, y       x+1, y+1
*/
type pair struct {
	x, y, t int
}

func main() {
	defer w.Flush()
	A = make([][]string, 9)
	D = make([][][]int, 9)
	for i := range A {
		if i != 0 {
			A[i] = scanGraph()
		}
		D[i] = make([][]int, 9)
		for j := range D[i] {
			D[i][j] = make([]int, 9)
			for k := range D[i][j] {
				D[i][j][k] = -1
			}
		}
	}
	q := make([]pair, 0)
	q = append(q, pair{8, 1, 0})
	D[8][1][0] = 0
	answer := false
	for len(q) != 0 {
		nx, ny, nt := q[0].x, q[0].y, q[0].t
		q = q[1:]
		for k := range dx {
			nnx, nny, nnt := nx+dx[k], ny+dy[k], nt+1
			if 1 <= nnx && nnx <= 8 && 1 <= nny && nny <= 8 {
				if nnt >= 8 {
					nnt = 8
				}
				if nnx-nt >= 1 && A[nnx-(nt)][nny] == "#" {
					continue
				}
				if nnx-(nnt) >= 1 && A[nnx-(nnt)][nny] == "#" {
					continue
				}
				if D[nnx][nny][nnt] == -1 {
					if nnx == 1 && nny == 8 {
						answer = true
					}
					D[nnx][nny][nnt] = D[nx][ny][nt] + 1
					q = append(q, pair{nnx, nny, nnt})
				}
			}
		}
	}
	if answer {
		fmt.Fprintln(w, 1)
	} else {
		fmt.Fprintln(w, 0)
	}
}

func scanGraph() []string {
	sc.Scan()
	s := strings.Split("X"+sc.Text(), "")
	return s
}
