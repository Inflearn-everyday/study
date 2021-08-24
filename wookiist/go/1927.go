package main

import (
	"bufio"
	"container/heap"
	"fmt"
	"os"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

type IntHeap []int

func (h *IntHeap) Len() int {
	return len(*h)
}

func (h *IntHeap) Less(i, j int) bool {
	return (*h)[i] < (*h)[j]
}

func (h *IntHeap) Swap(i, j int) {
	(*h)[i], (*h)[j] = (*h)[j], (*h)[i]
}

func (h *IntHeap) Push(e interface{}) {
	*h = append(*h, e.(int))
}

func (h *IntHeap) Pop() interface{} {
	old := *h
	l := len(old)
	e := old[l-1]
	*h = old[:l-1]
	return e
}

func main() {
	defer w.Flush()
	h := &IntHeap{}
	heap.Init(h)
	var N, x int
	fmt.Fscanf(r, "%d\n", &N)
	for i := 0; i < N; i++ {
		fmt.Fscanf(r, "%d\n", &x)
		if x == 0 {
			if h.Len() != 0 {
				fmt.Fprintln(w, heap.Pop(h))
			} else {
				fmt.Fprintln(w, 0)
			}
		} else {
			heap.Push(h, x)
		}
	}
}
