package org.jrm.person;

import org.jrm.interfaces.Weighable;

/**
 * Class model for a person
 * @author Jared Mallas
 * @version 1.0
 */
public class Person implements Weighable
{
    private String firstName;
    private String lastName;
    private Integer age;
    private static Integer totalPeople = 0;
    private static Person firstPerson = null;
    private static Person lastPerson = null;
    private double weight;

    public static Integer getTotalPeople() { return totalPeople; }
    public static void setTotalPeople(int i) { totalPeople = i; }
    public static Person getFirstPerson() { return firstPerson; }
    public static Person getLastPerson() { return lastPerson; }

    /**
     * Base constructor
     * @param firstName first name
     * @param lastName last name
     * @param age age
     */
    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.totalPeople += 1;
        this.lastPerson = this;
        if (Person.getFirstPerson() == null)
        {
            this.firstPerson = this;
        }
    }

    /**
     * Base constructor
     * @param firstName first name
     * @param lastName last name
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPeople += 1;
        this.lastPerson = this;
        if (Person.getFirstPerson() == null)
        {
            this.firstPerson = this;
        }
    }

    /**
     * Base constructor
     * @param firstName first name
     */
    public Person(String firstName)
    {
        this.firstName = firstName;
        this.totalPeople += 1;
        this.lastPerson = this;
        if (Person.getFirstPerson() == null)
        {
            this.firstPerson = this;
        }
    }

    /**
     * Base constructor
     * @param lastName last name
     * @param age age
     */
    public Person(String lastName, Integer age)
    {
        this.lastName = lastName;
        this.age = age;
        this.totalPeople += 1;
        this.lastPerson = this;
        if (Person.getFirstPerson() == null)
        {
            this.firstPerson = this;
        }
    }

    /**
     * Base constructor
     * @param age age
     */
    public Person(Integer age)
    {
        this.age = age;
        this.totalPeople += 1;
        this.lastPerson = this;
        if (Person.getFirstPerson() == null)
        {
            this.firstPerson = this;
        }
    }

    /* getters and setters */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void addWeight(Double pounds)
    {
        this.setWeight(this.getWeight() + pounds);
    }

    @Override
    public void loseWeight(Double pounds)
    {
        this.setWeight(this.getWeight()-pounds);
    }
}
