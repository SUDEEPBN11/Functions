public class Arrays01 {

    public static void main(String[] args)
    {

        int[] numbers = {10,20,30};  // Declare initialize

        System.out.println("Number of elements in the array = " + numbers.length);
        System.out.println("Number of elements in the array = " + numbers[0]);

         //printElements(numbers);

         printElements2(numbers);

        int[] ages = new int[3];

        ages[0] = 50;
        ages[1] = 50;
        ages[2] = 50;
        System.out.println("Number of elements in the array = " + ages[0]);

       // printElements(ages);

       printElements2(ages);



       int[][] Matrix = {{10,20,30},{10,20,30}};

       System.out.println("Number of elements in the array = " + Matrix[0][0]);

       


    }

    public static void printElements(int[] elements){

        // Genrating the elements

        for(int index=0; index < elements.length; index++){

            System.out.println(""+elements[index]);


        }
    }

 public static void printElements2(int[] elements){

    for(int element : elements){

     System.out.println(""+element);

    }
 }   
    
}
