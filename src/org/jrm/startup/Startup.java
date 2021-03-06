package org.jrm.startup;

import org.jrm.person.Person;

import java.util.ArrayList;

/**
 * Class model for Startup class
 * @author Jared Mallas
 * @version 1.0
 */
public class Startup
{
    /**
     * Generate a list of people to be used for class examples
     * @return ArrayList of "people" objects
     */
    public static ArrayList<Person> genListOfPeople()
    {
        Integer counter = 0;

        ArrayList<Person> rList = new ArrayList<Person>();

        rList.add(genPerson("Jared", "Mallas", 42));
        rList.add(genPerson("Laura", "Mallas", 45));
        rList.add(genPerson("Romanie", "Mallas", 5));

        return rList;
    }

    /**
     * Generate an array of people to be used for class examples
     * @return array populated with people
     */
    public static Person[] genArrayOfPeople()
    {
        Person[] rArray = new Person[3];

        rArray[0] = genPerson("Jared", "Mallas", 42);
        rArray[1] = genPerson("Laura", "Mallas", 45);
        rArray[2] = genPerson("Romanie", "Mallas", 5);

        return rArray;
    }

    /**
     * Private method to generate "a person." Im unclear why this had to be static...
     * @param fName First name of person
     * @param lName Last name of person
     * @param age Age of person
     * @return a person
     */
    private static Person genPerson(String fName, String lName, Integer age)
    {
        return new Person(fName, lName, age);
    }

}
