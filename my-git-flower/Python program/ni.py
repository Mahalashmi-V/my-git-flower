arr = []
print("Enter 5 numbers:")
for i in range(5):
    num = int(input())
    arr.append(num)
largest = arr[0]
second_largest = arr[0]
for i in range(1, 5):
    if arr[i] > largest:
        second_largest = largest
        largest = arr[i]
    elif arr[i] > second_largest and arr[i] != largest:
        second_largest = arr[i]
print("Largest element:", largest)
print("Second largest element:", second_largest)