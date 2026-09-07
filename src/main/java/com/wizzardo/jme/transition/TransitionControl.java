package com.wizzardo.jme.transition;

import com.jme3.renderer.RenderManager;
import com.jme3.renderer.ViewPort;
import com.jme3.scene.control.AbstractControl;

public class TransitionControl extends AbstractControl {

    protected final Transition transition;
    protected boolean loop;
    protected boolean reverseOnLoop;

    public TransitionControl(Transition transition) {
        this.transition = transition;
        transition.onEnd(() -> {
            if (!loop) {
                if (spatial != null)
                    spatial.removeControl(this);
            } else {
                if (reverseOnLoop) {
                    transition.reverse(!transition.reverse);
                } else {
                    transition.elapsedTime = transition.reverse ? transition.duration : 0;
                }
            }
        });
    }

    public <T> TransitionControl(Change<T> change, float duration, Interpolation<T> interpolation, EasingFunction easingFunction) {
        this(new Transition<>(change, duration, interpolation, easingFunction));
    }

    public TransitionControl loop(boolean loop) {
        this.loop = loop;
        return this;
    }

    public TransitionControl reverseOnLoop(boolean reverseOnLoop) {
        this.reverseOnLoop = reverseOnLoop;
        return this;
    }

    @Override
    protected void controlUpdate(float tpf) {
        transition.update(tpf);
    }

    @Override
    protected void controlRender(RenderManager rm, ViewPort vp) {
    }
}
