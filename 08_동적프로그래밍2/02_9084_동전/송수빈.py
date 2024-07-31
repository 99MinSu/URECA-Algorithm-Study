for _ in range(int(input())):
    n = int(input()) #동전의 가지수 
    coins = list(map(int, input().split())) # 동전 금액 
    m = int(input()) #목표 금액 

    table = [0] * (m + 1) #배열 m까지의 방법의 수를 저장하기 위해서는 크기가 m+1인 배열이 필요 , 일단 0으로 초기화
    table[0] = 1 #초기 상태에서 table[0] = 1로 설정(금액 0을 만드는 방법은 1개이기 때문) #[1,x,x,x,x,x...]
    for i in range(n):
        k = coins[i] #현재 동전의 값
        for j in range(k, m+1): #k부터 목표금액 m까지 table[j] = j를 만들 수 있는 방법의 수
            table[j] += table[j-k]

    print(table[-1])
  
