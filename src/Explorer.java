public class Explorer {
    private String name;
    private double rank;
    private Starship starship;
    private ExoPlanet exoPlanet;


    public Explorer() {
    }

    public Explorer(String name) {
        this.name = name;
    }

    public Explorer(String name, double rank) {
        this.name = name;
        this.rank = rank;
        this.starship=new Starship(name,50,100);
    }


    public void boardShip(Starship starship){
        this.starship=starship;
        System.out.println(name + ",boarded to " + starship.getName());
    }
    public void exitShip() {
        if (starship != null) {
            System.out.println(name + " exited the ship " + starship.getName());
            starship = null;
        } else {
            System.out.println(name + " is not aboard any starship.");
        }
    }


    public void explore(ExoPlanet exoPlanet){
        this.exoPlanet=exoPlanet;
        System.out.println(name + " explored planet " + exoPlanet.getName());
        exoPlanet.landShip(this.starship);
        exoPlanet.explorePlanet();
    }

    public void scanPlanet(){
        if(exoPlanet!=null){
            System.out.println(name+ " is scanning planet "+exoPlanet.getName());
        }else{
            System.out.println("No planet selected for scanning!");
        }
    }

    public void discoverAlienLife() {
        if (exoPlanet != null) {
            System.out.println(name + " discovered alien life forms on " + exoPlanet.getName() + "!");
        } else {
            System.out.println("No planet to discover alien life on.");
        }
    }

    public void pilotShip(int newVelocity){
        if(starship!=null){
            starship.changeVelocity(newVelocity);
            System.out.println(name + " piloted the ship " + starship.getName() + " to new velocity " + newVelocity);
        }else {
            System.out.println(name + " is not aboard any starship.");
        }
    }

    public void checkStarshipStatus(){
        if(starship!=null){
            System.out.println(name + " checked the status of the starship " + starship.getName());
            System.out.println("Fuel Level: " + starship.getFuelLevel());
            System.out.println("Velocity: " + starship.getVelocity());
        } else {
            System.out.println(name + " is not aboard any starship.");
        }
    }

    public void increaseRank(double increment){
        rank+=increment;
        System.out.println(name + "'s rank increased by " + increment + ". Current rank: " + rank);
    }

    public void displayRank(){
        System.out.println(name + "'s current rank: " + rank);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public ExoPlanet getExoPlanet() {
        return exoPlanet;
    }

    public void setExoPlanet(ExoPlanet exoPlanet) {
        this.exoPlanet = exoPlanet;
    }

    public Starship getStarship() {
        return starship;
    }

    public void setStarship(Starship starship) {
        this.starship = starship;
    }
}
