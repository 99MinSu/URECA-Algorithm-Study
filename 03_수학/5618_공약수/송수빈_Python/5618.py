n=int(input())
num =list(map(int, input().split()))
res=[]

for i in range (1,min(num)+1):
    if n==2:
        if num[0]%i==0 and num[1]%i==0:
            res.append(i)
    elif n==3:
        if num[0]%i==0 and num[1]%i==0 and num[2]%i==0:
            res.append(i)   

for i in res:
    print(i) 
