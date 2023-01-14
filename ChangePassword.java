import javax.swing.*;
import java.awt.*;
public class ChangePassword extends JPanel {

    JButton button_changepassword = new JButton();
    JPasswordField textbox_newpwd = new JPasswordField();

    JLabel text_changed = new JLabel();

    ChangePassword(){

        // text new password
        JLabel text_newpwd = new JLabel();
        text_newpwd.setText("Enter new Password");
        text_newpwd.setBounds(350,200,300,50);
        text_newpwd.setForeground(new Color(47, 43, 44));
        text_newpwd.setFont(new Font("Futura",Font.PLAIN,25));

        // text-box password
        textbox_newpwd.setBorder(null);
        textbox_newpwd.setBounds(350,260,200,30);

        // register button
        ImageIcon img_ok = new ImageIcon( new ImageIcon("./images/check.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_changepassword.setBounds(500, 360, 40,40);
        button_changepassword.setBorder(null);
        button_changepassword.setFocusable(false);
        button_changepassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_changepassword.setBackground(new Color(210, 217, 215));
        button_changepassword.setIcon(img_ok);

        // registered

        text_changed.setText("Succesfully Changed");
        text_changed.setBounds(500,400,80,40);
        text_changed.setForeground(new Color(106, 210, 38));
        text_changed.setFont(new Font("Futura",Font.ITALIC,15));
        text_changed.setVisible(false);

        this.setBackground(new Color(236, 241, 239));
        this.setBounds(140,0,1080,720);
        this.setLayout(null);
        this.add(text_newpwd);
        this.add(textbox_newpwd);
        this.add(button_changepassword);
        this.add(text_changed);

    }
}
