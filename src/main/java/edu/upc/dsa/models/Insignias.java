package edu.upc.dsa.models;

public class Insignias {
    private String name;
    private String location;

    public Insignias(){}
    public Insignias(String name, String location){
        this();
        setName(name);
        setLocation(location);
    }
    //Getters and setters
    public void setName(String name) {this.name = name;}
    public void setLocation(String location) {this.location = location;}
    public String getName() {return name;}
    public String getLocation() {return location;}
}
