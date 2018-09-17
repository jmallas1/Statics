package org.jrm;

import org.jrm.person.Person;
import org.jrm.startup.Startup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Person> someList = Startup.genListOfPeople();
        Person[] someArray = Startup.genArrayOfPeople();

        for (int i = 0; i < someArray.length; i++)
        {
            System.out.println(someArray[i].getFirstName() + " " + someArray[i].getLastName());
        }

        for (Person somePerson : someList)
        {
            System.out.println(somePerson.getFirstName() + " " + somePerson.getLastName());
        }
    }
}
