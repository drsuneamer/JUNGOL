# [JUNGOL] 1856. 숫자사각형2  2022-06-20

n, m = map(int, input().split())    # n: 높이, m: 너비
for i in range(n):
    if i % 2:   # 짝수행(역순 출력)
        for j in range(m, 0, -1):
            print(i * m + j, end=" ")
        print()
    else:   # 홀수행(정상 출력)
        for j in range(1, m + 1):
            print(i * m + j, end=" ")
        print()