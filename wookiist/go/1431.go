package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

var (
	w     = bufio.NewWriter(os.Stdout)
	sc    = bufio.NewScanner(os.Stdin)
	check map[string]int
)

func main() {
	defer w.Flush()
	N := scanInt()
	serials := make([]string, N)
	check = make(map[string]int)
	for i := range serials {
		serials[i] = scan()
	}
	sort.Slice(serials, func(i, j int) bool {
		if len(serials[i]) < len(serials[j]) {
			return true
		} else if len(serials[i]) > len(serials[j]) {
			return false
		} else {
			if checkInts(serials[i]) < checkInts(serials[j]) {
				return true
			} else if checkInts(serials[i]) > checkInts(serials[j]) {
				return false
			} else {
				if serials[i] < serials[j] {
					return true
				} else {
					return false
				}
			}
		}
	})
	for i := range serials {
		fmt.Fprintln(w, serials[i])
	}
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scan() string {
	sc.Scan()
	return sc.Text()
}

func checkInts(s string) int {
	if _, ok := check[s]; ok {
		return check[s]
	}
	res := 0
	for i := range s {
		if '0' <= rune(s[i]) && rune(s[i]) <= '9' {
			n, _ := strconv.Atoi(string(s[i]))
			res += n
		}
	}
	check[s] = res
	return res
}
