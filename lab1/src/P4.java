import java.util.Scanner;
public class P4 {
    static final String TwoA = "AA";
    static final String TwoB = "BB";
    public static void main(String[] args){
        int height;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = sc.nextInt();
        
        if(height == 0) {
        	System.out.println("height = " + height + " - Error input!!");
        }
        else {
            System.out.println("height = " + height);
            for(int i = 1; i <= height; i++){
                for(int j = i; j > 0; j--){
                    if(j % 2 == 1){
                        System.out.print(TwoA);
                    }
                    else{
                        System.out.print(TwoB);
                    }
                }
                System.out.print("\n");
            }
        }
        sc.close();
    }
}