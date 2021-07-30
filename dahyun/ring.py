import fractions

N = int(input())
x_list = list( map(int, input().split()))
x = x_list[0]
for i in range(1,N):
    a = fractions.Fraction(x,x_list[i])
    if a.denominator == 1:
        print(f'{a.numerator}/1')
    else:
        print(a)
