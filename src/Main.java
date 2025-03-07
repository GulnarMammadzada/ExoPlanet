public class Main {
    public static void main(String[] args) {
        ExoPlanet exoPlanet1 = new ExoPlanet("Mars", 500);
        ExoPlanet exoPlanet2 = new ExoPlanet("Venus", 300);

        Starship starship1 = new Starship("Apollo", 50, 100);
        Starship starship2 = new Starship("Discovery", 40, 90);

        Explorer explorer1 = new Explorer("John", 3.5);
        Explorer explorer2 = new Explorer("Alice", 4.0);

        explorer1.boardShip(starship1);
        explorer2.boardShip(starship2);

        explorer1.explore(exoPlanet1);
        explorer2.explore(exoPlanet2);

        explorer1.checkStarshipStatus();
        explorer2.checkStarshipStatus();

        exoPlanet1.gatherResources(100);
        exoPlanet1.gatherResources(50).extractResources(30).gatherResources(20);
        exoPlanet2.gatherResources(50);

        exoPlanet1.extractResources(30);
        exoPlanet2.gatherResources(20).extractResources(60).gatherResources(40);
        exoPlanet2.extractResources(100);

        explorer1.discoverAlienLife();
        explorer2.discoverAlienLife();

        explorer1.pilotShip(60);
        explorer2.pilotShip(80);

        explorer1.increaseRank(2.0);
        explorer2.increaseRank(1.5);

        exoPlanet1.defendPlanet("Space Pirates");
        exoPlanet2.defendPlanet("Alien Invaders");

        exoPlanet1.explorePlanet();
        exoPlanet1.evolvePlanet();
        exoPlanet2.explorePlanet();
        exoPlanet2.evolvePlanet();

        starship1.land(exoPlanet1);
        starship2.land(exoPlanet2);
    }
}
