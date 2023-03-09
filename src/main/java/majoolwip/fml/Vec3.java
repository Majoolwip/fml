package majoolwip.fml;

import java.util.Objects;

/**
 * A three-dimensional vector.
 */
public final class Vec3
{
  public float x, y, z;

  /**
   * Constructs a three-dimensional vector with zero for the x, y, and z components.
   */
  public Vec3()
  {
    this.x = 0f;
    this.y = 0f;
    this.z = 0f;
  }

  /**
   * Constructs a three-dimensional vector with the given values for it's x, y, and z components.
   *
   * @param x The x component.
   * @param y The y component.
   * @param z The z component.
   */
  public Vec3(final float x, final float y, final float z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Negates the vector and returns itself.
   *
   * @return A reference to itself.
   */
  public Vec3 negate()
  {
    x = -x;
    y = -y;
    z = -z;
    return this;
  }

  /**
   * Sets this vector's components to be equal to given vectors components.
   *
   * @param v The vector's whose components will be copied.
   * @return A reference to itself.
   */
  public Vec3 set(final Vec3 v)
  {
    x = v.x;
    y = v.y;
    z = v.z;
    return this;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Vec3 otherVec = (Vec3) o;
    return Math.abs(otherVec.x - x) < FML.EPSILON && Math.abs(otherVec.y - y) < FML.EPSILON &&
        Math.abs(otherVec.z - z) < FML.EPSILON;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString()
  {
    return "Vec3{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
  }
}
