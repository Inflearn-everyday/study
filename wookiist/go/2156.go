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
	P []int
	D [][]int
)

func main() {
	defer w.Flush()
	fmt.Fscanf(r, "%d\n", &N)
	P = make([]int, N+1)
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, 3)
		if i != 0 {
			fmt.Fscanf(r, "%d\n", &P[i])
		}
	}
	for i := 1; i <= N; i++ {
		if i == 1 {
			D[i][0] = 0
			D[i][1] = P[i]
			D[i][2] = P[i]
		}
		if i == 2 {
			D[i][1] = P[i]
		}
		if i > 1 {
			D[i][0] = max(D[i-1])
			D[i][2] = D[i-1][1] + P[i]
		}
		if i > 2 {
			D[i][1] = max(D[i-2]) + P[i]
		}
	}
	fmt.Fprintln(w, max(D[N]))
}

func max(arr []int) int {
	res := arr[0]
	for i := range arr {
		if res < arr[i] {
			res = arr[i]
		}
	}
	return res
}
