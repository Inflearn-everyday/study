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
	var N int
	fmt.Fscanf(r, "%d\n", &N)

	q := make([]int, N)
	for i := 0; i < N; i++ {
		q[i] = i + 1
	}

	for len(q) != 1 {
		// pop
		q = q[1:]
		// pop
		p := q[0]
		q = q[1:]
		// push
		q = append(q, p)
	}

	fmt.Fprintf(w, "%d", q[0])
}
