package org.example.classes;


import org.example.classes.classes.Moto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotoTest {


        private Moto moto;

        @Before
        public void setup(){ moto=new Moto(100);}
        @Test
        public void testCantKmMoto (){assertEquals(100,moto.getKmMoto());}

    }

