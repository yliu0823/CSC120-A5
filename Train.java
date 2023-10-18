import java.util.ArrayList;

public class Train {
    /*
     * attributes need for train: engine, car
     */
    private final Engine engine;
    private ArrayList<Car> car;
    public int nCars;
    public int passengerCapacity;

    /*
     * construct a new engine and car lists
     * @param fuel type, max fuel capacity, car numbers, passenger capacity of each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.car = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            Car myCar = new Car(passengerCapacity);
            this.car.add(myCar);
        }
    }

    /*
     * @return engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /*
     * @param No.i car
     * @return information of car on i position
     */
    public Car getCar(int i){
        if (i>=0 && i<=car.size()){
            return this.car.get(i);
        } else{
            throw new RuntimeException("Invalid car index. ");
        }
    }

    /*
     * @return total max capacity of the train
     */
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for (Car car : car){
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /*
     * @return total seats remained in train
     */
    public int seatsRemaining(){
        int remainingseats = 0;
        for (int i = 0; i < car.size(); i++){
            remainingseats += seatsRemaining();
        }
        return remainingseats;

    }

    /*
     * print passenger list for the train
     */
    public void printManifest()
        {
            for (int i=0; i<car.size(); i++)
            {
                car.get(i).printManifest();
            }
        }
    
}
