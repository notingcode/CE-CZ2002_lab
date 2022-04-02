package labClasses;

public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(){
        firstName = "FirstName";
        lastName = "LastName";
        totalSales = 0;
    }

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString(){
        return (lastName + " , " + firstName + " : " + totalSales);
    }

    public boolean equals(SalePerson anotherSP){
        return this.firstName.equals(anotherSP.firstName) && this.lastName.equals(anotherSP.lastName);
    }

    public int compareTo(SalePerson anotherSP){
        if(this.totalSales < anotherSP.totalSales){
            return -1;
        }
        else{
            if(this.totalSales == anotherSP.totalSales){
                return this.lastName.compareToIgnoreCase(anotherSP.lastName);
            }
            else return 1;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getTotalSales(){
        return totalSales;
    }
}
