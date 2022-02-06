import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        char in;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter character to be read: ");
        in = sc.next().charAt(0);

        switch(in){
            case 'A', 'a':
                System.out.println("Action movie fan");
                break;
            case 'C', 'c':
                System.out.println("Comedy movie fan");
                break;
            case 'D', 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}