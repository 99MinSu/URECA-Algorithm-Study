# 언어 : Python , (성공/실패) : 1/2, 메모리 : 201748 KB , 시간 : 1396 ms
import sys
input = sys.stdin.readline

N = int(input())
Xarr = list(map(int, input().rstrip().split()))

zipArr = sorted(set(Xarr))

dict_idx = {}

# 시간초과 - 리스트의 인덱스를 매번 찾아보는 비효율적인 방법
# for i in range(N):
#   dict_idx[Xarr[i]] = zipArr.index(Xarr[i])

# 압축된 인덱스를 저장할 딕셔너리 생성
dict_idx = {zipArr[i]: i for i in range(len(zipArr))}

print(' '.join([str(dict_idx[i]) for i in Xarr]))