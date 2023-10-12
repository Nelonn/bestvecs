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

    default double length() {
        double x = this.x();
        double y = this.y();
        double z = this.z();
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Returns the current vector if it is immutable, or returns a new immutable with the same coordinates
     * @return current or new immutable vector
     */
    default @NotNull ImmVec3d toImmutable() {
        return this instanceof ImmVec3d ? (ImmVec3d) this : immutable(this.x(), this.y(), this.z());
    }

    /**
     * Guaranteed to return a new mutable vector
     * @return new mutable vector
     */
    default @NotNull MutVec3d mutableCopy() {
        return mutable(this.x(), this.y(), this.z());
    }

    static @NotNull ImmVec3d immutable(double x, double y, double z) {
        return ImmVec3d.create(x, y, z);
    }

    static @NotNull MutVec3d mutable(double x, double y, double z) {
        return new MutVec3d(x, y, z);
    }

}
