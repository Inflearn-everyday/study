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
	N   = 5000
	D   []int
	mod = 1_000_000_007
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	D = make([]int, N+1)
	D[0], D[2], D[4] = 1, 1, 2
	solve(N)
	T := scanInt()
	for ; T > 0; T-- {
		L := scanInt()
		fmt.Fprintln(w, D[L])
	}
}

func solve(n int) int {
	if n < 0 {
		return 0
	}
	if D[n] != 0 {
		return D[n]
	}
	for i := 2; i <= n; i += 2 {
		D[n] += (solve(i-2) * solve(n-i))
		D[n] %= mod
	}
	return D[n]
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
