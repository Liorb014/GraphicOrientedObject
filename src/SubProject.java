import javax.swing.*;
import java.awt.*;

public class SubProject extends JFrame {
    private final int BORD_SIZE=3;

    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.cyan);
        g.fillOval(this.getX()+20,this.getY()+20,this.getWidth(),this.getHeight());
    }

    public SubProject(){
        GridLayout gridLayout = new GridLayout(BORD_SIZE,BORD_SIZE);
        this.setLayout(gridLayout);

        this.setTitle("lior project");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        JLabel text = new JLabel("Hi please click the button");
        this.add(text);
        for (int i = 0; i < BORD_SIZE*BORD_SIZE; i++) {
            JButton jButton =new JButton(String.valueOf(i));
            this.add(jButton);
        }
//        JButton coolButton = new JButton("click me");
//        this.add(coolButton);
//        this.add(coolButton);
//        this.add(coolButton);
//        this.add(coolButton);
//        this.add(coolButton);
        //coolButton.addActionListener(e -> System.out.println("hi"));
        //coolButton.setEnable(false);
////        coolButton.setBounds(50,50,150,20);
        Scene scene = new Scene(0,0,200,500);
        Scene scene2 = new Scene(0,0,200,500);
        this.add(scene);
        this.add(scene2);
        this.setFocusable(true);
        this.requestFocus();
        MovementListener movementListener=new MovementListener();
        this.addKeyListener(movementListener);
    }
}
