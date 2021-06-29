package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

type student struct {
	name                  string
	korean, english, math int
}

var (
	w  = bufio.NewWriter(os.Stdout)
	sc = bufio.NewScanner(os.Stdin)
)

func init() {
	sc.Split(bufio.ScanWords)
}

func main() {
	defer w.Flush()
	N := scanInt()
	A := make([]student, N)
	for i := range A {
		newStudent := student{
			name:    scanString(),
			korean:  scanInt(),
			english: scanInt(),
			math:    scanInt(),
		}
		A[i] = newStudent
	}
	sort.Slice(A, func(i, j int) bool {
		if A[i].korean == A[j].korean {
			if A[i].english == A[j].english {
				if A[i].math == A[j].math {
					return A[i].name < A[j].name
				} else {
					return A[i].math > A[j].math
				}
			} else {
				return A[i].english < A[j].english
			}
		} else {
			return A[i].korean > A[j].korean
		}
	})
	for i := range A {
		fmt.Fprintln(w, A[i].name)
	}
}

func scanInt() int {
	sc.Scan()
	n, _ := strconv.Atoi(sc.Text())
	return n
}

func scanString() string {
	sc.Scan()
	return sc.Text()
}
