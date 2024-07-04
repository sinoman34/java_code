
import java.util.Scanner;

public class ArrayAvMnMx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number [] = new double[5];
        double sum = 0;
        System.out.println("Enter 5 number of array:");
        for (int i = 0; i < number.length; i++){
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum of array number : "+sum);
        double avg = sum / number.length;
        System.out.println("The avg of array is : "+avg);
        double maximum = number[0];
        for (int i = 1; i < number.length; i++){
            if (maximum < number[i]){
                maximum = number[i];
            }
        }
        System.out.println("The maximum number of this array is : "+maximum);
        double minimum = number[0];
        for (int i = 1; i < number.length; i++){
            if (minimum > number[i]){
                minimum = number[i];
            }
        }
        System.out.println("The minimum number of this array is : "+minimum);
    }
}
