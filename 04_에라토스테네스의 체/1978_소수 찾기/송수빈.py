n = int(input())
numbers = map(int, input().split())
cnt = 0
for num in numbers:
    not_primes = 0 #소수가 아닌 경우 = 0 
    if num > 1: #소수인 경우 
        for i in range(2, num):
            if num % i == 0:#소수가 아닌 경우
                not_primes += 1
        if not_primes == 0:
            cnt += 1
print(cnt)

	
