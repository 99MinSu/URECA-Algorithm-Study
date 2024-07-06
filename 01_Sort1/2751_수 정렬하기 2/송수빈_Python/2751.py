#수 정렬하기2
import sys

input = sys.stdin.read
output = sys.stdout.write

data = input().split()
num = int(data[0]) #수의 개수 
arr = list(map(int, data[1:num+1])) #리스트 형태로 입력받기 

arr.sort() #정렬 

# 모든 출력을 하나의 문자열로 모아서 출력
result = "\n".join(map(str, arr)) + "\n"
output(result)


