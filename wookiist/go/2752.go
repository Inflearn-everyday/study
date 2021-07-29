package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	A := make([]int, 3)
	for i := range A {
		A[i] = scanInt()
	}
	sort.Ints(A)
	for i := range A {
		fmt.Fprintf(w, "%d ", A[i])
	}
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
