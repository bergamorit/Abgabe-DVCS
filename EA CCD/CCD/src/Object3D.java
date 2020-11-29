public interface Object3D {
  /** Inner javadoc (ignored).

   * @param originSphere Origin of Object
   * @param dir Direction of Vector
   * @return Vector
   **/
  double intersect(Vector3D originSphere, Vector3D dir);

  /** Inner javadoc (ignored).

   * @return Color of Object
   **/
  int getColor();
}
