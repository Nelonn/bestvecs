package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec2d {

    double x();

    double y();

    @NotNull Vec2d with(double x, double y);

    default @NotNull Vec2d add(double x, double y) {
        return this.with(this.x() + x, this.y() + y);
    }

    default @NotNull Vec2d add(@NotNull Vec2d value) {
        return this.add(value.x(), value.y());
    }

    default @NotNull Vec2d subtract(double x, double y) {
        return this.add(-x, -y);
    }

    default @NotNull Vec2d subtract(@NotNull Vec2d value) {
        return this.subtract(value.x(), value.y());
    }

    default @NotNull Vec2d multiply(double x, double y) {
        return this.with(this.x() * x, this.y() * y);
    }

    default @NotNull Vec2d multiply(double value) {
        return this.multiply(value, value);
    }

    /**
     * Returns the current vector if it is ImmVec2d, or returns a new one with the same coordinates
     * @return current or new ImmVec2d
     */
    default @NotNull ImmVec2d immutable() {
        return this instanceof ImmVec2d ? (ImmVec2d) this : immutable(x(), y());
    }

    /**
     * Returns the current vector if it is MutVec2d, or returns a new one with the same coordinates
     * @return current or new MutVec2d
     */
    default @NotNull MutVec2d mutable() {
        return this instanceof MutVec2d ? (MutVec2d) this : copy();
    }

    /**
     * Guaranteed to return a new MutVec3d
     * @return new MutVec3d
     */
    default @NotNull MutVec2d copy() {
        return mutable(this.x(), this.y());
    }

    static @NotNull ImmVec2d immutable(double x, double y) {
        return ImmVec2d.create(x, y);
    }

    static @NotNull MutVec2d mutable(double x, double y) {
        return new MutVec2d(x, y);
    }

}