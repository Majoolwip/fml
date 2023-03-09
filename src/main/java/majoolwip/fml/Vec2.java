package majoolwip.fml;

import java.util.Objects;

/**
 * A two-dimensional vector.
 */
public final class Vec2
{
  public float x, y;

  /**
   * Constructs a two-dimensional vector with zero for the x and y components.
   */
  public Vec2()
  {
    this.x = 0f;
    this.y = 0f;
  }

  /**
   * Constructs a two-dimensional vector with the given values for it's x and y components.
   *
   * @param x The x component.
   * @param y The y component.
   */
  public Vec2(final float x, final float y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Negates the vector and returns itself.
   *
   * @return A reference to itself.
   */
  public Vec2 negate()
  {
    x = -x;
    y = -y;
    return this;
  }

  /**
   * Sets this vector's components to be equal to given vectors components.
   *
   * @param v The vector's whose components will be copied.
   * @return A reference to itself.
   */
  public Vec2 set(final Vec2 v)
  {
    x = v.x;
    y = v.y;
    return this;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Vec2 otherVec = (Vec2) o;
    return Math.abs(otherVec.x - x) < FML.EPSILON && Math.abs(otherVec.y - y) < FML.EPSILON;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(x, y);
  }

  @Override
  public String toString()
  {
    return "Vec2{" + "x=" + x + ", y=" + y + '}';
  }
}
