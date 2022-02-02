import java.util.Scanner;

public class sort {
    public static void main(String[] args) {

        int[] number = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int count =0;

        System.out.println("Enter a number to Search");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) {
                System.out.println("Match found at position " +i);
                flag=1;
            }
            }
        if (count ==0){
            System.out.println("Match not found");

            }


    }
}
