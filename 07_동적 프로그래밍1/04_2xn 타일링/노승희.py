# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31252 KB , 시간 : 44 ms
n = int(input())
arr = [0, 1, 2]

for i in range(3, n+1):
    arr.append(arr[i-1] + arr[i-2])
    
print(arr[n] % 10007)