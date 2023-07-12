import javax.swing.*;
import java.awt.*;

public class Class3 extends JFrame {
    public static void main(String[] args) {
        new Class3();
    }
    public Class3(){
        this.setSize(500,500);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.add(new Scene(100,100,250,250));

    }
}
