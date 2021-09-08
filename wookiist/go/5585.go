package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

func main() {
	defer w.Flush()
	var N, cnt int
	coins := []int{500, 100, 50, 10, 5, 1}
	fmt.Fscanf(r, "%d\n", &N)
	N = 1000 - N

	for i := range coins {
		if N/coins[i] != 0 {
			t := N / coins[i]
			N -= t * coins[i]
			cnt += t
		}
	}
	fmt.Fprintf(w, "%d\n", cnt)
}
