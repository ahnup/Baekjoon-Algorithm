s = input()
h = 10
for i in range(1, len(s)) :
    if s[i] != s[i-1] :
        h += 10    
    else :
        h += 5
print(h)