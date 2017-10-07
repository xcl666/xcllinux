#include <iostream>
using namespace std;

class Enemy{ public: virtual void Attack(){ cout << "Enemy" << endl;}};
class Ninja:public Enemy{public: void Attack(){ cout << "Ninja"<< endl;}};
class Monster:public Enemy{public: void Attack(){ cout << "Monster"<< endl;}};

int main(){Ninja m; Monster n; Enemy e;Enemy*m1 = &m; Enemy*n1 = &n; Enemy *e1 = &e;m1 -> Attack(); n1 -> Attack(); e1-> Attack();return 0;}
