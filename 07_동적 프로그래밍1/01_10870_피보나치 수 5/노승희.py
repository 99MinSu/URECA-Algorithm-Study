# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 40 ms
def fibo(n):
    if n <= 1:
        return n
    return fibo(n-1) + fibo(n-2)	# 앞 두 수의 합

n = int(input())
print(fibo(n))