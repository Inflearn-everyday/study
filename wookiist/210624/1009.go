package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w      = bufio.NewWriter(os.Stdout)
	r      = bufio.NewReader(os.Stdin)
	disMap = map[int][]int{
		0: {10},
		1: {1},
		2: {2, 4, 8, 6},
		3: {3, 9, 7, 1},
		4: {4, 6},
		5: {5},
		6: {6},
		7: {7, 9, 3, 1},
		8: {8, 4, 2, 6},
		9: {9, 1},
	}
)

func main() {
	defer w.Flush()
	var T, a, b int
	fmt.Fscanf(r, "%d\n", &T)
	for i := 0; i < T; i++ {
		fmt.Fscanf(r, "%d %d\n", &a, &b)
		a %= 10
		l := len(disMap[a])
		fmt.Fprintln(w, disMap[a][(b-1)%l])
	}
}
