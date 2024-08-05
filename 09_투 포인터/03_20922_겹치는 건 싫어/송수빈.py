import sys
input = sys.stdin.readline

N, K = map(int, input().split()) #K가 기준 
each = list(map(int, input().split()))

left, right = 0, 0
answer = 0 #조건을 만족하는 가장 긴 부분 배열의 길이를 저장

cnt = [0] * (max(each)+1) #중복 원소의 개수를 세기 위함 * 일단  0으로 초기화 

while right < N:
    if cnt[each[right]] < K:
        cnt[each[right]] += 1
        right += 1
    else:
        cnt[each[left]] -= 1
        left += 1
    answer = max(answer, right-left)

print(answer) 
