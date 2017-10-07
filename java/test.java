class MyClass{
	public static void main(String[] args){
		String name="David";
		int age = 42;
		double score = 15.9;
		char group = 'Z';
		boolean onling = true;
		int x = 6 + 3;
		int sum1 = 50 + 10;
		int sum2 = sum1 + 66;
		int sum3 = sum2 + sum2;

		int sum1 = 1000-10;
		int sum2 = sum1-5;
		int sum3 = sum1 - sum2;
		
		int sum1 = 1000 * 2;
		int sum2 = sum1 * 10;
		int sum3 = sum1 * sum2;

		int sum1 = 1000 / 5;
		int sum2 = sum1 / 2;
		int sum3 = sum1 / sum2;
		
		int value =23;
		int res= value % 6; // res is 5

		int test = 5;
		++test; // test is 6

		int test = 5;
		--test; // test is 4

		int x = 34;
		int y = ++x; // y is 35

		int x = 34;
		int y = x++; // y is 34

		int value = 5;

		int num1=4;
		int num2 = 8;
		num2 += num1; //num2 = num2 + num1;

		int num1 = 4;
		int num2 = 8;
		num2 -= num1; // num2= num2 - num1;

		String s = "SoloLearn";
		String firstName,lastName;
		firstName = "David";
		lastName="Williams";

		System.out.println("My name is " + firstName + " " + lastName); // Prints: My name is David Williams;

	}
}

import java.util.Scanner;

Scanner myVar = new Scanner(Sytem.in);

import java.util.Scanner;

class MyClass {
	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
		System.out.println(myVar.nextLine());
	}
}

if(condition) {
	//Executes when the condition is true
}

int x =7;
if(x<7) {
	System.out.println("Hi");
}

int age = 30;
if(age<16){
	System.out.println("Too Young");
} else {
	System.out.println("Welcome!");
}
//Outputs "Welcome!"

int age = 25;
if(age>0) {
	if(age>16) {
		System.out.println("Welcome!");
	} else {
			System.out.println("Too Young");
	} 
} else {
		System.out.println("Error");
}

int age = 25;

if(age <= 0) {
	System.out.println("Error");
} else if(age <= 16) {
	System.out.println("Too Young");
} else if(age < 100) {
	System.out.println("Welcome!");
} else {
	System.out.prinln("Really?");
}
//Outputs "Welcome!"

if(age>18) {
	if(money > 500)
		System.out.println("Welcome!");
}

if (age > 18 && money > 500) {
	System.out.println("Welcome!");
}

int age = 25;
int money = 100;

if(age > 25 || money > 500) {
	System.out.println("Welcome!");
}
//Outputs "Welcome!"

int age = 25;
if(!(age>18)){
	System.out.println("Too Young");
} else {
	System.out.println("Welcome");
}
//Outputs "Welcome"

switch (expression) {
	case value1:
		//Statements
		break;
	case value2:
		//Statements
		break;
	default: // Optional
		//Statements
}

int day = 3;

switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
}
//Outputs "Wednesday"

int day = 3;

switch(day) {
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Weekday");
}
//Outputs "Weekday"

int x = 3;

while(x > 0) {
	System.out.println(x);
	x--;
}
/*
Outputs
3
2
1
*/

int x = 6;

while(x < 10) {
	System.out.println(x);
	x++;
}
System.out.println("Loop ended");

/*
6
7
8
9
Loop ended
*/

for(int x =1 ;x <= 5;x++) {
	System.out.println(x);
}

/*
1
2
3
4
5
*/

for(int x = 0;x <= 10;x+=2) {
	System.out.println(x);
}
/*
0
2
4
6
8
10
*/

int x = 1;
do {
	System.out.println(x);
	x++;
} while(x<5);

/*
1
2
3
4
*/

int x = 1;
do {
	System.out.prinln(x);
	x++;
} while(x<0);
//Output 1

int x = 1;
while(x>0) {
	System.out.println(x);
	if(x==4){
		break;
	}
	x++;
}
/*Output
1
2
3
4
*/

int[] arr;
int[] arr = new int[5];
arr[2] = 42;
String[] myNames = {"A","B","C","D"};
System.out.prinln(myNames[2]);
//Outputs "C"

int[] intArr = new int[5];
System.out.println(intArr.length);

int[] myArr = {6,42,3,7};
int sum=0;
for(int x = 0; x <myArr.length;x++) {
	sum += myArr[x];
}

System.out.println(sum);
//58

int[] primes=[2,3,5,7];
for(int t:primes){
	System.out.println(t);
}

int[][] sample={{1,2,3},{4,5,6}};
int x = sample[1][0];
System.out.println(x);
//Outputs 4

int[][] myArr={{1,2,3},{4},{5,6,7}};
myArr[0][2]=42;
int x = myArr[1][0]; //4

public static void main(String[] args)

public class Vehicle{
	private int maxSpeed;
	private int wheels;
	private String color;
	private double fuelCapacity;

	public void horn(){
		System.out.println("Beep!");
	}
}

public calss Vehicle{
	private String color;

	//Getter
	public String getColor(){return color;}
	
	//Setter
	public void setColor(String c) {this.color=c;}
}
