#include <iostream>
using namespace std;
int main(){
	float a,b,c,d; // how many days to make the mug full.
	a=3;
	b=1;
	c=4;
	d=5;
	int mug = 1;
	float days;
	days = mug / (mug / a + mug /b + mug / c + mug / d);
	cout << "It need "<<days<<" to put the mug full." << endl;
	return 0;
}
