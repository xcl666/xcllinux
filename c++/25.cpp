#include <iostream>
using namespace std;
int main(){
	int iYear;
	cout <<"请输入年份："<<endl;
	while(1){
	cin >> iYear;
	if(iYear%4==0)
	{
		if(iYear%100==0)
		{
			if(iYear%400==0)
			{
				cout <<"这是个润年。"<<endl;	
			}
			else cout <<"这不是个润年。"<<endl;
		}
		else
			cout<<"这是个润年。"<<endl;
	}
	else
		cout <<"这不是个润年。"<<endl;
	}
	return 0;
}
