package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class ImmVec2d extends AbstractVec2d {
    public static final ImmVec2d ZERO = new ImmVec2d(0, 0);
    public static final ImmVec2d ONE = new ImmVec2d(1, 1);

    private final double x;
    private final double y;

    private ImmVec2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static @NotNull ImmVec2d create(double x, double y) {
        if (x == 0 && y == 0) return ZERO;
        if (x == 1 && y == 1) return ONE;
        return new ImmVec2d(x, y);
    }

    @Override
    public double x() {
        return x;
    }

    @Override
    public double y() {
        return y;
    }

    @Override
    public @NotNull ImmVec2d with(double x, double y) {
        return create(x, y);
    }
}
