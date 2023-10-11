package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class ImmVec3d extends AbstractVec3d {
    public static final ImmVec3d ZERO = new ImmVec3d(0, 0, 0);
    public static final ImmVec3d ONE = new ImmVec3d(1, 1, 1);

    private final double x;
    private final double y;
    private final double z;

    private ImmVec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static @NotNull ImmVec3d create(double x, double y, double z) {
        if (x == 0 && y == 0 && z == 0) return ZERO;
        if (x == 1 && y == 1 && z == 1) return ONE;
        return new ImmVec3d(x, y, z);
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
    public double z() {
        return z;
    }

    @Override
    public @NotNull ImmVec3d with(double x, double y, double z) {
        return create(x, y, z);
    }
}
