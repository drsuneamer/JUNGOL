# [JUNGOL] 2046. 숫자사각형4  2022-06-22

n, m = map(int, input().split())    # n: 한 변의 길이, m: 방법

if m == 1:
    for i in range(1, n+1):
        print(f'{i} ' * n)

elif m == 2:
    for i in range(n):
        if i % 2:
            for j in range(n, 0, -1):
                print(j, end=" ")
            print()
        else:
            for j in range(1, n+1):
                print(j, end=" ")
            print()

else:
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            print(i * j, end=" ")
        print()