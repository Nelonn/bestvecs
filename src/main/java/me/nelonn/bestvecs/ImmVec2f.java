package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class ImmVec2f extends AbstractVec2f {
    public static final ImmVec2f ZERO = new ImmVec2f(0, 0);
    public static final ImmVec2f ONE = new ImmVec2f(1, 1);

    private final float x;
    private final float y;

    private ImmVec2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static @NotNull ImmVec2f create(float x, float y) {
        if (x == 0 && y == 0) return ZERO;
        if (x == 1 && y == 1) return ONE;
        return new ImmVec2f(x, y);
    }

    @Override
    public float x() {
        return this.x;
    }

    @Override
    public float y() {
        return this.y;
    }

    @Override
    public @NotNull ImmVec2f with(float x, float y) {
        return create(x, y);
    }
}
