public class Plane {
    static final int numSeats = 12;
    private PlaneSeat[] seat;
    private int numEmptySeat;
    
    public Plane(){
        seat = new PlaneSeat[numSeats];
        numEmptySeat = numSeats;
    }
    public void sortSeats(){
        PlaneSeat temp;
        for(int i = 1; i < numSeats; i++){
            for(int j = 0; j < numSeats-i; j++){
                if(seat[j].getCustomerID() > seat[j+1].getCustomerID()){
                    temp = seat[j];
                    seat[j] = seat[j+1];
                    seat[j+1] = temp;
                }
            }
        }
    }
    public void showNumEmptySeats(){
        System.out.println(numEmptySeat);
    }
    public void showEmptySeats(){
        for(int i = 0; i < numSeats; i++){
            if(!seat[i].isOccupied())
                System.out.print(i + " ");
        }
        System.out.println();
    }
    public void showAssignedSeat(boolean bySeatId){
        if(bySeatId){
            for(int i = 0; i < numSeats; i++){
                if(seat[i].isOccupied()){

                }
            }
        }
        else{
            for(int i = 0; i < numSeats; i++){
                if(seat[i].isOccupied()){
    
                }
            }
        }
    }
    public void assignSeat(int seatId, int cust_id){

    }
    public void unAssignSeat(int seatId){
        
    }
}
