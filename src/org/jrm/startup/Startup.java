package org.jrm.startup;

import org.jrm.person.Person;

import java.util.ArrayList;

public class Startup
{
    public static ArrayList<Person> genListOfPeople()
    {
        Person somePerson;
        Integer counter = 0;

        ArrayList<Person> rList = new ArrayList<Person>();

        somePerson = new Person("Jared", "Mallas", 42);
        counter = Person.getTotalPeople();
        rList.add(somePerson);

        somePerson = new Person("Laura", "Mallas", 45);
        counter = Person.getTotalPeople();
        rList.add(somePerson);

        somePerson = new Person("Romanie", "Mallas", 5);
        counter = Person.getTotalPeople();
        rList.add(somePerson);

        return rList;
    }

}
