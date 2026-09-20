#include<stdio.h>
int main(){
    int arr[5];
      printf("Enter 5 numbers:");
    for(int i = 0;i < 5;i++){
        scanf("%d",&arr[i]);
    }
    int largest = arr[0];
    int SecondLargest = arr[0];
    for(int i = 1;i<5;i++){
        if(arr[i] > largest){
            SecondLargest = largest;
            largest = arr[i];
        }
        else if(arr[i] > SecondLargest && arr[i] != largest){
            SecondLargest = arr[i];
        }
    }
    printf("Largest element: %d\n", largest);
    printf("Second largest element: %d\n", SecondLargest);

    return 0;
}