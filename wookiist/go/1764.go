package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strings"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

func main() {
	defer w.Flush()
	var N, M, result int
	fmt.Fscanf(r, "%d %d\n", &N, &M)
	dArr := make([]string, N)
	bArr := make([]string, M)
	aArr := make([]string, 0)
	for i := range dArr {
		s, _ := r.ReadString('\n')
		dArr[i] = strings.TrimSuffix(s, "\n")
	}
	sort.Slice(dArr, func(i, j int) bool {
		return dArr[i] < dArr[j]
	})
	for i := range bArr {
		s, _ := r.ReadString('\n')
		bArr[i] = strings.TrimSuffix(s, "\n")
	}
	sort.Slice(bArr, func(i, j int) bool {
		return bArr[i] < bArr[j]
	})
	for i := range bArr {
		if binarySearch(bArr[i], dArr) {
			result++
			aArr = append(aArr, bArr[i])
		}
	}
	fmt.Fprintln(w, result)
	for i := range aArr {
		fmt.Fprintln(w, aArr[i])
	}
}

func binarySearch(s string, arr []string) bool {
	left := 0
	right := len(arr)
	for left <= right {
		mid := (left + right) / 2
		if mid >= len(arr) {
			return false
		}
		if arr[mid] == s {
			return true
		} else if arr[mid] < s {
			left = mid + 1
		} else {
			right = mid - 1
		}
	}
	return false
}
