import java.awt.Color;

public class Sphere implements Object3D {
    double radius;
    Vector3D center;
    Color c = Color.RED;

    public Sphere(double radius, Vector3D center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double intersect(Vector3D originSphere, Vector3D dir) {
        double a = dir.product(dir);
        Vector3D eyeCenter = originSphere.subtract(center);
        double b = 2 * dir.product(eyeCenter);
        double c = eyeCenter.product(eyeCenter) - radius * radius;
        Vector3D result = Util.midnight(a, b, c);
        switch((int)Math.round(result.z)) {
            case 0:
                return Double.MAX_VALUE;
            case 1:
                return result.x;
            case 2:
                if(result.x < 0) {
                    if(result.y < 0) {
                        return Double.MAX_VALUE;
                    } else {
                        return result.y;
                    }
                }else {
                    if (result.y < 0) {
                        return result.x;
                    } else {
                        return Math.min(result.x, result.y);
                    }
                }
            default:
                return Double.MAX_VALUE;
        }
    }

    @Override
    public int getColor() {
        return c.getRGB();
    }
}
