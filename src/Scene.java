import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Scene extends JPanel {
    private  int x;
    private  int y;
    private  int width;
    private  int height;
    private Square player;
    private ArrayList<Square> wall;

    public  Scene (int x, int y,int height, int width) {
        this.setBounds(x,y,height,width);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.setDoubleBuffered(true);
        this.setBounds( x,y,width,height);
        this.setBackground(Color.BLACK);
        GridLayout gridLayout = new GridLayout(1,4);
        this.setLayout(gridLayout);
        JButton jButton=new JButton("1");
        int button =4;
        for (int i = 0; i < button; i++) {
            this.add(new JButton(String.valueOf(i)));
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    g.fillOval(100,100,100,100);
    g.setColor(Color.green);

    }
}
