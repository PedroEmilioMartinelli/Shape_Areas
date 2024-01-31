package app.entisits;

import app.entisits.enums.Color;

public class Circle extends Shape{

    private  double raidus;


    public Circle(){

    }

    public Circle(Color color, double raidus) {
        super(color);
        this.raidus = raidus;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;

    }

    @Override
    public double area() {
        return Math.PI * raidus * raidus;
    }


}
