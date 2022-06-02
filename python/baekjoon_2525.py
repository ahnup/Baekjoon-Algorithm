a, b =(int, input().split())
c = int(input())
b += c
if  b >= 60 :
    b = 60 -b
    a += 1
    if a >= 24 :
        a = 24-a
print(hour, b)