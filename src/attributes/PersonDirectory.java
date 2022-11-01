/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dheer
 */
public class PersonDirectory {
    private List<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
     public Person addPerson(){
        Person d =new Person();
        personDirectory.add(d);
        return d;
    }
    public void delete(Person person){
        personDirectory.remove(person);
        
    }
    
}
