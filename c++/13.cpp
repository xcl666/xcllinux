#include <iostream>
using namespace std;
template <class T> T sum()
{
	T a;
	T b;
	T sum;
	cout << "Enter a number \n";
	cin >> a;
	cout <<"Enter another number \n";
	cin >> b;
	sum = a + b;
	cout << "Sum is:" << sum << endl;

	return 0;
}
int main(){sum();return 0;}
