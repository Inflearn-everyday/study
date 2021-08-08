package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

func main() {
	defer w.Flush()
	var N int
	fmt.Fscanf(r, "%d\n", &N)
	arr := getDigits(N)
	if checkDiv(N, arr) {
		fmt.Fprintln(w, N)
		return
	}
	newZero := 10
	newNum := 0
	for {
		if newNum == newZero {
			newZero *= 10
			newNum = 0
		}
		now := N*newZero + newNum
		if checkDiv(now, arr) {
			fmt.Fprintln(w, now)
			break
		}
		newNum++
	}
}

func getDigits(n int) []int {
	arr := make([]int, 0, 10)
	for n > 0 {
		if x := n % 10; x != 0 {
			arr = append(arr, x)
		}
		n /= 10
	}
	return arr
}

func checkDiv(n int, arr []int) bool {
	for i := range arr {
		if n%arr[i] != 0 {
			return false
		}
	}
	return true
}
