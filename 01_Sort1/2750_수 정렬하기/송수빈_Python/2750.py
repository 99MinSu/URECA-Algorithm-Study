#수 정렬하기1
num =int(input())

data = [] 

for i in range(num):
    data.append(int(input()))

data.sort()

for i in data:
    print(i)
    
########################
import sys
sys.setrecursionlimit(99999)
#기본적으로 Python은 재귀 호출의 깊이에 제한을 두고 있으며, 이는 RecursionError를 방지하기 위한 것. 기본 재귀 한도는 보통 1000으로 설정되어 있기 때문에 사용
input = sys.stdin.readline

N = int(input())  
arr = [int(input()) for _ in range(N)] 

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    
    pivot = arr[0]  # 첫 번째 요소를 피벗으로 설정
    low = []
    high = []

    for x in arr[1:]:
        if x < pivot:
            low.append(x) 
        else:
            high.append(x)  
            
    return quick_sort(low) + [pivot] + quick_sort(high)

sorted_arr = quick_sort(arr)

for num in sorted_arr:
    print(num)
