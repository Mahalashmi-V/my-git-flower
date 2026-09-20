print("Enter a number:")
num = int(input())
originalNum = num
sum = 0
while num > 0:
    digit = num % 10
    factorial = 1
    for i in range(1, digit + 1):
        factorial *= i
    sum += factorial
    num //= 10
if sum == originalNum:
    print(originalNum, "is a strong number.")
else:
    print(originalNum, "is not a strong number.")