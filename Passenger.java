public class Passenger {
    
    /*
     * a string to store passenger's name
     */
    private String name;

    /*
     * @param name
     * construct a passenger using name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /*
     * @return passenger's name
     */
    public String getName()
    {
        return this.name;
    }

    /*
     * @param Car c
     * catch the exception thrown in Car addPassenger, if car is full and passenger already on list
     */
    public void boardCar(Car c){
        try{
            c.addPassenger(this);
    } catch(RuntimeException e){
        System.out.println("Exception caught: "+e.getMessage
        ());}
    }

    /*
     * @param Car c
     * catch the exception thrown in Car removePassenger, if passenger not on list
     */
    public void getOffCar(Car c){
        try{
            c.removePassenger(this);
    } catch(RuntimeException e){
        System.out.println("Exception caught: "+e.getMessage
        ());
    } 
    }
    
}


