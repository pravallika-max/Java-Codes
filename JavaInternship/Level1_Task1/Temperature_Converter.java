import java.util.Scanner;
public class Temperature_Converter
{
	public static void main(String[] args) {
	    double Temperature , converted_temperature;
	    char unit;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("********Temperature Converter********");
	    System.out.println("Enetr Temperature Value: ");
	    Temperature = sc.nextDouble();
	    System.out.print("Enter unit 'C' for Celsius or  'F' for Fahrenheit: ");
	    unit = sc.next().toUpperCase().charAt(0);
	    if(unit == 'C'){
	        converted_temperature = (Temperature* 9/5)+32;
	        System.out.println("Converted Temperature: " + converted_temperature + " F");
	    }
	    else if(unit == 'F'){
	        converted_temperature = (Temperature - 32)*5/9;
	        System.out.println("Converted Temperature: " + converted_temperature + " C");
	    }
	    else{
	        System.out.println("Invalid unit entered !");
	    }
	    sc.close();
    }
}