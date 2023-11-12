# bestvecs

This library implements both mutable and immutable vectors

```java
ImmVec3d foo = Vec3d.immutable(1, 2, 3);
Vec3d bar = foo.multiply(2);
// foo != bar

MutVec3d qux = bar.mutableCopy();
MutVec3d quux = bar.mutableCopy();
// bar != qux
// bar != quux
// qux != quux

MutVec3d corge = qux.multiply(2);
// corge == qux
```
