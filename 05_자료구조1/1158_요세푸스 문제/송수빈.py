from collections import deque

n,k=map(int,input().split()) 
arr=list(range(1,n+1)) 
result=[]
queue = deque(arr)

while queue:
	queue.rotate(k*(-1))
	x=queue.pop()
	result.append(str(x))

print("<", ", ".join(result), ">", sep='')
