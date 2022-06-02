a, b = map(int, input().split())
c = int(input())
h = c // 60
m = c % 60
hour = a + h
minute = b + m
if  minute >= 60 :
    minute -= 60
    hour += 1
if hour >= 24 :
    hour -= 24 
print(hour, minute)