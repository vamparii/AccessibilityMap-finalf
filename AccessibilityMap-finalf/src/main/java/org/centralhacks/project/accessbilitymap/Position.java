package org.centralhacks.project.accessbilitymap;

public class Position {
    private float x; //Percentage offset in the x axis (ex. 0.866)
    private float y; //Percentage offset in the y axis (ex. 0.3)

    public Position() {}
    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {return x;}
    public float getY() {return y;}

    public double distanceTo(Position other) {
        return Math.sqrt( Math.pow((x-other.getX()),2) + Math.pow((y-other.getY()),2) );
    }

    @Override
    public String toString() {
        return String.format("%.2f, %.2f",x,y);
    }
}
