def self_num(n):
    ans = n
    for i in str(n):
        ans += int(i)
    return ans

all_nums = set(range(1,10001))
out_nums = set()

for a in range(1,10001):
    out_nums.add(self_num(a))

result = sorted(all_nums - out_nums)

for i in result:
    print(i)
