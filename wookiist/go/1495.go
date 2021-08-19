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
	V  []int
	D  [][]bool
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	N, S, M := scanInt(), scanInt(), scanInt()
	V = make([]int, N+1)
	D = make([][]bool, N+1)
	D[0] = make([]bool, M+1)
	D[0][S] = true
	for i := 1; i <= N; i++ {
		V[i] = scanInt()
		D[i] = make([]bool, M+1)
	}
	for i := 0; i < N; i++ {
		for j := 0; j <= M; j++ {
			if D[i][j] {
				if j+V[i+1] <= M {
					D[i+1][j+V[i+1]] = true
				}
				if j-V[i+1] >= 0 {
					D[i+1][j-V[i+1]] = true
				}
			}
		}
	}
	result := 0
	isPossible := false
	for i := range D[N] {
		if D[N][i] {
			result = i
			isPossible = true
		}
	}b
	if isPossible {
		fmt.Fprintln(w, result)
	} else {
		fmt.Fprintln(w, -1)
	}
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
