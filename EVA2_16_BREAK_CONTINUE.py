for i in range(10):
    print(f'{i}')

    if (i % 5 == 0 and i != 0):
        print(f'Este numero {i} es divisible entre 5')
        break

for i in range(10):
    if (i % 5 == 0):
        print(" ")
        continue

    print(f'{i}')