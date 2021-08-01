func solution(n int, a int, b int) int {
	answer := 0
	for {
		answer++
		if check(a, b) {
			return answer
		}
		if check(b, a) {
			return answer
		}
		a = nextLevel(a)
		b = nextLevel(b)
	}
}

func check(n1, n2 int) bool {
	if n1%2 == 0 {
		if n1-1 == n2 {
			return true
		}
	}
	return false
}

func nextLevel(n int) int {
	if n%2 == 0 {
		return n / 2
	}
	return (n + 1) / 2
}
