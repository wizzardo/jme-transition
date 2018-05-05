package com.wizzardo.jme.transition;

import com.jme3.math.Vector3f;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wizzardo on 08/07/17.
 */
public class Bezier3fTest {

    @Test
    public void test_shift() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(0, 0, 0))
                .append(new Vector3f(1, 0, 1));

        Bezier3f shift = curve.shift(new Vector3f(1, 0, 1));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(1, 0, 1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(2, 0, 2), shift.getPoints().get(1));
    }

    @Test
    public void test_turn90() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.turn90(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(0, 0, 1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(-1, 0, 0), shift.getPoints().get(1));
    }

    @Test
    public void test_turn180() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.turn180(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(-1, 0, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(0, 0, -1), shift.getPoints().get(1));
    }

    @Test
    public void test_turn270() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.turn270(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(0, 0, -1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(1, 0, 0), shift.getPoints().get(1));
    }

    @Test
    public void test_mirrorX() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.mirrorX(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(1, 0, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(0, 0, -1), shift.getPoints().get(1));
    }

    @Test
    public void test_mirrorY() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.mirrorY(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(-1, 0, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(0, 0, -1), shift.getPoints().get(1));
    }

    @Test
    public void test_mirrorZ() {
        Bezier3f curve = new Bezier3f()
                .append(new Vector3f(1, 0, 0))
                .append(new Vector3f(0, 0, 1));

        Bezier3f shift = curve.mirrorZ(new Vector3f(0, 0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector3f(-1, 0, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector3f(0, 0, 1), shift.getPoints().get(1));
    }
}