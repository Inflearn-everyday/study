package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	w   = bufio.NewWriter(os.Stdout)
	r   = bufio.NewReader(os.Stdin)
	max int
	min int
)

type opers struct {
	plus, minus, mul, div int
}

func main() {
	defer w.Flush()
	var N int
	fmt.Fscanf(r, "%d\n", &N)
	min = 1000000000
	max = -1000000000
	nums := getInts()
	oper := getOpers()
	solve(0, 0, oper, nums)
	fmt.Fprintln(w, max)
	fmt.Fprintln(w, min)
}

func solve(idx, sum int, oper opers, nums []int) {
	if idx >= len(nums) {
		return
	}
	if oper.plus > 0 {
		oper.plus--
		if idx == 0 {
			solve(idx+1, nums[idx]+nums[idx+1], oper, nums)
		} else {
			solve(idx+1, sum+nums[idx+1], oper, nums)
		}
		oper.plus++
	}
	if oper.minus > 0 {
		oper.minus--
		if idx == 0 {
			solve(idx+1, nums[idx]-nums[idx+1], oper, nums)
		} else {
			solve(idx+1, sum-nums[idx+1], oper, nums)
		}
		oper.minus++
	}
	if oper.mul > 0 {
		oper.mul--
		if idx == 0 {
			solve(idx+1, nums[idx]*nums[idx+1], oper, nums)
		} else {
			solve(idx+1, sum*nums[idx+1], oper, nums)
		}
		oper.mul++
	}
	if oper.div > 0 {
		oper.div--
		if idx == 0 {
			sum = nums[idx] / nums[idx+1]
		} else {
			if sum < 0 {
				sum = (-1) * sum / nums[idx+1]
				sum *= -1
			} else {
				sum = sum / nums[idx+1]
			}
		}
		solve(idx+1, sum, oper, nums)
		oper.div++
	}
	if idx == len(nums)-1 {
		if max < sum {
			max = sum
		}
		if min > sum {
			min = sum
		}
	}
}

func getInts() []int {
	s, _ := r.ReadString('\n')
	s = strings.TrimSuffix(s, "\n")
	t := strings.Fields(s)
	res := make([]int, len(t))
	for i := range t {
		res[i], _ = strconv.Atoi(t[i])
	}
	return res
}

func getOpers() opers {
	nums := getInts()
	return opers{
		plus:  nums[0],
		minus: nums[1],
		mul:   nums[2],
		div:   nums[3],
	}
}
