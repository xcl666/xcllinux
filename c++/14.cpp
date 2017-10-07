#include <iostream>
using namespace std;
int main()
{
	int num = 1;
	int number;
	int total = 0;

	while(num <= 5){
		cin >> number;
		total += number;
		num++;
		cout << "Now the total is "<<total << endl;
}
	return 0;
}
