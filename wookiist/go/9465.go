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
	N  int
	S1 []int
	S2 []int
	D  [][]int
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	T := scanInt()
	for ; T > 0; T-- {
		solve()
	}
}

func solve() {
	N = scanInt()
	S1 = make([]int, N+1)
	for i := 1; i <= N; i++ {
		S1[i] = scanInt()
	}
	S2 = make([]int, N+1)
	for i := 1; i <= N; i++ {
		S2[i] = scanInt()
	}
	D = make([][]int, N+1)
	for i := range D {
		D[i] = make([]int, 3)
	}

	// D[i][j] = i번째 스티커를 마지막으로 할 때 j(0 = 선택x , 1=위선택, 2=아래선택)  했을 때 점수의 최대합.
	for i := 1; i <= N; i++ {
		D[i][0] = max(D[i-1][0], D[i-1][1], D[i-1][2])
		// 위 선택하려면 직전엔 선택 안하거나, 아래를 선택
		D[i][1] = max(D[i-1][0], D[i-1][2]) + S1[i]
		D[i][2] = max(D[i-1][0], D[i-1][1]) + S2[i]
	}
	fmt.Fprintln(w, max(D[N][0], D[N][1], D[N][2]))
}

func max(arr ...int) int {
	res := arr[0]
	for i := range arr {
		if res < arr[i] {
			res = arr[i]
		}
	}
	return res
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}
