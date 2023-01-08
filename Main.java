import java.util.*;
public class Main {
    static LoginFrame frame = new LoginFrame();
    static Map<String, String> user_info = new HashMap<>();

    static Map<String,Map<String,String>> Task = new HashMap< String, Map<String, String>>() ;

    public static void register( RegisterPage register_panel )
    {
        if ( user_info.containsKey(register_panel.textbox_newus.getText()) )
            register_panel.text_takenu.setVisible(true);
        else
        {
            String PasswordTyped = new String(register_panel.textbox_newpwd.getPassword());
            user_info.put( register_panel.textbox_newus.getText(), PasswordTyped);
            register_panel.text_registered.setVisible(true);
        }

        for (Map.Entry<String, String> me : user_info.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
    public static void register_page()
    {
        frame.panel1.setVisible(false);
        frame.panel2.setVisible(false);
        RegisterPage register_panel = new RegisterPage();

        frame.add(register_panel);

        register_panel.button_newregister.addActionListener( e -> { register_panel.text_takenu.setVisible(false); register_panel.text_registered.setVisible(false); register(register_panel);} );

        register_panel.button_loginmenu.addActionListener( e -> { register_panel.setVisible(false); frame.panel1.setVisible(true); frame.panel2.setVisible(true);} );
    }

    public static void task_page()
    {
        frame.text_wup.setVisible(false);

        String usr_name =  frame.textbox_us.getText();

        if ( user_info.containsKey(usr_name) )
        {
            String PasswordTyped = new String(frame.textbox_pwd.getPassword());
            if ( user_info.get(frame.textbox_us.getText()).equals(PasswordTyped) )
            {
                frame.panel1.setVisible(false);
                frame.panel2.setVisible(false);
                TaskPage task_panel = new TaskPage(usr_name);
                TaskView taskview_panel = new TaskView();
                frame.add(task_panel);
                frame.add(taskview_panel);
                task_panel.button_loginmenu.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); frame.panel1.setVisible(true); frame.panel2.setVisible(true);} );
            }
            else
                frame.text_wup.setVisible(true);
        }
        else
            frame.text_wup.setVisible(true);


    }

    public static void main(String[] args) {

        user_info.put("admin", "admin12@");
        user_info.put("paresh", "bholu");

        for (Map.Entry<String, String> me : user_info.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        frame.button_login.addActionListener( e -> task_page() );
        frame.button_register.addActionListener( e -> register_page() );

    }
}
