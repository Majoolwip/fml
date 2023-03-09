package majoolwip.fml;

import java.util.Objects;

/**
 * A quaternion.
 */
public final class Quat
{
  public float x, y, z, w;

  /**
   * Constructs a quaternion with zero for the x, y, and z components and one for it's w component.
   */
  public Quat()
  {
    this.x = 0f;
    this.y = 0f;
    this.z = 0f;
    this.w = 1f;
  }

  /**
   * Constructs a quaternion with the given values for it's x, y, z, and w components.
   *
   * @param x The x component.
   * @param y The y component.
   * @param z The z component.
   * @param w The w component.
   */
  public Quat(final float x, final float y, final float z, final float w)
  {
    this.x = x;
    this.y = y;
    this.z = z;
    this.w = w;
  }

  /**
   * Constructs a quaternion from a given axis and a rotation in radians on that axis.
   *
   * @param axis    The axis the quaternion will be rotated around.
   * @param radians The angle in radians that the quaternion will be rotated around the given "axis".
   */
  public Quat(final Vec3 axis, float radians)
  {
    float sinHalfRadians = (float) Math.sin(radians / 2.0f);
    x = axis.x * sinHalfRadians;
    y = axis.y * sinHalfRadians;
    z = axis.z * sinHalfRadians;
    w = (float) Math.cos(radians / 2);
  }

  /**
   * Conjugates the quaternion and returns itself.
   *
   * @return A reference to itself.
   */
  public Quat conjugate()
  {
    x = -x;
    y = -y;
    z = -z;
    return this;
  }

  /**
   * Sets this quaternion's components to be equal to given quaternion's components.
   *
   * @param q The quaternion whose components will be copied.
   * @return A reference to itself.
   */
  public Quat set(final Quat q)
  {
    x = q.x;
    y = q.y;
    z = q.z;
    return this;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Quat otherQuat = (Quat) o;
    return Math.abs(otherQuat.x - x) < FML.EPSILON && Math.abs(otherQuat.y - y) < FML.EPSILON &&
        Math.abs(otherQuat.z - z) < FML.EPSILON && Math.abs(otherQuat.w - w) < FML.EPSILON;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(x, y, z, w);
  }

  @Override
  public String toString()
  {
    return "Quat{" + "x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + '}';
  }
}
