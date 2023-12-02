package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec2d {

    double x();

    double y();

    @NotNull Vec2d with(double x, double y);

    default @NotNull Vec2d with(@NotNull Vec2d value) {
        return this.with(value.x(), value.y());
    }

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

    default @NotNull Vec2d lerp(@NotNull Vec2d to, float delta) {
        return this.with(lerp(delta, this.x(), to.x()), lerp(delta, this.y(), to.y()));
    }

    default @NotNull Vec2d normalize() {
        double invLength = 1.0D / this.length();
        return this.with(this.x() * invLength, this.y() * invLength);
    }

    default double length() {
        double x = this.x();
        double y = this.y();
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Returns the current vector if it is immutable, or returns a new immutable with the same coordinates
     * @return current or new immutable vector
     */
    default @NotNull ImmVec2d toImmutable() {
        return this instanceof ImmVec2d ? (ImmVec2d) this : immutable(this.x(), this.y());
    }

    /**
     * Guaranteed to return a new mutable vector
     * @return new mutable vector
     */
    default @NotNull MutVec2d mutableCopy() {
        return mutable(this.x(), this.y());
    }

    static @NotNull ImmVec2d immutable(double x, double y) {
        return ImmVec2d.create(x, y);
    }

    static @NotNull MutVec2d mutable(double x, double y) {
        return new MutVec2d(x, y);
    }

    private static double lerp(float delta, double start, double end) {
        return start + delta * (end - start);
    }

}
