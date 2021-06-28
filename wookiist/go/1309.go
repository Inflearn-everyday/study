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
	D [][]int
)

func main() {
	defer w.Flush()
	fmt.Fscanf(r, "%d\n", &N)
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, 3)
	}
	D[1][0] = 1
	D[1][1] = 1
	D[1][2] = 1
	for i := 2; i <= N; i++ {
		D[i][0] = (D[i-1][0] + D[i-1][1] + D[i-1][2]) % 9901
		D[i][1] = (D[i-1][0] + D[i-1][2]) % 9901
		D[i][2] = (D[i-1][0] + D[i-1][1]) % 9901
	}
	fmt.Fprintln(w, (D[N][0]+D[N][1]+D[N][2])%9901)
}
