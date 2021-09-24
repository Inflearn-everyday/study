package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	w := bufio.NewWriter(os.Stdout)
	r := bufio.NewReader(os.Stdin)
	defer w.Flush()

	var x, y int
	fmt.Fscanln(r, &x)
	fmt.Fscanln(r, &y)
	if x > 0 && y > 0 {
		fmt.Fprintln(w, "1")
	} else if x > 0 && y < 0 {
		fmt.Fprintln(w, "4")
	} else if x < 0 && y > 0 {
		fmt.Fprintln(w, "2")
	} else {
		fmt.Fprintln(w, "3")
	}
}
