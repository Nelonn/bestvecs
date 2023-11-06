package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec2f {

    float x();

    float y();

    @NotNull Vec2f with(float x, float y);

    default @NotNull Vec2f set(@NotNull Vec2f value) {
        return this.with(value.x(), value.y());
    }

    default @NotNull Vec2f add(float x, float y) {
        return this.with(this.x() + x, this.y() + y);
    }

    default @NotNull Vec2f add(@NotNull Vec2f value) {
        return this.add(value.x(), value.y());
    }

    default @NotNull Vec2f subtract(float x, float y) {
        return this.add(-x, -y);
    }

    default @NotNull Vec2f subtract(@NotNull Vec2f value) {
        return this.subtract(value.x(), value.y());
    }

    default @NotNull Vec2f multiply(float x, float y) {
        return this.with(this.x() * x, this.y() * y);
    }

    default @NotNull Vec2f multiply(float value) {
        return this.multiply(value, value);
    }

    default @NotNull Vec2f lerp(@NotNull Vec2f to, float delta) {
        return this.with(lerp(delta, this.x(), to.x()), lerp(delta, this.y(), to.y()));
    }

    default float length() {
        float x = this.x();
        float y = this.y();
        return (float) Math.sqrt(x * x + y * y);
    }

    /**
     * Returns the current vector if it is immutable, or returns a new immutable with the same coordinates
     * @return current or new immutable vector
     */
    default @NotNull ImmVec2f toImmutable() {
        return this instanceof ImmVec2f ? (ImmVec2f) this : immutable(this.x(), this.y());
    }

    /**
     * Guaranteed to return a new mutable vector
     * @return new mutable vector
     */
    default @NotNull MutVec2f mutableCopy() {
        return mutable(this.x(), this.y());
    }

    static @NotNull ImmVec2f immutable(float x, float y) {
        return ImmVec2f.create(x, y);
    }

    static @NotNull MutVec2f mutable(float x, float y) {
        return new MutVec2f(x, y);
    }

    private static float lerp(float delta, float start, float end) {
        return start + delta * (end - start);
    }

}
