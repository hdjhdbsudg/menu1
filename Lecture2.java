
package lecture2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture2 {

   
    public static int rectangular_volume(ArrayList<Integer> edgesInput) {
        int result = 1;

        for (int i : edgesInput){
            result *= i;
        }
        return result;
    }
    
    public static int electric_fee(int electricNumberInput){
        int sum = 0;
        
        if (electricNumberInput <= 50 && electricNumberInput >= 0){
            sum = electricNumberInput * 1000;
        }
        
        else if (electricNumberInput > 50){
            
            sum = 50000 + ((electricNumberInput - 50)* 1200);
        }

        return sum;
    }
    
    public static void multiplication_table(){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 11; j++){
                System.out.printf("%d x %d=%d\n",i,j,i*j);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner choiceNumberObject = new Scanner(System.in);
        Scanner arrayScanner = new Scanner(System.in);
        Scanner electric_object = new Scanner(System.in);
        
        
        boolean should_continue = true;
        while (should_continue){
            System.out.println(
                      "+---------------------------------------------------------------+\n"
                    + "| 1. input length 3 edges of a rectangular, calculate its volume|\n"
                    + "| 2: calculate electric fee.                                    |\n"
                    + "| 3: output multiplication tables                               |\n"
                    + "| 4: exit                                                       |\n"
                    + "+---------------------------------------------------------------+");
            System.out.print("Enter number: ");
            int numberChoiceInput = choiceNumberObject.nextInt();
            
            switch (numberChoiceInput){
                case 1:
                    System.out.println("Enter edges below: ");
                    ArrayList<Integer> edgesInput = new ArrayList<>();
                    for (int i = 1; i < 4; i++){
                        System.out.println("Enter edge "+ i + ":");
                        edgesInput.add(arrayScanner.nextInt());
                    }

                    System.out.println("rectangual's volume is: "+rectangular_volume(edgesInput));
                    break;
                case 2:
                    System.out.println("Enter your electric number");
                    int electric_num = electric_object.nextInt();
                    
                    System.out.println("Fee you have to pay is: "+electric_fee(electric_num) + "VND");
                    break;
                case 3:
                    multiplication_table();
                    break;
                case 4:
                    should_continue = false;
            }
        }
    }
 
}
