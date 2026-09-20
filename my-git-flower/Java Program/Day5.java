import java.util.Scanner;
public class Day5 {
    public static void main(String[] args){
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sd.nextInt();
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(originalNum % sum == 0){
            System.out.println(originalNum + " is a Harshad/Niven number.");
        } else {
            System.out.println(originalNum + " is not a Harshad/Niven number.");
        }
    }
}
//Check whether a number is a Harshad/Niven number.