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
	w       = bufio.NewWriter(os.Stdout)
	r       = bufio.NewReader(os.Stdin)
	arr     []int
	seq     []int
	visited []bool
)

func main() {
	defer w.Flush()
	var N, M int
	fmt.Fscanf(r, "%d %d\n", &N, &M)
	getString()
	visited = make([]bool, N)
	seq = make([]int, M)
	sort.Slice(arr, func(i, j int) bool {
		return arr[i] < arr[j]
	})
	solve(0, N, M)
}

func getString() {
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	t := strings.Fields(s)
	arr = make([]int, len(t))
	for i := range t {
		arr[i], _ = strconv.Atoi(t[i])
	}
}

func solve(idx, n, m int) {
	if idx == m {
		for i := range seq {
			fmt.Fprintf(w, "%d ", seq[i])
		}
		w.WriteByte('\n')
		return
	}
	for i := 0; i < n; i++ {
		if !visited[i] {
			visited[i] = true
			seq[idx] = arr[i]
			solve(idx+1, n, m)
			visited[i] = false
		}
	}
}
