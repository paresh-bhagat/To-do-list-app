import javax.swing.*;
import java.awt.*;
public class TaskEdit extends JPanel{
    JTextField textbox_taskname = new JTextField();
    JTextField textbox_taskdetails = new JTextField();
    JButton button_backmenu = new JButton();
    JButton button_save = new JButton();

    JButton button_deletetask = new JButton();

    JLabel text_tasksaved = new JLabel();
    JLabel text_taskdeleted = new JLabel();
    TaskEdit(String task, String details)
    {

        // text task
        JLabel text_Task = new JLabel();
        text_Task.setText("Task");
        text_Task.setForeground(new Color(47, 43, 44));
        text_Task.setFont(new Font("Futura",Font.PLAIN,30));
        text_Task.setBounds(500,100, 100,40);

        // text Details
        JLabel text_details = new JLabel();
        text_details.setText("Details");
        text_details.setForeground(new Color(47, 43, 44));
        text_details.setFont(new Font("Futura",Font.PLAIN,30));
        text_details.setBounds(500,250, 100,40);

        // Start time
        JLabel text_starttime = new JLabel();
        text_starttime.setText("Start Time");
        text_starttime.setForeground(new Color(47, 43, 44));
        text_starttime.setFont(new Font("Futura",Font.PLAIN,15));
        text_starttime.setBounds(800,150, 100,40);

        // End time
        JLabel text_endtime = new JLabel();
        text_endtime.setText("End time");
        text_endtime.setForeground(new Color(47, 43, 44));
        text_endtime.setFont(new Font("Futura",Font.PLAIN,15));
        text_endtime.setBounds(900,150, 100,40);

        // text box task name

        textbox_taskname.setBounds(450,150,250, 50);
        textbox_taskname.setBorder(null);
        textbox_taskname.setText(task);
        textbox_taskname.setForeground(new Color(47, 43, 44));
        textbox_taskname.setFont(new Font("Futura",Font.BOLD,13));

        // text box task details
        textbox_taskdetails.setBounds(300,300,300, 200);
        textbox_taskdetails.setBorder(null);
        textbox_taskdetails.setText(details);
        textbox_taskdetails.setForeground(new Color(47, 43, 44));
        textbox_taskdetails.setFont(new Font("Futura",Font.BOLD,13));

        // back button
        ImageIcon img_back = new ImageIcon( new ImageIcon("backbutton.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_backmenu.setBounds(500, 550, 40,40);
        button_backmenu.setBorder(null);
        button_backmenu.setFocusable(false);
        button_backmenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_backmenu.setBackground(new Color(241, 208, 214));
        button_backmenu.setIcon(img_back);

        // save button
        ImageIcon img_save = new ImageIcon( new ImageIcon("save.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_save.setBounds(580, 550, 40,40);
        button_save.setBorder(null);
        button_save.setFocusable(false);
        button_save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_save.setBackground(new Color(241, 208, 214));
        button_save.setIcon(img_save);

        // delete button
        ImageIcon img_delete = new ImageIcon( new ImageIcon("delete.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_deletetask.setBounds(660, 550, 40,40);
        button_deletetask.setBorder(null);
        button_deletetask.setFocusable(false);
        button_deletetask.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_deletetask.setBackground(new Color(241, 208, 214));
        button_deletetask.setIcon(img_delete);

        // text tasksaved
        text_tasksaved.setText("task saved");
        text_tasksaved.setForeground(new Color(121, 206, 51));
        text_tasksaved.setFont(new Font("Futura",Font.PLAIN,15));
        text_tasksaved.setBounds(500,600, 100,40);

        // text taskdeleted
        text_taskdeleted.setText("task deleted");
        text_taskdeleted.setForeground(new Color(121, 206, 51));
        text_taskdeleted.setFont(new Font("Futura",Font.PLAIN,15));
        text_taskdeleted.setBounds(500,600, 100,40);

        this.setBackground(new Color(241, 208, 214));
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        this.add(text_Task);
        this.add(text_details);
        this.add(text_starttime);
        this.add(text_endtime);
        this.add(textbox_taskname);
        this.add(textbox_taskdetails);
        this.add(button_backmenu);
        this.add(button_save);
        this.add(button_deletetask);
        this.add(text_tasksaved);
        this.add(text_taskdeleted);
    }
}
