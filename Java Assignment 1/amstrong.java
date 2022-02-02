import java.util.Scanner;
class armstrong {

    public static void main(String[] args){
 int number=100, originalNumber, remainder, result = 0;
 
	for(;number<=999;number++);
		
		
{
       originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
       
    }
}
}
}
