package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec3f {

    float x();

    float y();

    float z();

    @NotNull Vec3f with(float x, float y, float z);

    default @NotNull Vec3f with(@NotNull Vec3f value) {
        return this.with(value.x(), value.y(), value.z());
    }

    default @NotNull Vec3f add(float x, float y, float z) {
        return this.with(this.x() + x, this.y() + y, this.z() + z);
    }

    default @NotNull Vec3f add(@NotNull Vec3f value) {
        return this.add(value.x(), value.y(), value.z());
    }

    default @NotNull Vec3f subtract(float x, float y, float z) {
        return this.add(-x, -y, -z);
    }

    default @NotNull Vec3f subtract(@NotNull Vec3f value) {
        return this.subtract(value.x(), value.y(), value.z());
    }

    default @NotNull Vec3f multiply(float x, float y, float z) {
        return this.with(this.x() * x, this.y() * y, this.z() * z);
    }

    default @NotNull Vec3f multiply(float value) {
        return this.multiply(value, value, value);
    }

    default @NotNull Vec3f lerp(@NotNull Vec3f to, float delta) {
        return this.with(lerp(delta, this.x(), to.x()), lerp(delta, this.y(), to.y()), lerp(delta, this.z(), to.z()));
    }

    default float length() {
        float x = this.x();
        float y = this.y();
        float z = this.z();
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Returns the current vector if it is immutable, or returns a new immutable with the same coordinates
     * @return current or new immutable vector
     */
    default @NotNull ImmVec3f toImmutable() {
        return this instanceof ImmVec3f ? (ImmVec3f) this : immutable(this.x(), this.y(), this.z());
    }

    /**
     * Guaranteed to return a new mutable vector
     * @return new mutable vector
     */
    default @NotNull MutVec3f mutableCopy() {
        return mutable(this.x(), this.y(), this.z());
    }

    static @NotNull ImmVec3f immutable(float x, float y, float z) {
        return ImmVec3f.create(x, y, z);
    }

    static @NotNull MutVec3f mutable(float x, float y, float z) {
        return new MutVec3f(x, y, z);
    }

    private static float lerp(float delta, float start, float end) {
        return start + delta * (end - start);
    }

}
