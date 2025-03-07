public class Starship {
    private String name;
    private int velocity;
    private double fuelLevel;


    public Starship() {
    }

    public Starship(String name, int velocity) {
        this.name = name;
        this.velocity = velocity;
        this.fuelLevel=100;

    }

    public Starship(String name,double fuelLevel, int velocity) {
        this.fuelLevel = fuelLevel;
        this.name = name;
        this.velocity = velocity;
    }

    public void launch(){
        if(fuelLevel>20){
            System.out.println(name+ " started to launch with velocity "+velocity );
        }else {
            System.out.println("There is not enough fuel to launch for " + name);
        }
    }
    public void land(ExoPlanet exoPlanet){
        System.out.println(name + " landed to "+exoPlanet.getName());
    }
    public void refuel(double refuel){
        double newFuelLevel=fuelLevel+refuel;
        System.out.println("Current fuel level is"+ fuelLevel +"\nStarship refuelled:" + newFuelLevel);
    }
    public void emergencyLanding(){
        if(fuelLevel==0){
            System.out.println(name + " must perform an emergency landing due to no fuel.");
        }
    }
    public void changeVelocity(int newVelocity){
        if(velocity>=0){
            velocity=newVelocity;
        }else{
            System.out.println("Velocity can not be negative");
        }
    }

    public void trackFuel(double distance){
        double fuelConsumed=distance*0.2;
        fuelLevel-=fuelConsumed;
        System.out.println(name + " has traveled " + distance + " units. Fuel consumed: " + fuelConsumed);
        System.out.println("Remaining fuel level is "+ fuelLevel);

        emergencyAlert();
    }



    public void damageSituation(int damage){
        if (damage>0){
            fuelLevel-=damage;
            System.out.println(name+" has been damaged.Fuel level reduced to "+fuelLevel);
        }else{
            System.out.println(name+ " is in good condition");
        }
    }

    public void emergencyAlert(){
        if (fuelLevel<=0){
            System.out.println(name+ " has no fuel.Emergency alaram activated!!!");
        } else if (fuelLevel <= 10) {
            System.out.println(name + " has low fuel. Refuel as soon as possible!");
        }else{
            System.out.println(name+ " is in good condition");
        }
    }



    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if(fuelLevel>0) {
            this.fuelLevel = fuelLevel;
        }
        else{
            System.out.println("Yanacaq seviyyesi menfi ola bilmez");
        }
    }



    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
