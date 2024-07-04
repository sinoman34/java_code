
import java.util.*;


public class Arrays{
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        // marks[0] = 89;
        // marks[1] = 90;
        // marks[2] = 100;
        // marks[3] = 87;
        // marks[4] = 99;
        // System.out.println(marks[2]);
        // System.out.println(3);
        for (int i = 0; i < marks.length; i++){
            System.out.print("Enter " + i + " list item : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);           
        }
        System.out.println("Enter valud of x : ");
        int x = sc.nextInt();
        for (int i = 0; i < marks.length; i++){
            if (marks[i] == x){
                System.out.print("x is found : "+i);
            }
        }
    }   
}