package majoolwip.fml;

/**
 * Fast Math Library static math functions.
 * <p>
 * The goal of the methods in this class is to not allocate any memory in their execution. Thus, some duplicated code
 * will be created to avoid calling "new". The only methods exempt from this avoidance of new are methods that started
 * with "create".
 */
@SuppressWarnings("DuplicatedCode")
public final class FML
{
  public static final float EPSILON = 1e-8f;

  /**
   * Calculates the length of the given quaternion.
   *
   * @param q The quaternion whose length will be calculated.
   * @return The length of the quaternion.
   */
  public static float length(final Quat q)
  {
    return (float) Math.sqrt(q.x * q.x + q.y * q.y + q.z * q.z + q.w * q.w);
  }

  /**
   * Calculates the length of the given three-dimensional vector.
   *
   * @param v The vector's whose length will be calculated.
   * @return The length of the vector.
   */
  public static float length(final Vec3 v)
  {
    return (float) Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z);
  }

  /**
   * Calculates the squared length of the given three-dimensional vector.
   *
   * @param v The vector's whose squared length will be calculated.
   * @return The squared length of the vector.
   */
  public static float lengthSq(final Vec3 v)
  {
    return v.x * v.x + v.y * v.y + v.z * v.z;
  }

  /**
   * Calculates the length of the given two-dimensional vector.
   *
   * @param v The vector's whose length will be calculated.
   * @return The length of the vector.
   */
  public static float length(final Vec2 v)
  {
    return (float) Math.sqrt(v.x * v.x + v.y * v.y);
  }

  /**
   * Calculates the squared length of the given two-dimensional vector.
   *
   * @param v The vector's whose squared length will be calculated.
   * @return The squared length of the vector.
   */
  public static float lengthSq(final Vec2 v)
  {
    return v.x * v.x + v.y * v.y;
  }

  /**
   * Normalizes the given quaternion in place and returns the result.
   *
   * @param q The quaternion to be normalized.
   * @return A reference to "q"
   */
  public static Quat normalize(final Quat q)
  {
    normalize(q, q);
    return q;
  }

  /**
   * Calculates the normal of the "in" quaternion and stores the result in the "out" quaternion.
   *
   * @param in  The input quaternion.
   * @param out The output quaternion.
   */
  public static void normalize(final Quat in, final Quat out)
  {
    final float invLength = 1.0f / length(in);
    out.x = in.x * invLength;
    out.y = in.y * invLength;
    out.z = in.z * invLength;
    out.w = in.w * invLength;
  }

  /**
   * Normalizes the given vector in place and returns the result.
   *
   * @param v The vector to be normalized.
   * @return A reference to "v"
   */
  public static Vec3 normalize(final Vec3 v)
  {
    normalize(v, v);
    return v;
  }

  /**
   * Calculates the normalized form of the "in" vector and stores the result in the "out" vector.
   *
   * @param in  The input vector.
   * @param out The output vector.
   */
  public static void normalize(final Vec3 in, final Vec3 out)
  {
    final float invLength = 1.0f / length(in);
    out.x = in.x * invLength;
    out.y = in.y * invLength;
    out.z = in.z * invLength;
  }

  /**
   * Normalizes the given vector in place and returns the result.
   *
   * @param v The given vector to be normalized.
   * @return A reference to "v".
   */
  public static Vec2 normalize(final Vec2 v)
  {
    normalize(v, v);
    return v;
  }

  /**
   * Calculates the normalized form of the "in" vector and stores the result in the "out" vector.
   *
   * @param in  The input vector.
   * @param out The output vector.
   */
  public static void normalize(final Vec2 in, final Vec2 out)
  {
    final float invLength = 1.0f / length(in);
    out.x = in.x * invLength;
    out.y = in.y * invLength;
  }

  /**
   * Adds quaternions "a" and "b" together and stores the result in the "out" quaternion.
   *
   * @param a   The "a" quaternion.
   * @param b   The "b" quaternion.
   * @param out The output quaternion.
   */
  public static void add(final Quat a, final Quat b, final Quat out)
  {
    out.x = a.x + b.x;
    out.y = a.y + b.y;
    out.z = a.z + b.z;
    out.w = a.w + b.w;
  }

  /**
   * Adds vectors "a" and "b" together and stores the result in the "out" vector.
   *
   * @param a   The "a" vector.
   * @param b   The "b" vector.
   * @param out The output vector.
   */
  public static void add(final Vec3 a, final Vec3 b, final Vec3 out)
  {
    out.x = a.x + b.x;
    out.y = a.y + b.y;
    out.z = a.z + b.z;
  }

  /**
   * Adds vectors "a" and "b" together and stores the result in the "out" vector.
   *
   * @param a   The "a" vector.
   * @param b   The "b" vector.
   * @param out The output vector.
   */
  public static void add(final Vec2 a, final Vec2 b, final Vec2 out)
  {
    out.x = a.x + b.x;
    out.y = a.y + b.y;
  }

  /**
   * Subtracts quaternion "b" from "a" and stores the result in the "out" quaternion.
   *
   * @param a   The "a" quaternion.
   * @param b   The "b" quaternion.
   * @param out The output quaternion.
   */
  public static void sub(final Quat a, final Quat b, final Quat out)
  {
    out.x = a.x - b.x;
    out.y = a.y - b.y;
    out.z = a.z - b.z;
    out.w = a.w - b.w;
  }

  /**
   * Subtracts vector "b" from "a" and stores the result in the "out" vector.
   *
   * @param a   The "a" vector.
   * @param b   The "b" vector.
   * @param out The output vector.
   */
  public static void sub(final Vec3 a, final Vec3 b, final Vec3 out)
  {
    out.x = a.x - b.x;
    out.y = a.y - b.y;
    out.z = a.z - b.z;
  }

  /**
   * Subtracts vector "b" from "a" and stores the result in the "out" vector.
   *
   * @param a   The "a" vector.
   * @param b   The "b" vector.
   * @param out The output vector.
   */
  public static void sub(final Vec2 a, final Vec2 b, final Vec2 out)
  {
    out.x = a.x - b.x;
    out.y = a.y - b.y;
  }

  /**
   * Calculates the dot product of "a" and "b'.
   *
   * @param a The "a" quaternion.
   * @param b The "b" quaternion.
   * @return The dot product of "a" and "b".
   */
  public static float dot(final Quat a, final Quat b)
  {
    return a.x * b.x + a.y * b.y + a.z * b.z + a.w * b.w;
  }

  /**
   * Calculates the dot product of "a" and "b'.
   *
   * @param a The "a" vector.
   * @param b The "b" vector.
   * @return The dot product of "a" and "b".
   */
  public static float dot(final Vec3 a, final Vec3 b)
  {
    return a.x * b.x + a.y * b.y + a.z * b.z;
  }

  /**
   * Calculates the dot product of "a" and "b'.
   *
   * @param a The "a" vector.
   * @param b The "b" vector.
   * @return The dot product of "a" and "b".
   */
  public static float dot(final Vec2 a, final Vec2 b)
  {
    return a.x * b.x + a.y * b.y;
  }

  /**
   * Multiples matrices "a" and "b" and stores the result in the "out" output variable.
   *
   * @param a   The "a" matrix.
   * @param b   The "b" matrix.
   * @param out The matrix where the result of the multiplication will be stored.
   */
  public static void mul(final Mat4 a, final Mat4 b, final Mat4 out)
  {
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        out.data[i + j * 4] =
            a.data[i] * b.data[j * 4] + a.data[i + 4] * b.data[1 + j * 4] + a.data[i + 8] * b.data[2 + j * 4] +
                a.data[i + 12] * b.data[3 + j * 4];
      }
    }
  }

  /**
   * Multiplies the given quaternion by the vector and puts the result in the "out" parameter.
   *
   * @param quat The quaternion.
   * @param vec  The vector.
   * @param out  The output destination of the multiplication.
   */
  public static void mul(final Quat quat, final Vec3 vec, final Quat out)
  {
    final float x = quat.w * vec.x + quat.y * vec.z - quat.z * vec.y;
    final float y = quat.w * vec.y + quat.z * vec.x - quat.x * vec.z;
    final float z = quat.w * vec.z + quat.x * vec.y - quat.y * vec.z;
    final float w = -quat.x * vec.x - quat.y * vec.y - quat.z * vec.z;
    out.x = x;
    out.y = y;
    out.z = z;
    out.w = w;
  }

  /**
   * Calculates the local version of a global axis for the orientation of the give quaternion "quat". For example
   * passing in an axis of {0, 0, 1} will give you an output vector pointing the direction the quaternion is pointing,
   * {0, 1, 0} will give you an output vector pointing perpendicular and upwards from the forward vector, etc.
   *
   * @param quat   The rotation quaternion.
   * @param axis   The global axis.
   * @param output The output location of the translation.
   */
  public static void translateGlobalAxisToLocal(final Quat quat, final Vec3 axis, final Vec3 output)
  {
    final float x = quat.w * axis.x + quat.y * axis.z - quat.z * axis.y;
    final float y = quat.w * axis.y + quat.z * axis.x - quat.x * axis.z;
    final float z = quat.w * axis.z + quat.x * axis.y - quat.y * axis.z;
    final float w = -quat.x * axis.x - quat.y * axis.y - quat.z * axis.z;
    output.x = x * quat.w + w * -quat.x + y * -quat.z - z * -quat.y;
    output.y = y * quat.w + w * -quat.y + z * -quat.x - x * -quat.z;
    output.z = z * quat.w + w * -quat.z + x * -quat.y - y * -quat.x;
  }

  /**
   * Creates a translation matrix with the given x, y, and z coordinates.
   *
   * @param x The x translation.
   * @param y The y translation.
   * @param z The z translation.
   * @return The newly created matrix.
   */
  public static Mat4 createTranslationMatrix(final float x, final float y, final float z)
  {
    final Mat4 result = new Mat4();
    result.data[3] = x;
    result.data[7] = y;
    result.data[11] = z;
    return result;
  }

  /**
   * Creates a scale matrix with the given scaling in the x, y, and z axes.
   *
   * @param x The scale on the x-axis.
   * @param y The scale on the y-axis.
   * @param z The scale on the z-axis.
   * @return The newly created matrix.
   */
  public static Mat4 createScaleMatrix(final float x, final float y, final float z)
  {
    final Mat4 result = new Mat4();
    result.data[0] = x;
    result.data[4] = y;
    result.data[9] = z;
    return result;
  }

  /**
   * Creates a rotation matrix use the given quaternion.
   *
   * @param quat The quaternion representing the orientation of the rotation matrix.
   * @return The newly created matrix.
   */
  public static Mat4 createRotationMatrix(final Quat quat)
  {
    final Mat4 result = new Mat4();
    result.data[0] = 2.0f * (quat.x * quat.z - quat.w * quat.y);
    result.data[1] = 2.0f * (quat.y * quat.z + quat.w * quat.x);
    result.data[2] = 1.0f - 2.0f * (quat.x * quat.x + quat.y * quat.y);
    result.data[4] = 2.0f * (quat.x * quat.y + quat.w * quat.z);
    result.data[5] = 1.0f - 2.0f * (quat.x * quat.x + quat.z * quat.z);
    result.data[6] = 2.0f * (quat.y * quat.z - quat.w * quat.x);
    result.data[8] = 1.0f - 2.0f * (quat.y * quat.y + quat.z * quat.z);
    result.data[9] = 2.0f * (quat.x * quat.y - quat.w * quat.z);
    result.data[10] = 2.0f * (quat.x * quat.z + quat.w * quat.y);
    return result;
  }

  /**
   * Creates a projection matrix with the given fov, aspect ratio, z-near, and z-far.
   *
   * @param fov         The vertical aspect ratio in radians.
   * @param aspectRatio The aspect ratio of the target render surface.
   * @param zNear       The z-near of the projection plane. Objects closer than the z-near aren't rendered.
   * @param zFar        The z-far of the projection plane. Objects farther than the z-far aren't rendered.
   * @return The newly created matrix.
   */
  public static Mat4 createProjectionMatrix(float fov, float aspectRatio, float zNear, float zFar)
  {
    final Mat4 result = new Mat4();
    float tanHalfFov = (float) Math.tan(fov / 2.0f);
    float zRange = zNear - zFar;
    result.data[0] = 1.0f / (tanHalfFov * aspectRatio);
    result.data[5] = 1.0f / tanHalfFov;
    result.data[10] = (-zNear - zFar) / zRange;
    result.data[11] = 1.0f;
    result.data[14] = 2.0f * zFar * zNear / zRange;
    return result;
  }
}
