a = int(input())
b = int(input())
print("{0}\n{1}\n{2}\n{3}".format(a*(b%10), a*(int(b/10)%10), a*int(b/100), a*b))