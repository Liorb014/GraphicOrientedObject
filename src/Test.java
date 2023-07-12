import javax.swing.*;

public class Test extends JFrame {
    public Test(){
        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\OneDrive\\שולחן העבודה\\Reinforced_LF2\\sprite\\template1\\1.bmp");
        JLabel label = new JLabel("hi");
        label.setIcon(icon);
        this.add(label);
        label.setVisible(true);
        label.setSize(200,200);
        label.setBounds(0,0,200,200);


        this.setTitle("lior project");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}
