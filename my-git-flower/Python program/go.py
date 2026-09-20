print("Enter a number: ")
num = int(input())
originalNum = num
sum = 0
while num > 0:
    digit = num % 10
    sum += digit
    num //= 10
if originalNum % sum == 0:
    print(originalNum, "is a Harshad/Niven number.")
else:
    print(originalNum, "is not a Harshad/Niven number.")
