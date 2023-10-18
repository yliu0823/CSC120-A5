public class Engine {
    /*
     * set private attributes of Fueltype name, double fuel levels
     */
    private static FuelType FuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /*
     * @param fuel type, max fuel levels
     */
    public Engine(FuelType FuelType, double maxFuelLevel) {
        Engine.FuelType = FuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    /*
     * @return engine's fuel type
     */
    public static FuelType getFuelType(){
        return FuelType;
    }

    /*
     * @return the current fuel level
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /*
     * @return the maximum fuel level
     */
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    /*
     * @reset the current fuel level to maximum level
     */

    public void refuel(){
        currentFuelLevel = maxFuelLevel;
    }

    /*
     * decrease current fuel level
     * check if fuel<0, need to refuel
     * otherwise, print remaining fuel level
     */

    public void go(){
        if (currentFuelLevel > 0) {
            System.out.println("Engine is running. Remaining fuel level: " + currentFuelLevel);
            currentFuelLevel -= 1; // Decrease fuel level for demonstration purposes
        } else {
            throw new RuntimeException("Out of fuel. Please refuel the engine before continuing.");
        }

    }
    /*public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC , 100.0);
        System.out.println(getFuelType());
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }*/

}