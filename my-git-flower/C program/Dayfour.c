#include <stdio.h>
int main() {
    int num;
    int originalNum;
    int sum = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    originalNum = num;
    while (num > 0) {
        int digit = num % 10;
        int factorial = 1;
        for (int i = 1; i <= digit; i++) {
            factorial = factorial * i;
        }
        sum = sum + factorial;
        num = num / 10;
    }
    if (sum == originalNum) {
        printf("%d is a strong number.\n", originalNum);
    }
    else {
        printf("%d is not a strong number.\n", originalNum);
    }
    return 0;
}