import sys
x = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split()))  
arr = sorted(set(num)) #중복제거해서 dictionary에 삽입 
dict = {} 

for i in range(len(arr)):
    dict[arr[i]] = i

for i in num:
    print(dict[i], end=" ")
