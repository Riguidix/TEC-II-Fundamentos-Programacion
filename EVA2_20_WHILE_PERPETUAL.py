import time

while (True):
    try:
        time.sleep(1)
        print('Si miras este mensaje se trabo tu compu')
    except KeyboardInterrupt:
        print('Why you stop me bitch')