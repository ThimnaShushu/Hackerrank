n = int(input())
A = map(int, input().split())

A = sorted(A, reverse=True)
highest = A[0]
secondHighest = 0

for i in A:
    if i< highest:
        secondHighest = i
        break
    
print(secondHighest)