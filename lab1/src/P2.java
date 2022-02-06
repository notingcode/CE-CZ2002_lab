import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        int salary, merit;
        char grade;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        System.out.print("Enter merit point: ");
        merit = sc.nextInt();

        sc.close();
        
        if(salary >= 500 && salary <= 899){
            if(salary >= 700){
                if(salary <= 799 && merit < 20){
                    grade = 'B';
                }
                else{
                    grade = 'A';
                }
            }
            else if(salary >= 600){
                if(salary <= 649 && merit < 10){
                    grade = 'C';
                }
                else{
                    grade = 'B';
                }
            }
            else{
                grade = 'C';
            }
        }
        else{
            System.out.println("Not a valid salary!");
            return;
        }

        System.out.println("salary : $" + salary + ", merit : " + merit + " - Grade " + grade);
    }    
}