
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
      {
        int num1,num2;
        Scanner SCA = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = SCA.nextInt();
        System.out.println("Enter second number: ");
        num2 = SCA.nextInt();
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division 5 for square 6 for exponentiation. ");
        int choose;
        choose = SCA.nextInt();
        switch (choose){
        case 1:
            System.out.println(System.lineSeparator() + "Result: " + add( num1,num2));
            break;
        case 2:
            System.out.println(System.lineSeparator() + "Result: "+ subtract(num1,num2));
            break;      
        case 3:
            System.out.println(System.lineSeparator() + "Result: "+ multply( num1,num2));
            break;
        case 4:
            System.out.println(System.lineSeparator() + "Result: "+ devide( num1,num2));
            break;
        case 5:
            num2 = 0;
            System.out.println(System.lineSeparator() + "Result: "+ square(num1));
            break;
        case 6:
            System.out.println(System.lineSeparator() + "Result: "+ exponentiation( num1,num2));
            break;
        default:
            System.out.println("Illigal Operation");
        }
      }
	
	public static int add(int number1, int number2) 
        {          
            return number1 + number2;
	}

	public static int subtract(int number1, int number2) {
		
            return number1 - number2;
	}

	public static int multply(int number1, int number2)
        {
        int result = 0;
        while(number1 > 0){
        result += number2;
        number1--;
        }
        return result;
        }

	public static int devide(int number1, int number2) 
        {
        int dividend = number1;
        int divisor = number2;
        int opteller = 0;
        while(dividend >= divisor)
        {
           dividend = dividend - divisor; 
           opteller++;
        }
        return opteller;
        }

	public static int square(int number1) 
        {	
        int result = 0;
        int square = number1;
        while(square > 0){
        result += number1;
        square--;
        }
        return result;
        }
	public static int exponentiation(int number1, int number2) 
        {   
        int result = number2;
        while(number1 >1)
        {
           result = multply(result, number2);
           number1--;
        }
        return result;
}
}
