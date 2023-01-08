import javax.swing.*;
import java.awt.*;
public class TaskPage extends JPanel{
    JButton button_loginmenu = new JButton();
    JButton button_addtask = new JButton();
    JLabel text_wlcusr = new JLabel();
    JLabel text_task = new JLabel();
    JLabel text_notask = new JLabel();
    TaskPage(String usr_name)
    {

        /* Welcome user */

        text_wlcusr.setText("Welcome " + usr_name);
        text_wlcusr.setForeground(new Color(47, 43, 44));
        text_wlcusr.setFont(new Font("Futura",Font.BOLD,30));
        text_wlcusr.setBounds(300,50, 300,80);

        // text task

        text_task.setText("Your task");
        text_task.setForeground(new Color(47, 43, 44));
        text_task.setFont(new Font("Futura",Font.PLAIN,15));
        text_task.setBounds(350,120, 100,40);

        // text No task

        text_notask.setText("No task found");
        text_notask.setForeground(new Color(47, 43, 44));
        text_notask.setFont(new Font("Futura",Font.PLAIN,15));
        text_notask.setBounds(350,120, 100,40);

        // main menu
        ImageIcon img_mainmenu = new ImageIcon( new ImageIcon("home.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_loginmenu.setBounds(30, 30, 40,40);
        button_loginmenu.setBorder(null);
        button_loginmenu.setFocusable(false);
        button_loginmenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_loginmenu.setBackground(new Color(241, 208, 214));
        button_loginmenu.setIcon(img_mainmenu);

        // add task
        ImageIcon img_addtask = new ImageIcon( new ImageIcon("addtask1.png").getImage().getScaledInstance(35, 40, Image.SCALE_SMOOTH));
        button_addtask.setBounds(500, 120, 45,50);
        button_addtask.setBorder(null);
        button_addtask.setText("New task");
        button_addtask.setIconTextGap(4);
        button_addtask.setFocusable(false);
        button_addtask.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_addtask.setBackground(new Color(241, 208, 214));
        button_addtask.setIcon( img_addtask );

        this.setBackground(new Color(241, 208, 214));
        this.setBounds(0,0,1080,200);
        this.setLayout(null);
        this.add(button_addtask);
        this.add(text_wlcusr);
        this.add(text_task);
        this.add(text_notask);
        this.add(button_loginmenu);

    }
}
