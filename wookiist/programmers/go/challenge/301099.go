import (
	"fmt"
	"sort"
	"strconv"
	"strings"
)

func solution(s string) string {
	words := strings.Fields(s)
	arr := make([]int, len(words))
	for i := range arr {
		arr[i], _ = strconv.Atoi(words[i])
	}
	sort.Ints(arr)
	return fmt.Sprintf("%d %d", arr[0], arr[len(arr)-1])
}
