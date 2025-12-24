
import java.util.Scanner;
public class main{
    public static void main(String[] args){
    
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter num1");
       int num1 = scanner.nextInt();
       System.out.println("Enter num2");
       int num2 = scanner.nextInt();

       Calculator cal1 = new Calculator(num1 , num2);
       cal1.add();
       System.out.println("Answer:" + cal1.getAnswer());

       Calculator cal2 = new Calculator(num1 , num2);
       cal2.sub();
       System.out.println("Answer:" +cal2.getAnswer());

       Calculator cal3 = new Calculator(10,5);
       cal3.muilt();
       System.out.println("Answer:" + cal3.getAnswer());

       Calculator cal4 = new Calculator(10,5);
       cal4.div();
       System.out.println("Answer:" + cal4.getAnswer());

       scanner.close(); 

    }
}