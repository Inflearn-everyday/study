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
	dx = [2]int{1, 0}
	dy = [2]int{0, 1}
	B  [][]string
)

func main() {
	defer w.Flush()
	N := scanInt()
	B = make([][]string, N)
	for i := range B {
		B[i] = scanBoard()
	}
	answer := 0
	for i := range B {
		for j := range B[i] {
			for k := range dx {
				ni, nj := i+dx[k], j+dy[k]
				if 0 <= ni && ni < N && 0 <= nj && nj < N {
					B[i][j], B[ni][nj] = B[ni][nj], B[i][j]
					sum := check()
					if answer < sum {
						answer = sum
					}
					B[i][j], B[ni][nj] = B[ni][nj], B[i][j]
				}
			}
		}
	}
	fmt.Fprintln(w, answer)
}

func check() int {
	answer := 1
	for i := range B {
		cnt := 1
		for j := 1; j < len(B); j++ {
			if B[i][j] == B[i][j-1] {
				cnt++
			} else {
				cnt = 1
			}
			if answer < cnt {
				answer = cnt
			}
		}
		cnt = 1
		for j := 1; j < len(B); j++ {
			if B[j][i] == B[j-1][i] {
				cnt++
			} else {
				cnt = 1
			}
			if answer < cnt {
				answer = cnt
			}
		}
	}
	return answer
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanBoard() []string {
	sc.Scan()
	s := strings.Split(sc.Text(), "")
	return s
}
