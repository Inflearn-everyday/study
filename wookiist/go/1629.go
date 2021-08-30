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

func main() {
	defer w.Flush()
	A, B, C := scanInt(), scanInt(), scanInt()
	fmt.Fprintln(w, solve(A, B, C))
}

func solve(a, b, c int) int {
	if b == 1 {
		return a % c
	}
	if b%2 == 0 {
		temp := solve(a, b/2, c)
		return (temp * temp) % c
	}
	return (solve(a, b/2, c) * solve(a, b/2+1, c)) % c
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
