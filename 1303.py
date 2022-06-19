# [JUNGOL] 1303. 숫자사각형1  2022-06-19

n, m = map(int, input().split())    # n: 높이, m: 너비

# n행 m열의 사각형 형태로 1부터 n*m번까지 숫자가 차례대로 출력
for i in range(1, n*m+1):
    if i % m == 0:
        print(i)
    else:
        print(i, end=" ")