# [JUNGOL] 1304. 숫자사각형3  2022-06-21

n = int(input())  # 정사각형 한 변의 길이

for i in range(1, n + 1):
    for j in range(n):
        print(n * j + i, end=" ")
    print()

