for i in range(10):
    print('*')
    for j in range(i):
        print('*', end='')
        for k in (range(j), range(i)):
            print('*', end='')