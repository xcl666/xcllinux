#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	cout<<"Input A to D to which is best."<<endl;
	char iInput;
	cin >> iInput;
	switch(iInput)
	{
		case 'A':
		cout<<"Very good"<<endl;
		break;
		case 'B':
		cout<<"good"<<endl;
		break;
		case 'C':
		cout<<"normal"<<endl;
		break;
		case 'D':
		cout<<"failure"<<endl;
		break;
		default:
			cout<<"input error"<<endl;
	}
	return 0;
}
