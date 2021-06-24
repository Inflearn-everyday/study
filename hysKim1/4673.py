#4673   셀프넘버
def self_number(num):
    self_num = num
    while num != 0:
        self_num += num % 10
        num //= 10
    return self_num


result = []

for i in list(range(1, 10001)):
    result.append(self_number(i))
    if i not in result:
        print(i)