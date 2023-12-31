package me.nelonn.bestvecs;

import java.util.Objects;

public abstract class AbstractVec2d implements Vec2d {

    @Override
    public int hashCode() {
        return Objects.hash(this.x(), this.y());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vec2d)) return false;
        Vec2d other = (Vec2d) o;
        return Double.compare(this.x(), other.x()) == 0 &&
                Double.compare(this.y(), other.y()) == 0;
    }

    @Override
    public String toString() {
        return "(" + this.x() + ", " + this.y() + ")";
    }
}
