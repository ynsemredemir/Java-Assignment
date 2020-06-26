import java.util.Scanner;
public class CToF{

    public static void main(String []args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a C deg: ");
        int celsius = sc.nextInt(); 
        double fahrenheit = 1.8 * (double)celsius + 32;
        
        System.out.println(celsius + " C is " + fahrenheit + "F");
    
        
    }
}