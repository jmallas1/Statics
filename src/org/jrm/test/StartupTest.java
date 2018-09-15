package org.jrm.test;

import org.jrm.startup.Startup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StartupTest {

    private Startup st;

    @BeforeEach
    void setUp() {
        st = new Startup();
    }

    @AfterEach
    void tearDown() {
        st = null;
    }

    @Test
    void genListOfPeople()
    {
        ArrayList x = Startup.genListOfPeople();
        assertEquals(3, x.size(), "should produce a list of three people");
    }
}