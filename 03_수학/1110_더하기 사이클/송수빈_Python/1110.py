n = int(input())
num = n
cnt = 0  # 횟수

while True:
    num1 = num // 10
    num2 = num % 10
    plus_num = (num1 + num2) % 10
    new_num = (num2 * 10) + plus_num
    
    cnt += 1
    if new_num == n:
        break
    num = new_num  # Update num to the new number
    
print(cnt)
