public class Camera {
  /** Inner javadoc (ignored).

   * @param left Left margin
   **/
  private final int left = -Output.WIDTH / 2;
  /** Inner javadoc (ignored).

   * @param right Right margin
   **/
  private final int right = left * -1;
  /** Inner javadoc (ignored).

   * @param top Top margin
   **/
  private final int top = Output.HEIGHT / 2;
  /** Inner javadoc (ignored).

   * @param bottom Bottom margin
   **/
  private final int bottom = top * -1;
  /** Inner javadoc (ignored).

   * @param baseUp Base Vector upwards
   **/
  private final Vector3D baseUp = new Vector3D(0, 1, 0);
  /** Inner javadoc (ignored).

   * @param eye Viewers perspective
   **/
  private final Vector3D eye = new Vector3D(0, 0, -7);
  /** Inner javadoc (ignored).

   * @param origin Origin of Object
   **/
  private final Vector3D origin = new Vector3D(0, 0, 0);
  /** Inner javadoc (ignored).

   * @param cameraW Camera Vector W
   **/
  private final Vector3D cameraW = eye.subtract(origin).normalize();
  /** Inner javadoc (ignored).

   * @param cameraU Camera Vector U
   **/
  private final Vector3D cameraU = baseUp.kreuzproduct(cameraW).normalize();
  /** Inner javadoc (ignored).

   * @param cameraV Camera Vector V
   **/
  private final Vector3D cameraV = cameraW.kreuzproduct(cameraU).normalize();
  /** Inner javadoc (ignored).

   * @param disctance disctance
   **/
  private final double distance = top / Math.tan(Math.PI / 4) / 2;
  /** Inner javadoc (ignored).

   * @param cameraWdNegated calculated distance of Camera
   **/
  private final Vector3D cameraWdNegated =
          cameraW.skalarmultiplication(distance * -1);
  /** Inner javadoc (ignored).

   * @return Left margin
   **/
  public int getLeft() {
    return left;
  }
  /** Inner javadoc (ignored).

   * @return Right margin
   **/
  public int getRight() {
    return right;
  }
  /** Inner javadoc (ignored).

   * @return Top margin
   **/
  public int getTop() {
    return top;
  }
  /** Inner javadoc (ignored).

   * @return Bottom margin
   **/
  public int getBottom() {
    return bottom;
  }
  /** Inner javadoc (ignored).

   * @return Viewers position
   **/
  public Vector3D getEye() {
    return eye;
  }
  /** Inner javadoc (ignored).

   * @return CameraU Vector
   **/
  public Vector3D getCameraU() {
    return cameraU;
  }
  /** Inner javadoc (ignored).

   * @return CameraV Vector
   **/
  public Vector3D getCameraV() {
    return cameraV;
  }
  /** Inner javadoc (ignored).

   * @return calculated distance of Camera
   **/
  public Vector3D getCameraWdNegated() {
    return cameraWdNegated;
  }
}
