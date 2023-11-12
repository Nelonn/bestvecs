package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public class MutVec2f extends AbstractVec2f {
    private float x;
    private float y;

    public MutVec2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float x() {
        return this.x;
    }

    public @NotNull MutVec2f x(float x) {
        this.x = x;
        return this;
    }

    @Override
    public float y() {
        return this.y;
    }

    public @NotNull MutVec2f y(float y) {
        this.y = y;
        return this;
    }

    @Override
    public @NotNull MutVec2f with(float x, float y) {
        return new MutVec2f(x, y);
    }

    @Override
    public @NotNull MutVec2f with(@NotNull Vec2f value) {
        return (MutVec2f) super.with(value);
    }

    @Override
    public @NotNull MutVec2f add(float x, float y) {
        return (MutVec2f) super.add(x, y);
    }

    @Override
    public @NotNull MutVec2f add(@NotNull Vec2f value) {
        return (MutVec2f) super.add(value);
    }

    @Override
    public @NotNull MutVec2f subtract(float x, float y) {
        return (MutVec2f) super.subtract(x, y);
    }

    @Override
    public @NotNull MutVec2f subtract(@NotNull Vec2f value) {
        return (MutVec2f) super.subtract(value);
    }

    @Override
    public @NotNull MutVec2f multiply(float x, float y) {
        return (MutVec2f) super.multiply(x, y);
    }

    @Override
    public @NotNull MutVec2f multiply(float value) {
        return (MutVec2f) super.multiply(value);
    }

    @Override
    public @NotNull MutVec2f lerp(@NotNull Vec2f to, float delta) {
        return (MutVec2f) super.lerp(to, delta);
    }
}
