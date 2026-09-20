import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array elements: ");
        int largest = arr[0];
        int SecondLargest = arr[0];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + SecondLargest);

    }
}


//1.	Find the second-largest number without sorting.