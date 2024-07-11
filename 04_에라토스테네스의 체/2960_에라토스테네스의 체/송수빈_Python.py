N, K = map(int, input().split())
count = 0  # 지워진 숫자의 개수
num = [True] * (N + 1)  # 0부터 N까지 리스트를 생성
#[True] * (N + 1)는 [True, True, True, ..., True] 이런 형태로 생성됨 

for i in range(2, N + 1):
    for j in range(i, N + 1, i):  # i의 배수로 증가
        if num[j]:  # j가 True이면 (즉, 아직 지워지지 않은 경우)
            num[j] = False  # j를 False로 바꾼다 (소수가 아님을 표시)
            count += 1  # 지운 횟수를 +1 해줌
            if count == K:  
                print(j)  
