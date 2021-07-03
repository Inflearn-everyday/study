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
	W, H int
	G    [][]string
	P    []int
	X    [][]int
	D    [][]int
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
	for {
		W, H = scanInt(), scanInt()
		if W == 0 && H == 0 {
			break
		}
		G = make([][]string, H+1)
		for i := 1; i <= H; i++ {
			G[i] = scanGraph()
		}
		points := checkPoints()
		ok := true
		X = make([][]int, len(points))
		for i := range X {
			X[i] = make([]int, len(points))
		}
		var dist [][]int
		for i := range points {
			dist = bfs(points[i].x, points[i].y)
			for j := range points {
				X[i][j] = dist[points[j].x][points[j].y]
				if X[i][j] == -1 {
					ok = false
				}
			}
		}
		if !ok {
			fmt.Fprintln(w, -1)
			continue
		}
		P = make([]int, len(points)-1)
		for i := range P {
			P[i] = i + 1
		}
		answer := -1
		for {
			tmpAnswer := X[0][P[0]]
			for i := 0; i < len(points)-2; i++ {
				tmpAnswer += X[P[i]][P[i+1]]
			}
			if answer == -1 || answer > tmpAnswer {
				answer = tmpAnswer
			}
			if !nextPermutation(len(P)) {
				break
			}
		}
		fmt.Fprintln(w, answer)
	}
}

func bfs(x, y int) [][]int {
	D = make([][]int, H+1)
	for i := range D {
		D[i] = make([]int, W+1)
		for j := range D[i] {
			D[i][j] = -1
		}
	}
	q := make([]pair, 0)
	q = append(q, pair{x, y})
	D[x][y] = 0
	for len(q) != 0 {
		nx, ny := q[0].x, q[0].y
		q = q[1:]
		for k := range dx {
			nnx, nny := nx+dx[k], ny+dy[k]
			if 1 <= nnx && nnx <= H && 1 <= nny && nny <= W {
				if D[nnx][nny] == -1 && G[nnx][nny] != "x" {
					D[nnx][nny] = D[nx][ny] + 1
					q = append(q, pair{nnx, nny})
				}
			}
		}
	}
	return D
}

func nextPermutation(n int) bool {
	i := n - 1
	for i > 0 && P[i-1] >= P[i] {
		i--
	}
	if i <= 0 {
		return false
	}
	j := n - 1
	for P[j] <= P[i-1] {
		j--
	}
	P[i-1], P[j] = P[j], P[i-1]
	j = n - 1
	for i < j {
		P[i], P[j] = P[j], P[i]
		i++
		j--
	}
	return true
}

func checkPoints() []pair {
	points := make([]pair, 0, 10)
	points = append(points, pair{0, 0})
	for i := range G {
		for j := range G[i] {
			if G[i][j] == "*" {
				points = append(points, pair{i, j})
			} else if G[i][j] == "o" {
				points[0].x, points[0].y = i, j
			}
		}
	}
	return points
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanGraph() []string {
	sc.Scan()
	s := strings.TrimSuffix("."+sc.Text(), "\n")
	t := strings.Split(s, "")
	return t
}
