N = int(input())  # 로프 개수
num = []

for _ in range(N):
    num.append(int(input()))  # input() 호출

num.sort(reverse=True)  # 내림차순 정렬

result = []
for i in range(N):
    weight = num[i] * (i + 1)
    result.append(weight)

print(max(result))
