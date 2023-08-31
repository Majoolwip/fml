package majoolwip.fml;

import java.util.Arrays;

public final class Mat4
{
  public final float[] data;

  public Mat4()
  {
    data = new float[16];
    data[0] = 1f;
    data[5] = 1f;
    data[10] = 1f;
    data[15] = 1f;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Mat4 otherMat = (Mat4) o;
    for (int i = 0; i < 16; i++)
    {
      if (Math.abs(data[i] - otherMat.data[i]) >= FML.EPSILON)
      {
        return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode()
  {
    return Arrays.hashCode(data);
  }

  @Override
  public String toString()
  {
    return "Mat4{" + "data=" + Arrays.toString(data) + '}';
  }
}
