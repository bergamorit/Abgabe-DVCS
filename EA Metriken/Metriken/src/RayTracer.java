public class RayTracer {
    private Camera camera = new Camera();
    public void trace() {
        for(int i = 0; i < Output.WIDTH; i++){
            for(int j = 0; j < Output.HEIGHT; j++){
                double posU = camera.getLeft() + (camera.getRight() - camera.getLeft()) * (i + 0.5) / Output.WIDTH;
                double posV = camera.getTop() + (camera.getBottom() - camera.getTop()) * (j + 0.5) / Output.HEIGHT;

                Vector3D s = Util.add(camera.getCameraU().skalarmultiplication(posU),
                        camera.getCameraV().skalarmultiplication(posV), camera.getCameraW_d_negated());
                Vector3D dir = s.normalize();

                Object3D intersect = null;
                double t = Double.MAX_VALUE - 1;
                for(Object3D o : Scene.getScene().objects) {
                    double t2 = o.intersect(camera.getEye(), dir);
                    if(t2 > 0 && t2 < t) {
                        intersect = o;
                        t = t2;
                    }
                }

                if(intersect != null) {
                    Output.setPixel(i, j, intersect.getColor());
                }
            }
        }
    }
}
