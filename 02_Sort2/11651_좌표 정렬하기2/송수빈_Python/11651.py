import sys
input = sys.stdin.readline

num = int(input());
arr = [] 
for _ in range(num):   
    arr.append(list(map(int,input().split())))
    
arr = sorted(arr, key=lambda x:(x[0], x[1]))

for x, y in arr:
    print(x, y)
