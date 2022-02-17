public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id){
        seatId = seat_id;
        assigned = false;
        customerId = -1;
    }
    public int getSeatID(){
        return seatId;
    }
    public int getCustomerID(){
        return customerId;
    }
    public boolean isOccupied(){
        return assigned;
    }
    public void assign(int customer_id){
        customerId = customer_id;
        assigned = true;
    }
    public void unAssign(){
        assigned = false;
        customerId = -1;
    }
    public PlaneSeat(PlaneSeat seat){
        this.seatId = seat.seatId;
        this.assigned = seat.assigned;
        this.customerId = seat.customerId;
    }
}
