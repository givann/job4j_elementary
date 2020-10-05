package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point point = new Point(0, 0);
        Point point1 = new Point(0, 2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        int expected = 1;
        Point point = new Point(1, 0);
        Point point1 = new Point(2, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to30then3() {
        int expected = 3;
        Point point = new Point(0, 0);
        Point point1 = new Point(3, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to30then2() {
        int expected = 2;
        Point point = new Point(1, 0);
        Point point1 = new Point(3, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To333Then5Point2() {
        double expected = 5.2;
        Point point = new Point(0, 0, 0);
        Point point1 = new Point(3, 3, 3);
        double out = point.distance3d(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}