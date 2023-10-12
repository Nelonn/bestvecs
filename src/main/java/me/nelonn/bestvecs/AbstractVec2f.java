package me.nelonn.bestvecs;

import java.util.Objects;

public abstract class AbstractVec2f implements Vec2f {

    @Override
    public int hashCode() {
        return Objects.hash(this.x(), this.y());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vec2f)) return false;
        Vec2f other = (Vec2f) o;
        return Float.compare(this.x(), other.x()) == 0 &&
                Float.compare(this.y(), other.y()) == 0;
    }

    @Override
    public String toString() {
        return "(" + this.x() + ", " + this.y() + ")";
    }
}
