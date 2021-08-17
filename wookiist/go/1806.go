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

var (
	N, S, partialSum, start, end int
	A                            []int
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	N, S = scanInt(), scanInt()
	A = make([]int, N)
	for i := range A {
		A[i] = scanInt()
	}
	res := 100_003
	for {
		if partialSum >= S {
			partialSum -= A[start]
			start++
		} else if end == N {
			break
		} else {
			partialSum += A[end]
			end++
		}
		if partialSum >= S {
			res = min(res, end-start)
		}
	}
	if res != 100_003 {
		fmt.Fprintln(w, res)
	} else {
		fmt.Fprintln(w, 0)
	}
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
