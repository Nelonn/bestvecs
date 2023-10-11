package me.nelonn.bestvecs;

import org.jetbrains.annotations.NotNull;

public interface Vec3d {

    double x();

    double y();

    double z();

    @NotNull Vec3d with(double x, double y, double z);

    default @NotNull Vec3d add(double x, double y, double z) {
        return this.with(this.x() + x, this.y() + y, this.z() + z);
    }

    default @NotNull Vec3d add(@NotNull Vec3d value) {
        return this.add(value.x(), value.y(), value.z());
    }

    default @NotNull Vec3d subtract(double x, double y, double z) {
        return this.add(-x, -y, -z);
    }

    default @NotNull Vec3d subtract(@NotNull Vec3d value) {
        return this.subtract(value.x(), value.y(), value.z());
    }

    default @NotNull Vec3d multiply(double x, double y, double z) {
        return this.with(this.x() * x, this.y() * y, this.z() * z);
    }

    default @NotNull Vec3d multiply(double value) {
        return this.multiply(value, value, value);
    }

    /**
     * Returns the current vector if it is ImmVec3d, or returns a new one with the same coordinates
     * @return current or new ImmVec3d
     */
    default @NotNull ImmVec3d immutable() {
        return this instanceof ImmVec3d ? (ImmVec3d) this : immutable(x(), y(), z());
    }

    /**
     * Returns the current vector if it is MutVec3d, or returns a new one with the same coordinates
     * @return current or new MutVec3d
     */
    default @NotNull MutVec3d mutable() {
        return this instanceof MutVec3d ? (MutVec3d) this : copy();
    }

    /**
     * Guaranteed to return a new MutVec3d
     * @return new MutVec3d
     */
    default @NotNull MutVec3d copy() {
        return mutable(this.x(), this.y(), this.z());
    }

    static @NotNull ImmVec3d immutable(double x, double y, double z) {
        return ImmVec3d.create(x, y, z);
    }

    static @NotNull MutVec3d mutable(double x, double y, double z) {
        return new MutVec3d(x, y, z);
    }

}
