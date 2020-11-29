public class Camera {
    private int left = -Output.WIDTH / 2;
    private int right = left * -1;
    private int top = Output.HEIGHT / 2;
    private int bottom = top * -1;

    private Vector3D baseUp = new Vector3D(0, 1, 0);
    private Vector3D eye = new Vector3D(0, 0, -7);
    private Vector3D origin = new Vector3D(0, 0, 0);

    private Vector3D cameraW = eye.subtract(origin).normalize();
    private Vector3D cameraU = baseUp.kreuzproduct(cameraW).normalize();
    private Vector3D cameraV = cameraW.kreuzproduct(cameraU).normalize();

    private double d = top / Math.tan(Math.PI / 4) / 2;
    private Vector3D cameraW_d_negated = cameraW.skalarmultiplication(d * -1);

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public Vector3D getBaseUp() {
        return baseUp;
    }

    public void setBaseUp(Vector3D baseUp) {
        this.baseUp = baseUp;
    }

    public Vector3D getEye() {
        return eye;
    }

    public void setEye(Vector3D eye) {
        this.eye = eye;
    }

    public Vector3D getOrigin() {
        return origin;
    }

    public void setOrigin(Vector3D origin) {
        this.origin = origin;
    }

    public Vector3D getCameraW() {
        return cameraW;
    }

    public void setCameraW(Vector3D cameraW) {
        this.cameraW = cameraW;
    }

    public Vector3D getCameraU() {
        return cameraU;
    }

    public void setCameraU(Vector3D cameraU) {
        this.cameraU = cameraU;
    }

    public Vector3D getCameraV() {
        return cameraV;
    }

    public void setCameraV(Vector3D cameraV) {
        this.cameraV = cameraV;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Vector3D getCameraW_d_negated() {
        return cameraW_d_negated;
    }

    public void setCameraW_d_negated(Vector3D cameraW_d_negated) {
        this.cameraW_d_negated = cameraW_d_negated;
    }
}
