package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

// Node struct
type Node struct {
	data  string
	left  *Node
	right *Node
}

// PreOrder func
func (n *Node) PreOrder() {
	if n == nil {
		return
	}
	fmt.Fprintf(w, "%s", n.data)
	n.left.PreOrder()
	n.right.PreOrder()
}

// InOrder func
func (n *Node) InOrder() {
	if n == nil {
		return
	}
	n.left.InOrder()
	fmt.Fprintf(w, "%s", n.data)
	n.right.InOrder()
}

// PostOrder func
func (n *Node) PostOrder() {
	if n == nil {
		return
	}
	n.left.PostOrder()
	n.right.PostOrder()
	fmt.Fprintf(w, "%s", n.data)
}

func main() {
	defer w.Flush()
	treeHash := make(map[string]*Node)
	var n int
	fmt.Fscanf(r, "%d\n", &n)
	for i := 0; i < n; i++ {
		text, _ := r.ReadString('\n')
		split := strings.Fields(text)
		if _, ok := treeHash[split[0]]; !ok {
			treeHash[split[0]] = &Node{data: split[0]}
		}
		for _, s := range split[1:] {
			if _, ok := treeHash[s]; !ok && s != "." {
				treeHash[s] = &Node{data: s}
			}
		}
		if split[1] != "." {
			treeHash[split[0]].left = treeHash[split[1]]
		}
		if split[2] != "." {
			treeHash[split[0]].right = treeHash[split[2]]
		}
	}
	treeHash["A"].PreOrder()
	fmt.Fprintln(w)
	treeHash["A"].InOrder()
	fmt.Fprintln(w)
	treeHash["A"].PostOrder()
}
