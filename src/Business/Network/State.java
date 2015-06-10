/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class State {
    
    private String state;
    private ArrayList<Location> locationNetworkList;

    public State() {
        
        locationNetworkList = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<Location> getLocationNetworkList() {
        return locationNetworkList;
    }

    @Override
    public String toString() {
    
        return state;
    }
    
    public Location newLocation(String location){
        Location l = new Location();
        l.setLocation(location);
        locationNetworkList.add(l);
        return l;
    }
    
    
}
