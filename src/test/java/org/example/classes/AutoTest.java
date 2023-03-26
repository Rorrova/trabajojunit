package org.example.classes;


import org.example.classes.classes.Auto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {
    private Auto auto;

    @Before
    public void setup(){ auto=new Auto(120);}
    @Test
    public void testCantKmAuto (){assertEquals(120,auto.getKmAuto());}

}
