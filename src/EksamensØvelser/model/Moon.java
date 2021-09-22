package EksamensØvelser.model;

public class Moon extends OrbitalObject {
    private String orbitsAround;

    public Moon(double number){
        super(number);
    }

    public Moon(String name, double mass10ToPower24Kg, double diameterKm, double number, String orbitsAround){
        super(name, mass10ToPower24Kg, diameterKm, number);
        this.orbitsAround =orbitsAround;
    }

    public String getOrbitsAround() {
        return orbitsAround;
    }

    public void setOrbitsAround(String orbitsAround) {
        this.orbitsAround = orbitsAround;
    }

    @Override
    public String toString(){
        return "Moon name: " + name + ", Moon mass (10^24 KG): " + mass + ", Moon diameter(Km): " + diameter +
                 ", This moon orbits around: " + orbitsAround;
    }
}
