import java.util.Scanner;
public class ifelse{
    

    public static void main( String [] args){

Scanner scan;
scan = new Scanner(System.in);
  int num1;
  int num2;
  num1= scan.nextInt();
  num2=scan.nextInt();

  if(num1==num2){
System.out.println("They are equal");
  }
  else{
System.out.println("Not Equal");
  }

    }
}