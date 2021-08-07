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
	b, _ := r.ReadBytes('\n')
	b = b[:len(b)-1]
	fmt.Fprintln(w, hashing(b))
}

func hashing(b []byte) int64 {
	res := int64(0)
	sq := int64(1)
	for i := range b {
		res = (res + (int64(b[i])-int64(96))*int64(sq)) % int64(1234567891)
		sq = (sq * 31) % int64(1234567891)
	}
	return res
}
