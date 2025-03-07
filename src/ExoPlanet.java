public class ExoPlanet {
    private String name;
    private double gravityLevel;
    private double availableResources;


    public ExoPlanet() {
    }

    public ExoPlanet(String name,double availableResources) {
        this.gravityLevel = 10;
        this.name = name;
        this.availableResources=availableResources;
    }

    public ExoPlanet(double gravityLevel, String name, double availableResources) {
        this.gravityLevel = gravityLevel;
        this.name = name;
        this.availableResources = availableResources;
    }

    public void landShip(Starship starship){
        System.out.println( starship.getName()+ " landed on "+ name);
        starship.setFuelLevel(starship.getFuelLevel() - 10);
        this.gatherResources(20);
        this.defendPlanet("Space Pirates");
    }
    public ExoPlanet gatherResources(double amount){
        if(amount>0){
            availableResources+=amount;
            System.out.println(amount + " units of resources added to " + name + ". Total available resources: " + availableResources);
        }else {
            System.out.println("Cannot add negative or zero resources.");
        }
        return this;
    }
    public ExoPlanet extractResources(double amount){
        if(availableResources >=amount){
            availableResources-=amount;
            System.out.println(amount + " units of resources gathered from " + name + ". Remaining resources: " + availableResources);
        } else {
            System.out.println("Not enough resources available. Only " + availableResources + " units left.");
        }
        return this;
    }

    public void explorePlanet() {
        System.out.println("Exploring planet " + name + "...");
        System.out.println("Gravity level: " + gravityLevel);
        System.out.println("Available resources: " + availableResources);
    }
    public void defendPlanet(String threat) {
        System.out.println("Defending planet " + name + " from " + threat);
    }

    public void evolvePlanet() {
        gravityLevel += 0.5;
        System.out.println("Planet " + name + " is evolving. New gravity level: " + gravityLevel);
    }



    public double getAvailableResources() {
        return availableResources;
    }

    public void setAvailableResources(double availableResources) {
        this.availableResources = availableResources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGravityLevel() {
        return gravityLevel;
    }

    public void setGravityLevel(double gravityLevel) {
        this.gravityLevel = gravityLevel;
    }
}
