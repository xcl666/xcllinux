class goal(object):
    def __init__(self, goals, create_time, count):
        self.goals = goals
        self.create_time = create_time
        self.count = count

    def get_goal(self):
        count = 0
        goals= []
        while True:
            goals.append(raw_input("Please input your goal: "))
            if goals[count] == 'q':
                goals[count] == ''
                break
            count += 1
        return count,goals

    def print_goal(self, count,goals):
        n = 0
        for n in range(count):
            print "{n}: {goals}".format(n=n+1, goals=goals[n])

def main():
    goals = goal("","",count = 0)
    goals_count,goals_list = goals.get_goal()
    goals.print_goal(goals_count, goals_list)
    goals_file = open('goals', 'a')
    goals_file.write("{goals_list}".format(goals_list=goals_list))
    goals_file.close()

if __name__ == '__main__':
    main()
