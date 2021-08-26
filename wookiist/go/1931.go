package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

type pair struct {
	x int
	y int
}

func main() {
	defer w.Flush()
	var N int
	fmt.Fscanf(r, "%d\n", &N)
	meets := make([]pair, N)
	for i := range meets {
		fmt.Fscanf(r, "%d %d\n", &meets[i].x, &meets[i].y)
	}
	sort.SliceStable(meets, func(i, j int) bool {
		return meets[i].x < meets[j].x
	})
	sort.SliceStable(meets, func(i, j int) bool {
		return meets[i].y < meets[j].y
	})
	ny := meets[0].y
	result := 1
	for i := 1; i < N; i++ {
		if meets[i].x < ny {
			continue
		}
		ny = meets[i].y
		result++
	}
	fmt.Fprintln(w, result)
}
