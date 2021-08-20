package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w     = bufio.NewWriter(os.Stdout)
	r     = bufio.NewReader(os.Stdin)
	n, m  int
	graph [][]int
	dist  [][][]int
	check [][]int
	dx    = [4]int{1, -1, 0, 0}
	dy    = [4]int{0, 0, 1, -1}
	dz    = [2]int{0, 1}
)

const inf int = 987654321

type pair struct {
	x int
	y int
	z int
}

func main() {
	defer w.Flush()
	fmt.Fscanf(r, "%d %d\n", &n, &m)
	graph = make([][]int, n)
	dist = make([][][]int, n)
	for i := range graph {
		graph[i] = getInts()
		dist[i] = make([][]int, m)
		for j := range dist[i] {
			dist[i][j] = make([]int, 2)
		}
	}
	result := bfs(0, 0, 0)
	fmt.Fprintln(w, result)
}

func getInts() []int {
	res := make([]int, m)
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	t := strings.Split(s, "")
	for i := range t {
		res[i], _ = strconv.Atoi(t[i])
	}

	return res
}

func bfs(x, y, z int) int {
	q := []pair{{x, y, z}}
	dist[x][y][z] = 1
	for len(q) != 0 {
		nx, ny, broken := q[0].x, q[0].y, q[0].z
		q = q[1:]
		for k := range dx {
			nnx, nny := nx+dx[k], ny+dy[k]
			if 0 <= nnx && nnx < n && 0 <= nny && nny < m {
				if graph[nnx][nny] == 0 && dist[nnx][nny][broken] == 0 {
					dist[nnx][nny][broken] = dist[nx][ny][broken] + 1
					q = append(q, pair{nnx, nny, broken})
				}
				if broken == 0 && graph[nnx][nny] == 1 && dist[nnx][nny][broken+1] == 0 {
					dist[nnx][nny][broken+1] = dist[nx][ny][broken] + 1
					q = append(q, pair{nnx, nny, broken + 1})
				}
			}
		}
	}
	if dist[n-1][m-1][0] != 0 && dist[n-1][m-1][1] != 0 {
		if dist[n-1][m-1][0] < dist[n-1][m-1][1] {
			return dist[n-1][m-1][0]
		}
		return dist[n-1][m-1][1]
	} else if dist[n-1][m-1][0] != 0 {
		return dist[n-1][m-1][0]
	} else if dist[n-1][m-1][1] != 0 {
		return dist[n-1][m-1][1]
	}
	return -1
}
