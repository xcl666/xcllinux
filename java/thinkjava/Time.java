class Time {
    int hour, minute;
    double second;


public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
}

public Time(int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}

public static void main(String[] args) {
    Time t1 = new Time();
    t1.hour=11;
    t1.minute=8;
    t1.second=3.14159;
    System.out.println(t1);
    printTime(t1);
    Time t2 = new Time(11, 8, 3.14159);
    System.out.println(t2);
    printTime(t2);
}

public static void printTime(Time t) {
    int second = (int)t.second;
    System.out.println(t.hour+":"+t.minute+":"+second);
}
}
