#include <iostream>
#include <cstdio>
using namespace std;
int main(){
	char a;
	char b;
	cout << "If you enter a down alphabet, it will become upper."<< endl;
	cin >> a;
	cout << a<< endl;;
	b=a+32;
	cout << "The b is: "<< b << endl;
	printf("%c\n%d\n",b,a);
	return 0;
}
