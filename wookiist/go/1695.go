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
	D [][]int
	A []int
	B []int
)

func main() {
	defer w.Flush()
	N = scanInt()
	A = scanInts()
	B = reverse(A)
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, N+1)
	}
	for i := 1; i <= N; i++ {
		for j := 1; j <= N; j++ {
			if A[i] == B[j] {
				D[i][j] = D[i-1][j-1] + 1
			} else {
				if D[i-1][j] > D[i][j-1] {
					D[i][j] = D[i-1][j]
				} else {
					D[i][j] = D[i][j-1]
				}
			}
		}
	}
	fmt.Fprintln(w, N-D[N][N])
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanInts() []int {
	sc.Scan()
	t := strings.Fields("0 " + sc.Text())
	res := make([]int, len(t))
	for i := range t {
		res[i], _ = strconv.Atoi(t[i])
	}
	return res
}

func reverse(arr []int) []int {
	res := make([]int, len(arr))
	res[0] = 0
	for i := 1; i < len(arr); i++ {
		res[i] = arr[len(arr)-i]
	}
	return res
}
