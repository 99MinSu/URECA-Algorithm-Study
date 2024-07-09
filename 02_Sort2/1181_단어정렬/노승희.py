# 언어 : Python , (성공/실패) : 1/0, 메모리 : 35732 KB , 시간 : 60 ms
import sys
input = sys.stdin.readline

N = int(input())
arr = []

# 단어 입력 받기
for i in range(N):
  arr.append(input().rstrip())

arr = list(set(arr)) # set을 사용하여 중복된 단어를 제거
arr.sort(key=lambda word: (len(word), word)) # 정렬: 길이 우선, 길이가 같으면 사전 순

# 정렬된 단어 출력
for i in arr:
  print(i)