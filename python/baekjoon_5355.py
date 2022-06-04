t = int(input())
for i in range(t) :
    ans = 0
    strs = list(map(str, input().split()))
    for j in range(len(strs)) :
        if j == 0 : ans += float(strs[j])
        else :
            if strs[j] == "@" :
                ans *= 3
            if strs[j] == "%" :
                ans += 5
            if strs[j] == "#" :
                ans -= 7
    print("%0.2f" % ans)