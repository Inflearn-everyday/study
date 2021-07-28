package main

import (
	"bufio"
	"fmt"
	"os"
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
	N := scanInt()
	A := make(map[int]int)
	for i := 0; i < N; i++ {
		n := scanInt()
		if _, ok := A[n]; !ok {
			A[n] = i
		}
	}
	target := scanInt()
	answer := 0
	for key := range A {
		if key >= target {
			continue
		}
		if val, ok := A[target-key]; ok && target-key != key && A[key] < val {
			answer++
		}
	}
	fmt.Fprintln(w, answer)
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
