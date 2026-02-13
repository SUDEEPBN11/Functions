import java.util.Scanner;

public class Multiplication {


    public static void Multiplication(int number){
         
        for(int index=1; index <=10; index++){

            System.out.println(number + "*" + index + "=" + number * index);
        }
  
    }

      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

           int number = scanner.nextInt();

      Multiplication(number);

    }
    
}
