//do while loop 
import java.util.Scanner;

public class dowhile{
public static void main( String [] args){
int i = 0;
     Scanner scan = new Scanner(System.in);
     int n= scan.nextInt();
     do{
        System.out.println(i);
        i++;
     }
     while(i!=n);
}

}