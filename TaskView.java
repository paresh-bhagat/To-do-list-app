import javax.swing.*;
import java.awt.*;
public class TaskView extends JPanel{

    TaskView()
    {
        this.setBackground(new Color(246, 241, 241));
        this.setBounds(140,200,800,520);
        this.setLayout(new FlowLayout( FlowLayout.CENTER, 40, 40));
    }
}
