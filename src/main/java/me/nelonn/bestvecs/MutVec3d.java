package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class MutVec3d extends AbstractVec3d {
    private double x;
    private double y;
    private double z;

    public MutVec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double x() {
        return this.x;
    }

    public @NotNull MutVec3d x(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double y() {
        return this.y;
    }

    public @NotNull MutVec3d y(double y) {
        this.y = y;
        return this;
    }

    @Override
    public double z() {
        return this.z;
    }

    public @NotNull MutVec3d z(double z) {
        this.z = z;
        return this;
    }

    @Override
    public @NotNull MutVec3d with(double x, double y, double z) {
        return this.x(x).y(y).z(z);
    }

    @Override
    public @NotNull MutVec3d with(@NotNull Vec3d value) {
        return (MutVec3d) super.with(value);
    }

    @Override
    public @NotNull MutVec3d add(double x, double y, double z) {
        return (MutVec3d) super.add(x, y, z);
    }

    @Override
    public @NotNull MutVec3d add(@NotNull Vec3d value) {
        return (MutVec3d) super.add(value);
    }

    @Override
    public @NotNull MutVec3d subtract(double x, double y, double z) {
        return (MutVec3d) super.subtract(x, y, z);
    }

    @Override
    public @NotNull MutVec3d subtract(@NotNull Vec3d value) {
        return (MutVec3d) super.subtract(value);
    }

    @Override
    public @NotNull MutVec3d multiply(double x, double y, double z) {
        return (MutVec3d) super.multiply(x, y, z);
    }

    @Override
    public @NotNull MutVec3d multiply(double value) {
        return (MutVec3d) super.multiply(value);
    }

    @Override
    public @NotNull MutVec3d lerp(@NotNull Vec3d to, float delta) {
        return (MutVec3d) super.lerp(to, delta);
    }
}
