package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DistanceTests {

    @Test
    public void testArea1(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(10,10);
        Assert.assertEquals(p1.distance(p2),12.727922061357855);
    }

    @Test
    public void testArea2(){
        Point p1 = new Point(5,1);
        Point p2 = new Point(10,5);
        Assert.assertEquals(p1.distance(p2),6.4031242374328485);
    }

    @Test
    public void testArea3(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        Assert.assertEquals(p1.distance(p2),0.0);
    }
}
