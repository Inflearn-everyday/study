package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w       = bufio.NewWriter(os.Stdout)
	r       = bufio.NewReader(os.Stdin)
	isPrime []bool
)

func main() {
	defer w.Flush()
	isPrime = make([]bool, 246913)
	prime()
	var N int
	for {
		fmt.Fscanf(r, "%d\n", &N)
		if N == 0 {
			break
		}
		res := 0
		for i := N + 1; i <= 2*N; i++ {
			if isPrime[i] {
				res++
			}
		}
		fmt.Fprintln(w, res)
	}
}

func prime() {
	for i := range isPrime {
		isPrime[i] = true
	}
	isPrime[1] = false
	for i := 2; i <= 246912; i++ {
		if isPrime[i] {
			for j := i + i; j <= 246912; j += i {
				isPrime[j] = false
			}
		}
	}
}
