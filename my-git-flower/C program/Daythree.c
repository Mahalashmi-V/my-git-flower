#include<stdio.h>
#include<limits.h>
int main(){
    int arr[5];
    printf("Enter 5 numbers: ");
    for(int i = 0;i< 5;i++){
        scanf("%d",&arr[i]); 
    }
    int smallest =INT_MAX;
    int secondSmallest = INT_MAX;
    for(int i =0;i < 5;i++){
        if(arr[i]<smallest){
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i] != smallest){
            secondSmallest = arr[i];
        }
    }
    printf("Smallest element: %d\n",smallest);
    printf("Second smallest element: %d\n", secondSmallest);
}