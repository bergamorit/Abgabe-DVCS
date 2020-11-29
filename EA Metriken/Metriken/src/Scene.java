import java.util.ArrayList;

public class Scene {
    private static Scene scene;
    public ArrayList<Object3D> objects = new ArrayList<Object3D>();

    public Scene() {
        objects.add(new Sphere(5, new Vector3D()));
    }

    public static Scene getScene() {
        if (scene == null) {
            Scene.scene = new Scene();
        }
        return scene;
    }
}
