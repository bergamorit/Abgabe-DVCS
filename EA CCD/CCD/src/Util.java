public class Util {
  /** Inner javadoc (ignored).

   * @param a First Vector3D
   * @param b Second Vector3D
   * @return Sum of Two
   **/
  public static Vector3D add(final Vector3D a, final Vector3D b) {
    return new Vector3D(a.posX + b.posX, a.posY + b.posY, a.posZ + b.posZ);
  }
  /** Inner javadoc (ignored).

   * @param a First Vector3D
   * @param b Second Vector3D
   * @param c Third Vector3D
   * @return Sum of Three
   **/
  public static Vector3D add(final Vector3D a, final Vector3D b,
                             final Vector3D c) {
    return Util.add(a, Util.add(b, c));
  }
  /** Inner javadoc (ignored).

   * @param a First Vector3D
   * @param b Second Vector3D
   * @param c Third Vector3D
   * @return Midnight
   **/
  public static Vector3D midnight(final double a, final double b,
                                  final double c) {
    double discriminant = b * b - 4 * a * c;
    if (a == 0) {
      return new Vector3D();
    }
    if (discriminant < 0) {
      return new Vector3D();
    } else if (discriminant == 0) {
      return new Vector3D((-b / 2 * a), 0, 1);
    } else {
      double rightPart = Math.sqrt(discriminant);
      return new Vector3D((-b + rightPart) / (2 * a), (-b - rightPart)
              / (2 * a), 2);
    }
  }
}
