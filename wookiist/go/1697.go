package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w        = bufio.NewWriter(os.Stdout)
	r        = bufio.NewReader(os.Stdin)
	distance []int
	visited  []bool
)

func main() {
	defer w.Flush()
	var N, K int
	fmt.Fscanf(r, "%d %d\n", &N, &K)
	distance = make([]int, 100001)
	visited = make([]bool, 100001)

	bfs(N, K)
	fmt.Fprintln(w, distance[K])
}

func bfs(v, k int) {
	q := []int{v}
	visited[v] = true
	for len(q) != 0 {
		n := q[0]
		q = q[1:]
		if n-1 >= 0 {
			if !visited[n-1] {
				q = append(q, n-1)
				visited[n-1] = true
				distance[n-1] = distance[n] + 1
			}
		}
		if n+1 < 100001 {
			if !visited[n+1] {
				q = append(q, n+1)
				visited[n+1] = true
				distance[n+1] = distance[n] + 1
			}
		}
		if 2*n < 100001 {
			if !visited[2*n] {
				q = append(q, 2*n)
				visited[2*n] = true
				distance[2*n] = distance[n] + 1
			}
		}
	}
}
