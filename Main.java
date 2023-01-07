import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // text welcome
        JLabel text_label1 = new JLabel();
        text_label1.setText("Welcome to TaskBox");
        text_label1.setForeground(Color.white);
        text_label1.setFont(new Font("Futura",Font.PLAIN,35));
        text_label1.setBounds(100,80, 400,100);

        //text des
        JLabel text_label2 = new JLabel();
        text_label2.setText("Create,Organize your tasks with ease");
        text_label2.setForeground(Color.white);
        text_label2.setFont(new Font("Futura",Font.ITALIC,20));
        text_label2.setBounds(100,160, 400,50);

        // image
        ImageIcon img1 = new ImageIcon( new ImageIcon("multitask.png").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        JLabel image_label1 = new JLabel();
        image_label1.setIcon(img1);
        image_label1.setBounds(80,210, 400,400);

        // panel1
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(174, 138, 231));
        panel1.setBounds(0,0,600,720);
        panel1.setLayout(null);
        panel1.add(text_label1);
        panel1.add(text_label2);
        panel1.add(image_label1);

        
        // panel2
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(241, 208, 214));
        panel2.setBounds(600,0,480,720);
        panel2.setLayout(null);

        // frame
        JFrame frame = new JFrame();
        frame.setTitle("TO-DO-List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon icon_app = new ImageIcon("task.png");
        frame.setIconImage(icon_app.getImage());
        frame.setSize(1080,720);
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }
}
