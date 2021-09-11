package main

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strings"
)

var (
	w = bufio.NewWriter(os.Stdout)
	r = bufio.NewReader(os.Stdin)
)

func main() {
	defer w.Flush()
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	for i := 'a'; i <= 'z'; i++ {
		r, _ := regexp.Compile(string(i))
		fmt.Fprintf(w, "%d ", len(r.FindAllString(s, -1)))
	}
}

/*
package main

import (
	"bufio"
	"os"
	"strconv"
)

func main() {
	alpha := make([]int, 26)

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()

	for _, v := range scanner.Bytes() {
		alpha[v-'a']++
	}

	wr := bufio.NewWriter(os.Stdout)
	defer wr.Flush()
	for _, v := range alpha {
		wr.WriteString(strconv.Itoa(v))
		wr.WriteByte(' ')
	}
}
*/
