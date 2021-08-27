package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w    = bufio.NewWriter(os.Stdout)
	r    = bufio.NewReader(os.Stdin)
	D    [][]int
	N, K int
)

func main() {
	defer w.Flush()
	fmt.Fscanf(r, "%d %d\n", &N, &K)
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, K+1)
	}
	for i := 0; i <= N; i++ {
		for j := 1; j <= K; j++ {
			for k := 0; k <= i; k++ {
				if j == 1 {
					D[i][j] = 1
					continue
				}
				D[i][j] += D[i-k][j-1] % 1000000000
				// fmt.Fprintf(w, "D[%d][%d] += D[%d-%d][%d-1]  <= %d += %d\n", i, j, i, k, j, D[i][j], D[i-k][j-1])
			}
		}
	}
	fmt.Fprintln(w, D[N][K]%1000000000)
}
