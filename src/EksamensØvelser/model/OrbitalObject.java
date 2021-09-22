package EksamensØvelser.model;

public abstract class OrbitalObject {

    protected String name;
    protected double mass;
    protected double diameter;
    protected double number;

    protected OrbitalObject(double number){
        this.number = number;
    }

    protected OrbitalObject(String name, double mass10ToPower24Kg, double diameterKm, double number){
        this.name = name;
        this.mass = mass10ToPower24Kg;
        this.diameter = diameterKm;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
}
}
