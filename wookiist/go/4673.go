// 4673 go

// 주석 처리한 부분으로 사용하면 6292KB, 72ms
// 주석이 해제된 부분으로 사용하면 968KB, 8ms :()
package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	w          = bufio.NewWriter(os.Stdout)
	notSelfNum = make([]bool, 10001)
)

func main() {
	defer w.Flush()
	for i := 1; i < 10001; i++ {
		notSelfNum[i] = true
	}

	for i := 1; i < 10001; i++ {
		if notSelfNum[i] {
			isSelfNum(i)
		}
	}
	for i := 1; i < 10001; i++ {
		if notSelfNum[i] {
			fmt.Fprintln(w, i)
		}
	}
}

func isSelfNum(n int) {
	org, res := n, 0
	for n > 0 {
		res += n % 10
		n = n / 10
	}
	res += org
	if res > 10000 {
		return
	}
	notSelfNum[res] = false
	isSelfNum(res)
	// x := fmt.Sprintf("%d", n)
	// for a > 0 {
	// 	res += a % 10
	// 	a = a / 10
	// }
	// xSum := 0
	// for _, v := range x {
	// 	t, _ := strconv.Atoi(string(v))
	// 	xSum += t
	// }
	// if n+xSum > 10000 {
	// 	return
	// }
	// notSelfNum[n+xSum] = false
	// isSelfNum(n + xSum)
}
