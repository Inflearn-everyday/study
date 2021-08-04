package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w      = bufio.NewWriter(os.Stdout)
	r      = bufio.NewReader(os.Stdin)
	check  []bool
	result []int
)

func solve(idx, n, m int) {
	if idx == m {
		for i := 0; i < len(result); i++ {
			fmt.Fprintf(w, "%d ", result[i])
		}
		fmt.Fprintln(w)
		return
	}
	for i := 1; i <= n; i++ {
		if check[i] {
			continue
		}
		result[idx] = i
		check[i] = true
		solve(idx+1, n, m)
		check[i] = false
	}
}

func main() {
	defer w.Flush()
	s, _ := r.ReadString('\n')
	t := strings.Fields(s)
	N, _ := strconv.Atoi(t[0])
	M, _ := strconv.Atoi(t[1])
	check = make([]bool, N+1)
	result = make([]int, M)
	solve(0, N, M)
}
