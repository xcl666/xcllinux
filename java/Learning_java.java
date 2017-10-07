/* 
	I am Xue Chuangli(薛创立). You can contact me on web: oootwo.com.
	My phone number is (+86)131-2072-5819. And my email is xuechaungli666@163.com. 
	Donating through Wechat or Alipay from my phone number 13120725819.
*/
thisIsAVariable
thisIsAmethod()
ThisIsAClass
THISACONSTANT
simplify
// C++ code
class Finances{
	private:	
		char creditCardNumber[16];
		...
};

main(){
	Finances finances;
	
	// Forge a pointer to peek inside the class
	char *cardno = (char *)&finances;
	printf("Card Number = %.16s\n", cardno);
}
