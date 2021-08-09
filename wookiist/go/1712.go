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
)

func main() {
	defer w.Flush()
	a, b, c := getIntArray()
	if c <= b {
		fmt.Fprintf(w, "%d\n", -1)
	} else {
		m := c - b
		q := a/m + 1
		fmt.Fprintf(w, "%d\n", q)
	}
}

func getIntArray() (int, int, int) {
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	split := strings.Split(s, " ")
	a, _ := strconv.Atoi(split[0])
	b, _ := strconv.Atoi(split[1])
	c, _ := strconv.Atoi(split[2])
	return a, b, c
}
