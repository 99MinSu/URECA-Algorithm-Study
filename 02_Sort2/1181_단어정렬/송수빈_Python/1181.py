import sys
n = int(sys.stdin.readline())

word = []
for i in range(n):
    word.append(sys.stdin.readline().strip()) #strip으로 공백제거 

word = list(set(word)) #set = 중복제거 

word.sort() #단어순 정렬
word.sort(key=len) #길이순 정렬 

for i in word:
    print(i)
