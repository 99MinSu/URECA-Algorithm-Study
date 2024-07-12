# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 40 ms
import sys
input = sys.stdin.readline

def isPrime(N, K):
    num = [False] * (N + 1)
    num_cnt = []  # 지워진 숫자를 순서대로 저장할 리스트

    for i in range(2, N + 1):
        if not num[i]:
            # i의 배수들을 소수가 아니라고 표시
            for j in range(i, N + 1, i): 
                if not num[j]:
                    num[j] = True # 소수가 아니므로 True로 설정
                    num_cnt.append(j) # 지워진 숫자를 리스트에 추가
                    if len(num_cnt) == K: # K번째 지워진 숫자 찾으면
                        return num_cnt[K-1] # 반환

N, K = map(int, input().rstrip().split())
result = isPrime(N, K)

print(result)