package EksamensØvelser.model;

import java.util.ArrayList;

public class Planet extends OrbitalObject {

    private double distanceFromSun10ToPower6Km;
    private boolean isHabitable;
    private ArrayList<Moon> moons;

    public Planet(double number){
        super(number);
    }

    public Planet(String name, double mass10ToPower24Kg, double diameterKm, double number, double distanceFromSun10ToPower6Km,
                  boolean isHabitable, ArrayList<Moon> moons) {
        super(name, mass10ToPower24Kg, diameterKm, number);
        this.distanceFromSun10ToPower6Km = distanceFromSun10ToPower6Km;
        this.isHabitable = isHabitable;
        this.moons = moons;
    }
    public double getDistanceFromSun10ToPower6Km() {
        return distanceFromSun10ToPower6Km;
    }

    public void setDistanceFromSun10ToPower6Km(double distanceFromSun10ToPower6Km) {
        this.distanceFromSun10ToPower6Km = distanceFromSun10ToPower6Km;
    }

    public boolean isHabitable() {
        return isHabitable;
    }

    public void setHabitable(boolean habitable) {
        isHabitable = habitable;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }
    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }
    @Override
    public String toString(){
        return "Planet name: " + name + ", Planet mass (10^24 KG): " + mass + ", Planet diameter(Km): " + diameter +
                ", Planet's distance from the sun (Km): " + distanceFromSun10ToPower6Km + ", Is this planet habitable?: " + isHabitable;
    }
}
