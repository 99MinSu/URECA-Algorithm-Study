# 언어 : Python , (성공/실패) : 1/0, 메모리 : 31120 KB , 시간 : 5012 ms
m, n = map(int, input().split())

for i in range(m, n + 1):
    if i == 1:  # 1은 소수가 아니므로 제외
        continue
    
    # i가 소수인지 확인하기 위해 2부터 i의 제곱근까지 검사
    for j in range(2, int(i ** 0.5) + 1):
        if i % j == 0:  # 약수가 존재하므로 소수가 아님
            break  # 더 이상 검사할 필요가 없으므로 루프 종료
    else:
        # 위의 루프에서 break가 발생하지 않았다면 i는 소수
        print(i)  # 소수 출력
