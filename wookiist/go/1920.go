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

var (
	A []int
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	N := scanInt()
	A = make([]int, N)
	for i := range A {
		A[i] = scanInt()
	}
	sort.Ints(A)
	M := scanInt()
	for i := 0; i < M; i++ {
		t := scanInt()
		if res := binarySearch(0, N-1, t); res != -1 {
			fmt.Fprintln(w, 1)
		} else {
			fmt.Fprintln(w, 0)
		}
	}
}

func binarySearch(start, end, target int) int {
	if start > end {
		return -1
	}
	mid := (start + end) / 2
	if A[mid] > target {
		return binarySearch(start, mid-1, target)
	} else if A[mid] < target {
		return binarySearch(mid+1, end, target)
	}
	return mid
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
