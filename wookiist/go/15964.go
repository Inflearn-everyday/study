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
	var A, B int64
	fmt.Fscanf(r, "%d %d\n", &A, &B)
	fmt.Fprintln(w, (A+B)*(A-B))
}
