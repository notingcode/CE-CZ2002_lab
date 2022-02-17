import java.util.Scanner;
public class PlaneApp {
    public static void main(String args[]){
        int seatId, cust_id;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Plane myPlane = new Plane();

        printMenu();
        
        while(true){
            System.out.print("\nEnter the number of your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    myPlane.showNumEmptySeats();
                    break;
                case 2:
                    System.out.println("The following seats are empty:");
                    myPlane.showEmptySeats();
                    break;
                case 3:
                    System.out.println("The seat assignments are as follow:");
                    myPlane.showAssignedSeat(true);
                    break;
                case 4:
                    System.out.println("The seat assignments are as follow:");
                    myPlane.showAssignedSeat(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat...");
                    System.out.print("Please enter SeatID: ");
                    seatId = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    cust_id = sc.nextInt();
                    myPlane.assignSeat(seatId, cust_id);
                    break;
                case 6:
                    System.out.println("Remove seat with the following ID");
                    System.out.print("Seat ID: ");
                    seatId = sc.nextInt();
                    myPlane.unAssignSeat(seatId);
                    break;
                case 7:
                    sc.close();
                    System.out.println("Program closing");
                    break;
                default:
                    System.out.println("Not a valid input!");
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("\nReservation System Menu");
        System.out.println("1. Show  number of empty seats");
        System.out.println("2. Show the list of empty seats");
        System.out.println("3. Show the list of seat assignments by seat ID");
        System.out.println("4. Show the list of seat assignments by customer ID");
        System.out.println("5. Assign a customer to a seat");
        System.out.println("6. Remove a seat assignment");
        System.out.println("7. Exit");
    }

}
