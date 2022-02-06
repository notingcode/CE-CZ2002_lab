import java.text.DecimalFormat;
import java.util.Scanner;
public class P3 {
    static final float RATE = 1.82f;
    public static void main(String[] arg){
        int start, end, inc, i;
        Scanner sc = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("0.0#");

        System.out.print("starting : ");
        start = sc.nextInt();
        System.out.print("ending : ");
        end = sc.nextInt();
        System.out.print("increment : ");
        inc = sc.nextInt();

        sc.close();
        
        if(start > end || inc < 1){
            System.out.println("Invalid input");
        }
        else{
            printHeading();
            for(i = start; i <= end; i += inc){
                System.out.printf("%-9d %s\n", i, dFormat.format(RATE * i));
            }
    
            i = start;
            printHeading();
            while(i <= end){
                System.out.printf("%-9d %s\n", i, dFormat.format(RATE * i));
                i += inc;
            }
    
            i = start;
            printHeading();
            do{
                System.out.printf("%-9d %s\n", i, dFormat.format(RATE * i));
                i += inc;
            }while(i <= end);
        }
    }
    static void printHeading(){
        System.out.println("\nUS$       S$");
        System.out.println("--------------");
    }
}
