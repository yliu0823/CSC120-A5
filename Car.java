import java.util.ArrayList;

public class Car {

    /*
     * attributes needed for building a car:passenger list and maximum capacity
     */
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /*
     * @param max capactiy
     * construct a car with max capacity and passenger list correspond to car capacity
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>(maxCapacity);
    }
    /*
     * @return max capacity of this car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /*
     * @return number of seats remaining
     */
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }

    
    /*
     * @param passenger p
     * @return passenger list with p added, check if seats are full and if p is already abroad
     */
    public void addPassenger(Passenger p){
        if (seatsRemaining()>0&&!passengers.contains(p)){
            passengers.add(p);
            System.out.println("Added successfully!");
        } 
        else if(passengers.contains(p))
        {
            throw new RuntimeException(("This car or this passenger is already onboard!"));
         }
        else{
            throw new RuntimeException("There are not enough seats.");
        }
    }
    public void removePassenger(Passenger p){
        if (passengers.contains(p)){
            passengers.remove(p);
            System.out.println("Removes this passenger successfully!");
        } else{
            throw new RuntimeException("This passenger is not onboard, can't remove.");
        }
    }
    
    public void printManifest(){
        if(passengers.size()>0){
            for (Passenger item : passengers) {
                System.out.println(item.getName());
            }
        } else{
            System.out.println("This car is EMPTY");
        }
    }
    /*public static void main(String[] args) {
            // Creating a car with a maximum capacity of 4 passengers
            Car car = new Car(4);//testing purpose
    
            // Adding passengers
            Passenger passenger1 = new Passenger("Alice");
            Passenger passenger2 = new Passenger("Bob");
            Passenger passenger3 = new Passenger("Charlie");
    
            car.addPassenger(passenger1);
            car.addPassenger(passenger2);
            car.addPassenger(passenger3);
    
            // Printing the car's maximum capacity and remaining seats
            System.out.println("Car Capacity: " + car.getCapacity());
            System.out.println("Remaining Seats: " + car.seatsRemaining());
    
            // Printing the car's manifest
            car.printManifest();
    
            // Removing a passenger
            car.removePassenger(passenger2);
    
            // Printing the updated manifest
            car.printManifest();
        }*/
}
    

