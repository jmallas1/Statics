package org.jrm.test;

import org.jrm.person.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person babyShark;
    Person mommyShark;
    Person daddyShark;

    @BeforeEach
    void setUp() {
        babyShark = new Person("Romanie", "Mallas", 5);
        babyShark.setWeight(50);
        mommyShark = new Person ("Laura", "Mallas", 45);
        mommyShark.setWeight(150);
        daddyShark = new Person("Jared", "Mallas", 42);
        daddyShark.setWeight(250);
    }

    @AfterEach
    void tearDown() {
        babyShark = null;
        mommyShark = null;
        daddyShark = null;
        Person.setTotalPeople(0);
    }

    @Test
    void getTotalPeople() {
        assertEquals(3, (int)Person.getTotalPeople(), "Should be three people");
    }

    @Test
    void getFirstPerson() {
        assertEquals(babyShark, Person.getFirstPerson(), "First should be Romanie");
    }

    @Test
    void getLastPerson() {
        assertEquals(daddyShark, Person.getLastPerson(), "Last should be Jared");
    }

    @Test
    void addWeight() {
        babyShark.addWeight((double) 50);

        assertEquals(100, babyShark.getWeight(), "Add weight works");
    }

    @Test
    void loseWeight(){
        babyShark.loseWeight((double)25);

        assertEquals(25, babyShark.getWeight(), "Lose weight works");
    }
}