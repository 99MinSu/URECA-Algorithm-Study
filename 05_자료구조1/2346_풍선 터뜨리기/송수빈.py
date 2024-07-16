N = int(input().strip())
papers = list(map(int, input().split()))

balloons = list(range(1, N+1))  # 풍선 번호를 1부터 N까지 생성
result = []
index = 0  

while balloons:
    # 현재 풍선의 번호를 결과에 추가
    result.append(balloons.pop(index))
    if not balloons:
        break
        
    steps = papers[result[-1] - 1]  # 방금 터뜨린 풍선의 종이에 적힌 숫자
    if steps > 0:
        index = (index + steps - 1) % len(balloons)  # 오른쪽으로 이동
    else:
        index = (index + steps) % len(balloons)  # 왼쪽으로 이동

print(' '.join(map(str, result)))
