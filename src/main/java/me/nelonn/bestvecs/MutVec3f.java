package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class MutVec3f extends AbstractVec3f {
    private float x;
    private float y;
    private float z;

    public MutVec3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float x() {
        return this.x;
    }

    public @NotNull MutVec3f x(float x) {
        this.x = x;
        return this;
    }

    @Override
    public float y() {
        return this.y;
    }

    public @NotNull MutVec3f y(float y) {
        this.y = y;
        return this;
    }

    @Override
    public float z() {
        return this.z;
    }

    public @NotNull MutVec3f z(float z) {
        this.z = z;
        return this;
    }

    @Override
    public @NotNull MutVec3f with(float x, float y, float z) {
        return this.x(x).y(y).z(z);
    }

    @Override
    public @NotNull MutVec3f add(float x, float y, float z) {
        return (MutVec3f) super.add(x, y, z);
    }

    @Override
    public @NotNull MutVec3f add(@NotNull Vec3f value) {
        return (MutVec3f) super.add(value);
    }

    @Override
    public @NotNull MutVec3f subtract(float x, float y, float z) {
        return (MutVec3f) super.subtract(x, y, z);
    }

    @Override
    public @NotNull MutVec3f subtract(@NotNull Vec3f value) {
        return (MutVec3f) super.subtract(value);
    }

    @Override
    public @NotNull MutVec3f multiply(float x, float y, float z) {
        return (MutVec3f) super.multiply(x, y, z);
    }

    @Override
    public @NotNull MutVec3f multiply(float value) {
        return (MutVec3f) super.multiply(value);
    }
}
