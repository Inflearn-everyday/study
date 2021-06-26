package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

var (
	N int
	A []int
	D []int // i 번째 수를 마지막으로 할 때 가장 긴 증가하는 부분 수열의 길이
)

func main() {
	defer w.Flush()
	N = scanInt()
	A = scanGraph()
	D = make([]int, N+1)
	for i := range D {
		D[i] = 1 // 항상 모든 자리는 1이 되어야 한다.
	}
	for i := 1; i <= N; i++ {
		for j := i - 1; j > 0; j-- {
			if A[i] > A[j] {
				D[i] = max(D[j]+1, D[i])
			}
		}
	}
	res := D[1]
	for i := 1; i <= N; i++ {
		if res < D[i] {
			res = D[i]
		}
	}
	fmt.Fprintln(w, res)
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanGraph() []int {
	sc.Scan()
	s := strings.Split("0 "+sc.Text(), " ")
	res := make([]int, len(s))
	for i := range s {
		res[i], _ = strconv.Atoi(s[i])
	}
	return res
}
