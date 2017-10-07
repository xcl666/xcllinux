#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	int i=0x2F,j=255;
	cout << i << endl;
	cout << hex << i << endl;
	cout << hex << j << endl;
	cout << hex << setiosflags(ios::uppercase) << j << endl;
	return 0;
}
