import java.util.Scanner;
 class userid {
    public static void main(String[] args) {
         String userId = "shiva";
         String password = "12345";
        Scanner input = new Scanner(System.in);

         for (int i=3;i>=1;i--) {

             System.out.print("Enter user id:");
             String user_Id1 = input.nextLine();
             System.out.print("Enter user password:");
             String password1 = input.nextLine();

             if ((userId.matches(user_Id1)) && (password.matches(password1))) {
                 System.out.println("welcome  " + userId);
                 break;
             }
             else {
                 System.out.println("login failed attempts remaining  " +(i-1) );
                 System.out.println("");
                 if (i==1){
                     System.out.println("Contact Admin");
                 }
             }

         }


    }
