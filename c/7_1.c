// Program 7.1 A simple program using pointers
#include <stdio.h>
int main(void)
{
  int number = 0;
  int *pnumber = NULL;

  number = 10;
  printf("number's address: %p\n", &number);
  printf("number's value is: %d\n\n", number);

  pnumber = &number;

  printf("pnumber's address: %p\n", (void*)&pnumber);
  printf("pnumber's size: %zd bytes\n", sizeof(pnumber));
  printf("pnumber's value: %p\n",pnumber);
  printf("value pointed to: %d\n", *pnumber);
  *pnumber+=2;
  printf("value pointed to: %d\n", *pnumber);
  return 0;
}
