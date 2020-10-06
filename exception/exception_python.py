import traceback

def main():
    try:
        print("before exception.")
        raiseException()
        print("after exception.")
    except Exception as e:
        print(traceback.format_exc())
    else:
        print("not exception.")
    finally:
        print("finally.")

def raiseException():
    print("before raise.")
    raise Exception("Test Exception.")
    print("after raise")

main()
