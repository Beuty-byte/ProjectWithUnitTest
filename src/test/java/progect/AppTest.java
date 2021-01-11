package progect;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void twoExistingRoots() {
        double[] testArray = {-11.744562646538029,-0.2554373534619714};

        assertArrayEquals(testArray, App.quadraticSolution(1,12,3), 0);
    }

    @Test
    public void oneExistingRoot(){
        double[] testArray = {0.0,0.0};

        assertArrayEquals(testArray,App.quadraticSolution(1,0,0),0);
    }

    @Test
    public void withOutRoot(){
        double[] testArray = {-1.0, -1.0};

        assertArrayEquals(testArray,App.quadraticSolution(11,14,12),0);
    }




}