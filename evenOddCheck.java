import java.util.Scanner;

public class evenOddCheck {

    public static boolean isEven(int n){
        if((n & 1) == 0)
            return true;
        else
            return false;
    }



    public static void main(String[] args){

        Scanner S1 = new Scanner(System.in);

         int number = S1.nextInt();

           if(isEven(number) == true )

                 System.out.println("True");
           else

            System.out.println("False");
                  


        
    }





    
}
