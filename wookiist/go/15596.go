package main

func sum(a []int) int {
	var r int
	for _, a := range a {
		r += a
	}
	return r
}
