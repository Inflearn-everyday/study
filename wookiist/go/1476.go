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
	var E, S, M, e, s, m int
	fmt.Fscanf(r, "%d %d %d\n", &E, &S, &M)
	for i := 1; i <= 7980; i++ {
		if e+1 > 15 {
			e = 1
		} else {
			e++
		}
		if s+1 > 28 {
			s = 1
		} else {
			s++
		}
		if m+1 > 19 {
			m = 1
		} else {
			m++
		}
		if e == E && s == S && m == M {
			fmt.Fprintln(w, i)
			break
		}
	}
}
