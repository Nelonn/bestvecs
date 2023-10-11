package me.nelonn.bestvecs;

import java.util.Objects;

public abstract class AbstractVec3d implements Vec3d {

    @Override
    public int hashCode() {
        return Objects.hash(this.x(), this.y(), this.z());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vec3d)) return false;
        Vec3d other = (Vec3d) o;
        return Double.compare(this.x(), other.x()) == 0 &&
                Double.compare(this.y(), other.y()) == 0 &&
                Double.compare(this.z(), other.z()) == 0;
    }

    @Override
    public String toString() {
        return "(" + this.x() + ", " + this.y() + ", " + this.z() + ")";
    }
}
