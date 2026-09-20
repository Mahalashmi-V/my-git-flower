#include<stdio.h>
int main(){
int num;
int originalNum;
int sum = 0;
printf("Enter a number: ");
scanf("%d",&num);
while(num > 0){
    int digit = num % 10;
    sum = sum + digit;
    num /= 10;
}
if(originalNum % sum ==0){
    printf("%d is a Harshad/Niven number.\n", originalNum);
} else {
    printf("%d is not a Harshad/Niven number.\n", originalNum);
}
return 0;
}
       