public class Dice {

    public int dicenumber(int number){

        if(number == 1){
            return 6;
         }
        else if(number == 2){
            return 5;
        } 
        else if(number == 3){
            return 4;
        }
        else if(number == 4){
            return 3;
        }
        else if(number == 5){
            return 2;
        }
        else{
            return 1;
        }



    }
    public static void main(String[] args){
      int value = 3;

      Dice obj = new Dice();
         
      int result = obj.dicenumber( value);

      System.out.println(result);


    

    }
}