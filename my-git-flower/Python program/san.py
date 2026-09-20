arr = []
print("Enter 5 numbers:")
arr = list(map(int, input().split()))
smallest = min(arr)
second_smallest = min(x for x in arr if x != smallest)
print("Smallest element:", smallest)
print("Second smallest element:", second_smallest)