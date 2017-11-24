

package temperature_converter;

//classes to be imported
import java.util.Scanner;
import java.text.DecimalFormat;

public class Temperature_Converter 
{   
    public static void main(String[] args) 
    {
        //declare variables to be used for conversion        
        double convertCelsius;
        double convertFarenheit;        
        
        //create scanner object for input
        Scanner input = new Scanner(System.in);
        
        //create two dec objects for displaying results in exmaple format
        DecimalFormat dec = new DecimalFormat("#0");  //set decimal place to 0 for display result purpose "100F"         
        DecimalFormat dec2 = new DecimalFormat("#0.00000");//set second decimal place to 0.0000 for display result purpose " 37.777"
        
        //prompt user to enter farenheit value
        System.out.print("Enter a Farenheit temperature: ");
        double degFarenheit = input.nextDouble();
        
        //convert user input into Celsius
        convertCelsius = (degFarenheit - 32) * 5/9;
        System.out.println(dec.format(degFarenheit) + "F is equivalent to " + 
                dec2.format(convertCelsius) + " C");
        
        //prompt user to enter a Celsius
        System.out.print("Enter a Celsius temperature: ");
        double degCelsius = input.nextDouble();
        
        //convert user input to Farenheit
        convertFarenheit = degCelsius  * 9/5 + 32;
        System.out.println(dec.format(degCelsius) + "C is equivalent to " + 
                dec.format(convertFarenheit) + "F");
     
    }
    
}
