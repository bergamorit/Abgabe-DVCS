import java.awt.Color;

public class Sphere implements Object3D {
  /** Inner javadoc (ignored).

   * @param radius Radius of Sphere
   **/
  private final double radius;
  /** Inner javadoc (ignored).

   * @param center Center of Sphere
   **/
  private final Vector3D center;
  /** Inner javadoc (ignored).

   * @param color Color of Sphere
   **/
  private final Color color = Color.RED;
  /** Inner javadoc (ignored).

   * @param radius Radius of Sphere
   * @param center Center of Sphere
   **/
  public Sphere(final double radius, final Vector3D center) {
    this.radius = radius;
    this.center = center;
  }

  @Override
  public double intersect(final Vector3D originSphere, final Vector3D dir) {
    double a = dir.product(dir);
    Vector3D eyeCenter = originSphere.subtract(center);
    double b = 2 * dir.product(eyeCenter);
    double c = eyeCenter.product(eyeCenter) - radius * radius;
    Vector3D result = Util.midnight(a, b, c);
    switch ((int) Math.round(result.posZ)) {
      case 0:
        return Double.MAX_VALUE;
      case 1:
        return result.posZ;
      case 2:
        if (result.posX < 0) {
          if (result.posY < 0) {
            return Double.MAX_VALUE;
          } else {
            return result.posY;
          }
        } else {
          if (result.posY < 0) {
            return result.posX;
          } else {
            return Math.min(result.posX, result.posY);
          }
        }
      default:
        return Double.MAX_VALUE;
    }
  }

  @Override
  public int getColor() {
    return color.getRGB();
  }
}
