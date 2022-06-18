s, e = map(int, input().split())

if s > e:   # s, e의 값에 따라 작아지거나 커짐
    d = -1
else:
    d = 1

for i in range(s, e + d, d):
    for j in range(1, 10):  # .format 이용하여 공백 맞춤
        print('{0} * {1} = {2:>2}'.format(i, j, i * j), end="   ")
        if j % 3 == 0:
            print()
    print()
