test_cases = int(input())

for _ in range(test_cases):
    n,m = list(map(int, input().split(" ")))
    imp = list(map(int, input().split(" ")))
     idx = list(range(len(imp)))
    idx[m] = 'target'
    order = 0
       
    for x in imp:
        if x==max(imp):
            order += 1
                           
            if idx[0]=='target':
                print(order)
                break
            else:
                imp.pop(0)
                idx.pop(0)

        else:
            imp.append(imp.pop(0))
            idx.append(idx.pop(0))
