#include <iostream>
using namespace std;
int main(){
	int iInput;
	cout <<"Input a integer number:"<<endl;
	cin >> iInput;
	(iInput%3==0 && iInput % 5 ==0 )?cout<<"Yes":cout<<"no";
	cout << endl;
	return 0;
}
