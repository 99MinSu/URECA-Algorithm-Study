# 언어 : Python , (성공/실패) : 1/6 , 메모리 : 35732 KB , 시간 : 92ms

import sys

n = int(sys.stdin.readline())
words = [sys.stdin.readline().strip() for _ in range(n)]

words = list(set(words))
words.sort(key=lambda word: (len(word), word))

for word in words:
    print(word)
