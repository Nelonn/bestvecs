package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec3f {

    float x();

    float y();

    float z();

    @NotNull Vec3f with(float x, float y, float z);

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

    /**
     * Returns the current vector if it is ImmVec3f, or returns a new one with the same coordinates
     * @return current or new ImmVec3f
     */
    default @NotNull ImmVec3f immutable() {
        return this instanceof ImmVec3f ? (ImmVec3f) this : immutable(x(), y(), z());
    }

    /**
     * Returns the current vector if it is MutVec3f, or returns a new one with the same coordinates
     * @return current or new MutVec3f
     */
    default @NotNull MutVec3f mutable() {
        return this instanceof MutVec3f ? (MutVec3f) this : copy();
    }

    /**
     * Guaranteed to return a new MutVec3f
     * @return new MutVec3f
     */
    default @NotNull MutVec3f copy() {
        return mutable(this.x(), this.y(), this.z());
    }

    static @NotNull ImmVec3f immutable(float x, float y, float z) {
        return ImmVec3f.create(x, y, z);
    }

    static @NotNull MutVec3f mutable(float x, float y, float z) {
        return new MutVec3f(x, y, z);
    }
    
}
