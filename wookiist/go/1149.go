package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
	R []int
	G []int
	B []int
	D [][]int
)

func main() {
	defer w.Flush()
	var N int
	fmt.Fscanf(r, "%d\n", &N)
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, 3)
	}
	R = make([]int, N+1)
	G = make([]int, N+1)
	B = make([]int, N+1)
	for i := 1; i <= N; i++ {
		getInts(i)
	}
	for i := 1; i <= N; i++ {
		for c := 0; c < 3; c++ {
			switch c {
			case 0:
				D[i][c] = min(D[i-1][1], D[i-1][2]) + R[i]
			case 1:
				D[i][c] = min(D[i-1][0], D[i-1][2]) + G[i]
			case 2:
				D[i][c] = min(D[i-1][0], D[i-1][1]) + B[i]
			}
		}
	}
	fmt.Fprintln(w, min(D[N][0], D[N][1], D[N][2]))
}

func getInts(idx int) {
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	t := strings.Fields(s)
	R[idx], _ = strconv.Atoi(t[0])
	G[idx], _ = strconv.Atoi(t[1])
	B[idx], _ = strconv.Atoi(t[2])
}

func min(nums ...int) int {
	res := nums[0]
	for i := range nums {
		if res > nums[i] {
			res = nums[i]
		}
	}
	return res
}
