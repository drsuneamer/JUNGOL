while True:
    s, e = map(int, input().split())

    if s < 2 or s > 9 or e < 2 or e > 9:    # 범위 밖 입력 시 재입력
        print("INPUT ERROR!")
        continue

    else:
        if s > e:   # 시작 값이 큰 경우: 작아지면서 출력
            for j in range(1, 10):
                for i in range(s, e -1, -1):
                    if i != e:
                        print('{0} * {1} = {2:>2}'.format(i, j, i*j), end="   ")
                    else:
                        print('{0} * {1} = {2:>2}'.format(i, j, i * j))
        else:
            for j in range(1, 10):
                for i in range(s, e + 1):
                    if i != e:
                        print('{0} * {1} = {2:>2}'.format(i, j, i * j), end="   ")
                    else:
                        print('{0} * {1} = {2:>2}'.format(i, j, i * j))
    break