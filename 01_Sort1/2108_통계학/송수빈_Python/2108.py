import sys
input = sys.stdin.readline
from collections import Counter 

N = int(input()) #숫자 개수
numbers = []

for i in range(N):
    number = int(input())
    numbers.append(number)

numbers.sort() #정렬 
avg = round(sum(numbers) / len(numbers))
mid = numbers[len(numbers) // 2] 
print(avg)
print(mid) 

counter = Counter(numbers)
most_common = counter.most_common()

max_frequency = most_common[0][1]
modes = [num for num, freq in most_common if freq == max_frequency]

# 최빈값 출력 (여러 개일 경우 두 번째 최빈값 출력)
if len(modes) > 1:
    print(modes[1])
else:
    print(modes[0])
    
#최댓값과 최솟값의 차이
print(abs(numbers[-1] - numbers[0]))
    
    
