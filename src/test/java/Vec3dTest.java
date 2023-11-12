import me.nelonn.bestvecs.ImmVec3d;
import me.nelonn.bestvecs.MutVec3d;
import me.nelonn.bestvecs.Vec3d;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vec3dTest {

    @Test
    void immutableIsImmutable() {
        ImmVec3d foo = Vec3d.immutable(1, 2, 3);
        Vec3d bar = foo.multiply(2);
        assert foo != bar;
    }

    @Test
    void mutableIsMutable() {
        MutVec3d foo = Vec3d.mutable(1, 1, 1);
        MutVec3d bar = foo.multiply(2);
        assertEquals(foo, bar);
        assert foo == bar;
    }

    @Test
    void mutableCopyIsUnique() {
        ImmVec3d foo = ImmVec3d.ONE;
        MutVec3d bar = foo.mutableCopy();
        MutVec3d baz = foo.mutableCopy();
        assert bar != baz;
    }

}
