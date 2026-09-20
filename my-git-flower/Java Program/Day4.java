import java.util.Scanner;
public class Day4 {
    public static void main(String[] args){
        Scanner en = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = en.nextInt();
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            int factorial = 1;
            for(int i = 1; i <= digit; i++){
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println(originalNum + " is a strong number.");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }
    }
}
//Check whether a number is a strong number.