import javax.swing.*;
import java.awt.*;
public class TaskView extends JPanel{
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();


    TaskView()
    {
        ImageIcon task = new ImageIcon( new ImageIcon("task.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        button1.setIconTextGap(5);
        button1.setText("Buttton-1");
        button1.setBorder(null);
        button1.setFocusable(false);
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button1.setBackground(new Color(245, 241, 243));
        button1.setIcon( task );

        button2.setIconTextGap(5);
        button2.setText("Buttton-2");
        button2.setBorder(null);
        button2.setFocusable(false);
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button2.setBackground(new Color(245, 241, 243));
        button2.setIcon( task );

        button3.setIconTextGap(5);
        button3.setText("Buttton-3");
        button3.setBorder(null);
        button3.setFocusable(false);
        button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button3.setBackground(new Color(245, 241, 243));
        button3.setIcon( task );

        button4.setIconTextGap(5);
        button4.setText("Buttton-4");
        button4.setBorder(null);
        button4.setFocusable(false);
        button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button4.setBackground(new Color(245, 241, 243));
        button4.setIcon( task );

        button5.setIconTextGap(5);
        button5.setText("Buttton-5");
        button5.setBorder(null);
        button5.setFocusable(false);
        button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button5.setBackground(new Color(245, 241, 243));
        button5.setIcon( task );

        button6.setIconTextGap(5);
        button6.setText("Buttton-6");
        button6.setBorder(null);
        button6.setFocusable(false);
        button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button6.setBackground(new Color(245, 241, 243));
        button6.setIcon( task );

        button7.setIconTextGap(5);
        button7.setText("Buttton-7");
        button7.setBorder(null);
        button7.setFocusable(false);
        button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button7.setBackground(new Color(245, 241, 243));
        button7.setIcon( task );

        this.setBackground(new Color(246, 241, 241));
        this.setBounds(140,200,800,520);
        this.setLayout(new FlowLayout( FlowLayout.CENTER, 40, 40));
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
    }
}
