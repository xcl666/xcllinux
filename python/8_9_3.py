classroom = ['student1','student2']
def if_in_class(name):
    if name in classroom:
        print("Yes, that student is enrolled in the class!")
    elif name == 'q':
        print "Goodbye!"
    else:
        print ("No, that student is not in the class!") 
def input_name():
    print ("Welcome to the student checker!")
    while True:
     name = raw_input("Please give me the name of a student (enter 'q' to quit): ")
     if_in_class(name)
     if name == 'q':
        break
def main():
    input_name()
if __name__ == "__main__":
    main()
