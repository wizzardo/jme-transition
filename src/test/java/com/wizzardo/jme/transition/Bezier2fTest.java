package com.wizzardo.jme.transition;

import com.jme3.math.Vector2f;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wizzardo on 08/07/17.
 */
public class Bezier2fTest {

    @Test
    public void test_shift() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(0, 0))
                .append(new Vector2f(1, 1));

        Bezier2f shift = curve.shift(new Vector2f(1, 1));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(1, 1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(2, 2), shift.getPoints().get(1));
    }

    @Test
    public void test_turn90() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(1, 0))
                .append(new Vector2f(0, 1));

        Bezier2f shift = curve.turn90(new Vector2f(0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(0, 1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(-1, 0), shift.getPoints().get(1));
    }

    @Test
    public void test_turn180() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(1, 0))
                .append(new Vector2f(0, 1));

        Bezier2f shift = curve.turn180(new Vector2f(0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(-1, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(0, -1), shift.getPoints().get(1));
    }

    @Test
    public void test_turn270() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(1, 0))
                .append(new Vector2f(0, 1));

        Bezier2f shift = curve.turn270(new Vector2f(0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(0, -1), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(1, 0), shift.getPoints().get(1));
    }

    @Test
    public void test_mirrorX() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(1, 0))
                .append(new Vector2f(0, 1));

        Bezier2f shift = curve.mirrorX(new Vector2f(0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(1, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(0, -1), shift.getPoints().get(1));
    }

    @Test
    public void test_mirrorY() {
        Bezier2f curve = new Bezier2f()
                .append(new Vector2f(1, 0))
                .append(new Vector2f(0, 1));

        Bezier2f shift = curve.mirrorY(new Vector2f(0, 0));
        Assert.assertNotSame(shift, curve);
        Assert.assertEquals(new Vector2f(-1, 0), shift.getPoints().get(0));
        Assert.assertEquals(new Vector2f(0, 1), shift.getPoints().get(1));
    }

}