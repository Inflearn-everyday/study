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
	var a, b int
	fmt.Fscanf(r, "%d %d\n", &a, &b)
	fmt.Fprintln(w, gcd(a, b))
	fmt.Fprintln(w, lcm(a, b))
}

func gcd(a, b int) int {
	for b > 0 {
		a, b = b, a%b
	}
	return a
}

func lcm(a, b int) int {
	return a * b / gcd(a, b)
}
