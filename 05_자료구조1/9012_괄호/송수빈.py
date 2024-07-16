N = int(input())

for _ in range(N):
    K = input().strip()  # 괄호 문자열을 입력 받음
    
    stack = []
    ps = True  # 기본적으로 올바른 괄호 문자열(VPS)라고 가정
    
    for char in K:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                ps = False  # 짝이 맞지 않는 경우
                break
    
    # 반복문이 끝난 후에도 stack에 괄호가 남아있다면 짝이 맞지 않는 것이니 False 
    if stack:
        ps = False
    
    if ps:
        print("YES")
    else:
        print("NO")
