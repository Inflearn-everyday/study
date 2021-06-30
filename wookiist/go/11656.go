package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	D []string
)

func main() {
	defer w.Flush()
	sc.Scan()
	S := sc.Text()
	D = make([]string, len(S))
	for i := range S {
		D[i] = S[i:]
	}
	sort.Slice(D, func(i, j int) bool {
		return D[i] < D[j]
	})
	for i := range D {
		fmt.Fprintln(w, D[i])
	}
}
