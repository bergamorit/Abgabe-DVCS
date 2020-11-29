import java.util.ArrayList;

public class Scene {
  /** Inner javadoc (ignored).

   * Class Scene sets up a new scene,
   * if there is no scene
   **/
  private static Scene scene;
  /** Inner javadoc (ignored).

   * New ArrayList for Object3D
   **/
  public ArrayList<Object3D> objects = new ArrayList<>();
  /** Inner javadoc (ignored).

   * Sets up Scene with Objects
   **/
  public Scene() {
    objects.add(new Sphere(5, new Vector3D()));
  }
  /** Inner javadoc (ignored).

   * @return Scene
   **/
  public static Scene getScene() {
    if (scene == null) {
      Scene.scene = new Scene();
    }
    return scene;
  }
}
