def get_information():
    dic_student={}
    while True:
        name = raw_input("Please give me the name of the student (q to quit): ")
        if name == 'q':
            break
        grade = raw_input("Please give me their grade: ")
        dic_student[name] = grade
    return dic_student
def print_information(dic_student):
    print "Okey, printing grades!"
    print "Student Grade"
    for name in dic_student.keys():
        print "{}   {}".format(name,dic_student[name])
def main():
    dic_student=get_information()
    print_information(dic_student)
if __name__ == '__main__':
    main()
