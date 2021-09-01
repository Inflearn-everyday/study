package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
	N int
	D []int
)

func main() {
	defer w.Flush()
	fmt.Fscanf(r, "%d\n", &N)
	if N%2 != 0 {
		fmt.Fprintln(w, 0)
		return
	}
	D = make([]int, N+1)
	D[0] = 1
	for i := 2; i <= N; i++ {
		D[i] = 3 * D[i-2]
		for j := 4; j <= i; j += 2 {
			D[i] += 2 * D[i-j]
		}
	}
	fmt.Fprintln(w, D[N])
}
