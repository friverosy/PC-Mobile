package com.axxezo.MobileReader;

/**
 * Created by jmora on 21/11/2016.
 */

public class navieraManifest {

    private String people_id;
    private String origin;
    private String destination;
    private int isInside;

    /*
    isInside;
    0 to pending
    1 to embarked/(embarcado)
    2 to  landed(desembarcado)
     */

    public navieraManifest(String people_id, String origin, String destination, int isInside) {
        this.people_id = people_id;
        this.origin = origin;
        this.destination = destination;
        this.isInside = isInside;
    }

    public String getPeople_id() {
        return people_id;
    }

    public void setPeople_id(String people_id) {
        this.people_id = people_id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getIsInside() {
        return isInside;
    }

    public void setIsInside(int isInside) {
        this.isInside = isInside;
    }

    @Override
    public String toString() {
        return "navieraManifest{" +
                "people_id='" + people_id + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", isInside=" + isInside +
                '}';
    }
}
