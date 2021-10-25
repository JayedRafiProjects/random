/*******************************
 * 
 * Project: Calculate BMI
 * Language: Java
 * Date: May 2021
 * 
 * Dev: Jayed Rafi
 *
*******************************/

 import java.util.Scanner;
 public class BMICalculator{
   
 public static void main(String[] args){
       System.out.println("If you don't know what BMI is, Google it!");
       System.out.println("Input format: Weight(kilograms)_Height(meters)");
       double BMI = calculateBMI(input());
       System.out.println(String.format("BMI is %4.2f",BMI));
       System.out.println(comment(BMI));
    }
 
/*******************************
 * Takes input from user
*******************************/
 public static String input()
   {
     String output = "EMPTY";
     Scanner scan = new Scanner(System.in);
     output = scan.nextLine();
     return output;
    }
 
/*******************************
 * Public driver method for calculating BMI
*******************************/
 public static double calculateBMI(String input)
   {
    double BMI = 0.0;
    String[]list = input.split("_");
    BMI = Double.parseDouble(list[0])/Math.pow(Double.parseDouble(list[1]),2);
    return BMI;
   }

/*******************************
 * Private helper for evaluation
*******************************/
 private static String comment(double BMI)
   {
       String returnText = "EMPTY";
       if(BMI>= 18.5 && BMI<=25)
       returnText = "Your BMI is normal!";
       else if(BMI>25 && BMI<=30)
       returnText = "Your BMI is considered overweight. Don't worry, go gym.";
       else if(BMI>30)
       returnText = "Your BMI is in obesity range. Go gym and make a healthy diet. Don't worry!";
       else if(BMI<18.5)
       returnText = "You are underweight. Go grab some food!";
       return returnText;
    }
}
