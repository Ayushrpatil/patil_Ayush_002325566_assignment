/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Patil
 */
public class personhistory {
    private ArrayList<person> persons;
    public personhistory(){
        this.persons = new ArrayList<person>();
    }
    public ArrayList<person> getPersonshistory() {
        return persons;
    }
    public void setPersons(ArrayList<person> persons){
        this.persons = persons;
    }
    public person addPerson(){
        person p = new person();
        persons.add(p);
        return p;
    }
    public void deletePerson(person Person){
        persons.remove(Person);
    }
    public person searchPerson(String FirstName) {
        for (person p : persons) {
            if (p.getFirstName().contains(FirstName)){
                return p;
            }
        }
        return null;
    }
}
