package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class ImmVec3f extends AbstractVec3f {
    public static final ImmVec3f ZERO = new ImmVec3f(0, 0, 0);
    public static final ImmVec3f ONE = new ImmVec3f(1, 1, 1);

    private final float x;
    private final float y;
    private final float z;

    private ImmVec3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static @NotNull ImmVec3f create(float x, float y, float z) {
        if (x == 0 && y == 0 && z == 0) return ZERO;
        if (x == 1 && y == 1 && z == 1) return ONE;
        return new ImmVec3f(x, y, z);
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
    public float z() {
        return this.z;
    }

    @Override
    public @NotNull ImmVec3f with(float x, float y, float z) {
        return create(x, y, z);
    }
}
