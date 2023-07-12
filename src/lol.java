
import javax.swing.*;
import java.awt.*;

public class lol extends JFrame {
        private Image img;
        private Rectangle displayArea;

        public lol(Image img, Rectangle displayArea) {
            this.img = img;
            this.displayArea = displayArea;

            setTitle("Image Frame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(displayArea.width, displayArea.height);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(img, 100, 100, displayArea.width, displayArea.height,
                            displayArea.x, displayArea.y, displayArea.x + displayArea.width,
                            displayArea.y + displayArea.height, this);
                }
            };
            setContentPane(panel);
            setVisible(true);
        }

        public static void main(String[] args) {
            ImageIcon icon = new ImageIcon("C:\\Users\\USER\\OneDrive\\שולחן העבודה\\Reinforced_LF2\\sprite\\template1\\1.jpeg");
            Image img = icon.getImage();
            Rectangle displayArea = new Rectangle(50, 50, 200, 200); // display top-left 200x200 pixels
            lol frame = new lol(img, displayArea);
        }
    }
