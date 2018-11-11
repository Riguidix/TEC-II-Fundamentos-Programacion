for i in range(10):
    print('*')
    for j in range(i):
        print('*', end='')
        for k in (range(j),range(i)):
            print('*',end='')

for i in range(10, 1, -1):
    print('*')
    for j in range(i, 0, -1):
        print('*', end='')
        for k in (range(j),range(i)):
            print('*',end='')