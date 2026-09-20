import java.util.Scanner;
public class Day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; 
        System.out.println("Enter the array elements:");
        for(int i =0;i < arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length;i++){
        if(arr[i] < smallest){
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if(arr[i] < secondSmallest && arr[i] != smallest){
            secondSmallest = arr[i];
        }
    } 
    System.out.println("Smallest element: " + smallest);
    System.out.println("Second smallest element: " + secondSmallest);
}
}
//	Find the second-smallest number without sorting.