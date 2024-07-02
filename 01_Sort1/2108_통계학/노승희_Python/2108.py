# 언어 : Python , (성공/실패) : 1/0, 메모리 : 56412 KB , 시간 : 460 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
  arr.append(int(input()))

avg = round((sum(arr) / len(arr))) # 산술 평균
mid = sorted(arr)[len(arr) // 2] # 중앙값 : 정렬하고, 중앙에 있는 값
max_count = 0
max_min_diff = max(arr) - min(arr)

print(avg)
print(mid)

dict = {}
for a in arr:
  if a not in dict:
    dict[a] = 1
  else:
    dict[a] += 1

max_cnt = max(dict.values())
max_arr = sorted([k for k, v in dict.items() if v == max_cnt])

if len(max_arr) > 1:
  print(max_arr[1])
else:
  print(max_arr[0])

print(max_min_diff)