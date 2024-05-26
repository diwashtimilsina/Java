import java.util.Scanner;
public class Age{

    public int checkage(int x){
    if(x>18){
        return 1;
    }

    else {
        return 0;
    }
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int val = checkage( age);
       if(val==1){
        System.out.println("YOU ARE VALID FOR VOTING ");
       }
       else {
        System.out.println("YOU ARENT VALID FOR VOTING");
       }

    }



}