   
public class Flat {

    String name;
     int rent;
 int dist_office;
    int travl_T_min;
    int location_Ad;

    // Constructor
    public Flat(String name, int rent, int dist_office, int travl_T_min, int location_Ad) 
    {
        this.name = name;
        this.rent = rent;
        this.dist_office = dist_office;
        this.travl_T_min = travl_T_min;
        this.location_Ad = location_Ad;
    }

    /* 
    // Display flat details
    */
    public void display() {
        System.out.println("Flat Name: " + name);
        System.out.println("Rent:" + rent);
        System.out.println("Distance to Office: " + dist_office + " km");
        System.out.println("Travelling Time: " + travl_T_min + " minutes");
        System.out.println("Location Advantage:" + location_Ad);
        System.out.println("---------------------------------------");
    }

    // Calculate total monthly cost
    public int calculateCost() 
    {
        int perKm = 10;        // Cost per km
        int costPerMin = 2;    // Cost per minute
        int workingDays = 20;  // Working days per month

        // Formula:
        // rent + (distance * cost/km * 2 trips * working days)
        // + (travel time * cost/minute * 2 trips * working days)
        // - location advantage
        int cost = rent +
                   (dist_office * perKm * 2 * workingDays) +
                   (travl_T_min * costPerMin * 2 * workingDays) - location_Ad;

                          return cost;
    }

    // Getter for name (used in printing)
    public String getName() 
    {
        return name;
    }
}

// Separate class containing main method
class FlatAssignment
 {

    public static void main(String[] args) 
    {

        // Create three flat objects
        Flat a = new Flat("Flat A", 1000, 2, 15, 500);
        Flat b = new Flat("Flat B", 1200, 1, 15, 100);
        Flat c = new Flat("Flat C", 1100, 4, 20, 1500);

        // Display flat details
        a.display();
        b.display();
        c.display();

        // Calculate and display total monthly costs
        System.out.println(a.getName() + " Total Monthly Cost: " + a.calculateCost());
        System.out.println(b.getName() + " Total Monthly Cost: " + b.calculateCost());
        System.out.println(c.getName() + " Total Monthly Cost: " + c.calculateCost());

        // Calculate combined cost of all flats
        int totalCost = a.calculateCost() + b.calculateCost() + c.calculateCost();
        System.out.println("\nTotal Cost of Living in All Flats: " + totalCost);
    }
}

    

