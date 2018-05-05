# jme-transition
Small library for smooth transitions in jME

```
// add rotation transition
spatial.addControl(new TransitionControl(SpatialChanges.rotation(spatial), 0.35f, SpatialInterpolations.rotateTo(spatial, to), EasingFunction.EASE_IN_OUT_BACK));

// add translation transition
spatial.addControl(new TransitionControl(SpatialChanges.translation(spatial), 0.1f, SpatialInterpolations.translateTo(spatial, to), EasingFunction.EASE_OUT));

// TransitionControl will remove itself from spatial when transition is finished
```


![example](https://user-images.githubusercontent.com/5871626/39665954-5c56a4cc-509c-11e8-9628-39504e9064aa.gif)
