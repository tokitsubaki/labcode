import threading
import time
import random
from concurrent.futures import ThreadPoolExecutor

def thread1():
    for i in range(1, 5):
        time.sleep(random.random())
        print(f"thread1: {i}")

def thread2():
    for i in range(1, 5):
        time.sleep(random.random())
        print(f"thread2: {i}")

def thread3(n):
    print(f"thread {n}: start.")
    time.sleep(random.random())
    print(f"thread {n}: end.")

def thread4(n):
    print(f"thread {n}: start.")
    time.sleep(random.random())
    print(f"thread {n}: end.")
    return 10+n

print("start.")

t1 = threading.Thread(target=thread1)
t2 = threading.Thread(target=thread2)
t1.start()
t2.start()
t1.join()
t2.join()

print("end.")

print("-------------------------------------")

print("start.")
pool = ThreadPoolExecutor(max_workers=3, thread_name_prefix="thread")
for i in range(1,6):
    pool.submit(thread3, i)
pool.shutdown()
print("end.")


print("-------------------------------------")

futures = []
print("start.")
with ThreadPoolExecutor(max_workers=3, thread_name_prefix="thread") as pool:
    for i in range(1,6):
        future = pool.submit(thread4, i)
        futures.append(future)
for future in futures:
    print(future.result())

print("end.")



