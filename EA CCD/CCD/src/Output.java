import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Output extends JPanel {
  /** Inner javadoc (ignored).

   * @param width Width of canvas
   **/
  public static final int WIDTH = 640;
  /** Inner javadoc (ignored).

   * @param height Width of canvas
   **/
  public static final int HEIGHT = 480;
  /** Inner javadoc (ignored).

   * @param canvas Output Window
   **/
  private final BufferedImage canvas;
  /** Inner javadoc (ignored).

   * @param instance Instance of Output
   **/
  private static Output instance = null;
  /** Inner javadoc (ignored).

   * @param width Width of canvas
   * @param height Height of canvas
   **/
  public Output(final int width, final int height) {
    canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    for (int i = 0; i < canvas.getHeight(); i++) {
      for (int j = 0; j < canvas.getWidth(); j++) {
        canvas.setRGB(j, i, Color.BLUE.getRGB());
      }
    }
    this.setPreferredSize(new Dimension(width, height));
  }
  /** Inner javadoc (ignored).

   * @param g Graphic
   **/
  public void paintComponent(final Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(canvas, null, null);
  }
  /** Inner javadoc (ignored).

   * @return Instance of Output
   **/
  public static Output getOutput() {
    if (Output.instance == null) {
      Output.instance = new Output(WIDTH, HEIGHT);
    }
    return Output.instance;
  }
  /** Inner javadoc (ignored).

   * @param x X position
   * @param y Y position
   * @param rgb Color of pixel
   **/
  public static  void setPixel(final int x, final int y, final int rgb) {
    Output inst = getOutput();
    if (x > WIDTH - 1 || y > HEIGHT - 1 || x < 0 || y < 0) {
      return;
    }
    inst.canvas.setRGB(x, y, rgb);
    inst.repaint();
  }
  /** Inner javadoc (ignored).

   * @param args Output Application
   **/
  public static void main(final String[] args) {
    new RayTracer().trace();
    Output panel = getOutput();

    JFrame frame = new JFrame("Raytracing Demo");
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
