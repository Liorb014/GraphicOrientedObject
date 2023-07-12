import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
    private int tool;
    private static  final  int EMPTY =0;
    private static final int RED_PLAYER=1;
    private static final int BLUE_PLAYER=2;
    private final int MARGIN=10;
    public Square (boolean black){
        Color background = null;
        if (black){
            background=Color.black;
        }else {
            background=Color.white;
        }
        this.setBackground(background);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        if(this.tool!=EMPTY) {
            g.setColor(tool==RED_PLAYER? Color.red:Color.blue);
            g.fillOval(MARGIN, MARGIN, this.getWidth()-2*MARGIN, this.getHeight()-2*MARGIN);
        }
    }
}
