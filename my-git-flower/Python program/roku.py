print("Enter a number: ")
num = int(input())
while num >= 10:
    sum = 0
    while num > 0:
        sum += num % 10
        num //= 10
    num = sum
print("The digital root is: ", num)