import sys
input = sys.stdin.readline

n, d, k, c = map(int, input().split())

sushi = []
for _ in range(n):
    sushi.append(int(input()))
check_dish = [0 for _ in range(d+1)]

count = 0
for i in range(k):
    if check_dish[sushi[i]] == 0:
        count += 1
    check_dish[sushi[i]] += 1

    if check_dish[c] == 0:
        answer = count + 1

    else:
        answer = count

for i in range(k, n + k - 1):
    if check_dish[sushi[i % n]] == 0:
        count += 1
    check_dish[sushi[i % n]] += 1

    if check_dish[sushi[i - k]] == 1:
        count -= 1

    check_dish[sushi[i - k]] -= 1

    if check_dish[c] == 0:
        answer = max(answer, count + 1)

    else:
        answer = max(answer, count)

print(answer)
