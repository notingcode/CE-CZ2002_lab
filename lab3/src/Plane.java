public class Plane {
    static final int numSeats = 12;
    private PlaneSeat[] seat;
    private int numEmptySeat;
    
    public Plane(){
        seat = new PlaneSeat[numSeats];

        for(int i = 0; i < numSeats; i++){
            seat[i] = new PlaneSeat(i+1);
        }
        numEmptySeat = numSeats;
    }

    public PlaneSeat[] sortSeats(){
        int i;
        PlaneSeat[] seat_copy = new PlaneSeat[numSeats];
        for(i = 0; i < numSeats; i++){
            seat_copy[i] = new PlaneSeat(seat[i]);
        }

        PlaneSeat temp;
        for(i = 1; i < numSeats; i++){
            for(int j = 0; j < numSeats-i; j++){
                if(seat_copy[j].getCustomerID() > seat_copy[j+1].getCustomerID()){
                    temp = seat_copy[j];
                    seat_copy[j] = seat_copy[j+1];
                    seat_copy[j+1] = temp;
                }
            }
        }

        return seat_copy;
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats(){
        for(int i = 0; i < numSeats; i++){
            if(!seat[i].isOccupied())
                System.out.println("SeatID " + seat[i].getSeatID());
        }
    }

    public void showAssignedSeat(boolean bySeatId){
        int i;
        PlaneSeat[] temp;

        if(bySeatId){
            for(i = 0; i < numSeats; i++){
                if(seat[i].isOccupied()){
                    System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID() + ".");              
                }
            }
        }
        else{
            temp = sortSeats();
            for(i = 0; i < numSeats; i++){
                if(temp[i].isOccupied()){
                    System.out.println("SeatID " + temp[i].getSeatID() + " assigned to CustomerID " + temp[i].getCustomerID() + ".");              
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){ 
        if(seat[--seatId].isOccupied() == false){
            seat[seatId].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!");
        }
        else{
            System.out.println("Seat already assigned to a customer.");
        }
    }

    public void unAssignSeat(int seatId){
        if(seat[--seatId].isOccupied() == true){
            seat[seatId].unAssign();
            numEmptySeat++;
            System.out.println("Seat Unassigned!");
        }
        else{
            System.out.println("Seat already unassigned");
        }
    }
}
