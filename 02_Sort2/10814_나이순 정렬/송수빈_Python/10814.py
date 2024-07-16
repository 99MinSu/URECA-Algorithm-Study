N = int(input()) #회원 수
info = [] #회원들 정보

for _ in range(N):
    age, name = input().split() #나이 이름 받기
    info.append([int(age), name])

info.sort(key=lambda x:int(x[0])) #나이 기준으로 정렬 
for i in info:
    print(i)

