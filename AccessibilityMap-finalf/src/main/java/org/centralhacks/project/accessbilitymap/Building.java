package org.centralhacks.project.accessbilitymap;

import java.util.ArrayList;

public class Building { 
    private ArrayList<Door> doors = new ArrayList<Door>();
    private ArrayList<Ramp> ramps = new ArrayList<Ramp>();
    private ArrayList<Elevator> elevators = new ArrayList<Elevator>();
    private ArrayList<WheelchairArea> wheelchairAreas = new ArrayList<WheelchairArea>();

    private Position position;
    private String name;

    //Constructors
    public Building() {}
    public Building(String name) {
        this.name = name;
    }
    public Building(String name, Position position) {
        this.name = name;
        this.position = position;
    }
    public Building (Position position) {
        this.position = position;
    }

    //Getters
    public String getName() {return name;}
    public Position getPosition() {return position;}
    public ArrayList<Door> getDoors() {return doors;}
    public ArrayList<Ramp> getRamps() {return ramps;}
    public ArrayList<Elevator> getElevators() {return elevators;}
    public ArrayList<WheelchairArea> getWheelchairAreas() {return wheelchairAreas;}

    //Getters
    public void setName(String name) {this.name = name;}
    public void setPosition(Position position) {this.position = position;}
    public void setDoors(ArrayList<Door> doors) {this.doors = doors;}
    public void setRamps(ArrayList<Ramp> ramps) {this.ramps = ramps;}
    public void setElevators(ArrayList<Elevator> elevators) {this.elevators = elevators;}
    public void setWheelchairAreas(ArrayList<WheelchairArea> wheelchairAreas) {this.wheelchairAreas = wheelchairAreas;}
    
    // Methods
    public void addAccessbilityFeature(AccessibilityFeature feature) {
        if (feature instanceof Door typedFeature) {
            doors.add(typedFeature);
        } else if (feature instanceof Ramp typedFeature) {
            ramps.add(typedFeature);
        } else if (feature instanceof Elevator typedFeature) {
            elevators.add(typedFeature);
        } else if (feature instanceof WheelchairArea typedFeature) {
            wheelchairAreas.add(typedFeature);
        }
    }

    @Override
    public String toString() {
        String result = "Name: "+name+"\nPosition: "+position+"\n";
        for (var feature : doors) {result += String.format("%16s %s\n","Door:",feature);}
        for (var feature : ramps) {result += String.format("%16s %s\n","Ramp:",feature);}
        for (var feature : elevators) {result += String.format("%16s %s\n","Elevator:",feature);}
        for (var feature : wheelchairAreas) {result += String.format("%16s %s\n","Wheelchair Area:",feature);}
        return result;
    }
}