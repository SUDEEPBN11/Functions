public class TempertureConverter {

    public static double celsiusTOFahrenheit(double celsius){

        return (celsius * 9/5) + 32;



    }
      public static void main(String[] args){

        double temInCelsius = 25.5;

        double temInFahrenheit = celsiusTOFahrenheit(temInCelsius);


        System.out.println(temInCelsius + "" + "degree celsius equal to" + temInFahrenheit + "" + "degree Fahrenheits ." );

      }

    
}
