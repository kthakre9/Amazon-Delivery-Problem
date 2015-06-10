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
public class Country {
    
    private String country;
    private ArrayList<State> stateNetworkList;

    public Country() {
        stateNetworkList = new ArrayList<>();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<State> getStateNetworkList() {
        return stateNetworkList;
    }

    @Override
    public String toString() {
    
        return country;
    }
    
    public State newState(String state){
        State s = new State();
        s.setState(state);
        stateNetworkList.add(s);
        return s;
    }
    
    
    
}
