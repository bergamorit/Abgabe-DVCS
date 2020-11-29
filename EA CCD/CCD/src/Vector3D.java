public class Vector3D {
  /** Inner javadoc (ignored).

   * @param positionX Position X
   **/
  double posX;
  /** Inner javadoc (ignored).

   * @param positionY Position Y
   **/
  double posY;
  /** Inner javadoc (ignored).

   * @param positionZ Position Z
   **/
  double posZ;
  /** Inner javadoc (ignored).

   * Vector3D at Position 0,0,0
   **/
  public Vector3D() {
    this.posX = 0;
    this.posY = 0;
    this.posZ = 0;
  }
  /** Inner javadoc (ignored).

   * @param x Position X of Vector3D
   * @param y Position Y of Vector3D
   * @param z Position Z of Vector3D
   **/
  public Vector3D(final double x, final double y, final double z) {
    this.posX = x;
    this.posY = y;
    this.posZ = z;
  }
  /** Inner javadoc (ignored).

   * @param b Vector3D
   * @return Skalarproduct of Vector3D
   **/
  public double skalarproduct(final Vector3D b) {
    return Math.sqrt(this.posX * b.posX + this.posY * b.posY
            + this.posZ * b.posZ);
  }
  /** Inner javadoc (ignored).

   * @param d distance
   * @return Skalarmultiplication of Vector3D and distance d
   **/
  public Vector3D skalarmultiplication(final double d) {
    return new Vector3D(d * this.posX, d * this.posY, d * this.posZ);
  }
  /** Inner javadoc (ignored).

   * @param b Vector3D
   * @return Difference between two Vector3D
   **/
  public Vector3D subtract(final Vector3D b) {
    return new Vector3D(this.posX - b.posX, this.posY - b.posY,
            this.posZ - b.posZ);
  }
  /** Inner javadoc (ignored).

   * @return normalized Vector3D
   **/
  public Vector3D normalize() {
    double length = skalarproduct(this);
    if (Math.abs(length) == 0) {
      return new Vector3D();
    }
    return new Vector3D(this.posX / length, this.posY / length,
            this.posZ / length);
  }
  /** Inner javadoc (ignored).

   * @param b Vector3D
   * @return kreuzproduct of Vector3D
   **/
  public Vector3D kreuzproduct(final Vector3D b) {
    return new Vector3D(this.posY * b.posZ - this.posZ - b.posY,
            this.posZ * b.posX - this.posX * b.posZ,
            this.posX * b.posY - this.posY * b.posX);
  }
  /** Inner javadoc (ignored).

   * @param b Vector3D
   * @return Skalarmultiplication of Vector3D and distance d
   **/
  public double product(final Vector3D b) {
    return this.posX * b.posX + this.posY * b.posY
            + this.posZ * b.posZ;
  }
}
