package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
	d []int
)

func main() {
	defer w.Flush()
	var T, n int
	d = make([]int, 11)
	fmt.Fscanf(r, "%d\n", &T)
	for i := 0; i < T; i++ {
		fmt.Fscanf(r, "%d\n", &n)
		fmt.Fprintln(w, dp(n))
	}
}

func dp(n int) int {
	d[1] = 1
	d[2] = 2
	d[3] = 4
	if d[n] != 0 {
		return d[n]
	}
	for i := 4; i <= 10; i++ {
		d[i] = d[i-1] + d[i-2] + d[i-3]
	}
	return d[n]
}
