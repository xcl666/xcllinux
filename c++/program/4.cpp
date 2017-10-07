#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	int b = 123456;
	cout << b << endl;
	cout << hex << b << endl;
	cout << setiosflags(ios::uppercase) << b << endl;
	cout << setw(10) << b << ',' << b << endl;
	cout << setfill('*') << setw(10) << b << endl;
	cout << setiosflags(ios::showpos) << b << endl;
	return 0;
}
