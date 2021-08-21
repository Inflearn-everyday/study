package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var (
	w     = bufio.NewWriter(os.Stdout)
	r     = bufio.NewReader(os.Stdin)
	black = [][]string{
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
	}
	white = [][]string{
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"B", "W", "B", "W", "B", "W", "B", "W"},
	}
)

func main() {
	defer w.Flush()
	var N, M int
	fmt.Fscanf(r, "%d %d\n", &N, &M)
	arr := make([][]string, N)
	result := 999999999
	for i := range arr {
		arr[i] = getString()
	}
	for i := 0; i+7 < N; i++ {
		for j := 0; j+7 < M; j++ {
			blackCount := checkBlack(i, j, &arr)
			whiteCount := checkWhite(i, j, &arr)
			if blackCount >= whiteCount {
				if result >= whiteCount {
					result = whiteCount
				}
			} else {
				if result >= blackCount {
					result = blackCount
				}
			}
		}
	}
	fmt.Fprintln(w, result)
}

func getString() []string {
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	t := strings.Split(s, "")
	return t
}

func checkBlack(x, y int, arr *[][]string) int {
	var result int
	for i := x; i < x+8; i++ {
		for j := y; j < y+8; j++ {
			if (*arr)[i][j] != black[i-x][j-y] {
				result++
			}
		}
	}
	return result
}

func checkWhite(x, y int, arr *[][]string) int {
	var result int
	for i := x; i < x+8; i++ {
		for j := y; j < y+8; j++ {
			if (*arr)[i][j] != white[i-x][j-y] {
				result++
			}
		}
	}
	return result
}
