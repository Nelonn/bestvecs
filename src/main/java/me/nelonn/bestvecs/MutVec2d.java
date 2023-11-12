package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class MutVec2d extends AbstractVec2d {
    private double x;
    private double y;

    public MutVec2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double x() {
        return this.x;
    }

    public @NotNull MutVec2d x(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double y() {
        return this.y;
    }

    public @NotNull MutVec2d y(double y) {
        this.y = y;
        return this;
    }

    @Override
    public @NotNull MutVec2d with(double x, double y) {
        return this.x(x).y(y);
    }

    @Override
    public @NotNull MutVec2d with(@NotNull Vec2d value) {
        return (MutVec2d) super.with(value);
    }

    @Override
    public @NotNull MutVec2d add(double x, double y) {
        return (MutVec2d) super.add(x, y);
    }

    @Override
    public @NotNull MutVec2d add(@NotNull Vec2d value) {
        return (MutVec2d) super.add(value);
    }

    @Override
    public @NotNull MutVec2d subtract(double x, double y) {
        return (MutVec2d) super.subtract(x, y);
    }

    @Override
    public @NotNull Vec2d subtract(@NotNull Vec2d value) {
        return super.subtract(value);
    }

    @Override
    public @NotNull MutVec2d multiply(double x, double y) {
        return (MutVec2d) super.multiply(x, y);
    }

    @Override
    public @NotNull MutVec2d multiply(double value) {
        return (MutVec2d) super.multiply(value);
    }

    @Override
    public @NotNull MutVec2d lerp(@NotNull Vec2d to, float delta) {
        return (MutVec2d) super.lerp(to, delta);
    }
}
