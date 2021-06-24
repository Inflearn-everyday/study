#2675   문자열 반복
for i in range(int(input())):
    n,string= input().split( )
    for j in list(string):
        print(j*int(n), end='')
    print()   