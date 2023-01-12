import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static LoginFrame frame = new LoginFrame();
    static Map<String, String> user_info = new HashMap<>();

    static Map<String,Map<String,String>> Task_all = new HashMap<>() ;

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
    public static void add_edit_task(String usr_name, String task)
    {
        TaskEdit panel_taskedit;
        if ( task.equals("0") )
        {
            panel_taskedit = new TaskEdit( "Enter task name","Enter task details" );
            panel_taskedit.text_tasksaved.setVisible(false);
            panel_taskedit.text_taskdeleted.setVisible(false);
            panel_taskedit.button_save.addActionListener( e -> {
                if( Task_all.containsKey(usr_name)) {
                    Task_all.get(usr_name).put( panel_taskedit.textbox_taskname.getText(),panel_taskedit.textbox_taskdetails.getText() );
                }
                else {
                    Map<String,String> task_t = new HashMap<>();
                    task_t.put(panel_taskedit.textbox_taskname.getText(),panel_taskedit.textbox_taskdetails.getText());
                    Task_all.put(usr_name,task_t);
                }

                panel_taskedit.text_tasksaved.setVisible(true);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                panel_taskedit.setVisible(false); task_page(usr_name);} );
        }

        else
        {
            panel_taskedit = new TaskEdit( task ,  (Task_all.get(usr_name)).get(task) );
            panel_taskedit.text_tasksaved.setVisible(false);
            panel_taskedit.text_taskdeleted.setVisible(false);
            panel_taskedit.button_save.addActionListener( e -> { panel_taskedit.text_tasksaved.setVisible(true);
                Task_all.get(usr_name).remove(task);
                Task_all.get(usr_name).put( panel_taskedit.textbox_taskname.getText(),panel_taskedit.textbox_taskdetails.getText() );
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                panel_taskedit.setVisible(false); task_page(usr_name);} );
        }

        panel_taskedit.button_backmenu.addActionListener( e -> { panel_taskedit.setVisible(false); task_page(usr_name);} );
        panel_taskedit.button_deletetask.addActionListener( e -> { (Task_all.get(usr_name)).remove(task);
            if (Task_all.get(usr_name).isEmpty()) { Task_all.remove(usr_name);} panel_taskedit.text_taskdeleted.setVisible(true);
            task_page(usr_name);} );
        frame.add(panel_taskedit);
    }

    public static void task_page( String usr_name)
    {
        TaskPage task_panel = new TaskPage(usr_name);
        TaskView taskview_panel = new TaskView();
        task_panel.button_addtask.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); add_edit_task(usr_name,"0");} );

        if(Task_all.containsKey(usr_name))
        {
            task_panel.text_notask.setVisible(false);
            task_panel.text_task.setVisible(true);
            for ( Map.Entry<String, String> me : Task_all.get(usr_name).entrySet())
            {
                TaskButton button_t = new TaskButton(me.getKey());
                button_t.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); add_edit_task(usr_name,me.getKey());} );
                // Printing keys
                taskview_panel.add(button_t);

            }
        }
        else
        {
            task_panel.text_notask.setVisible(true);
            task_panel.text_task.setVisible(false);
        }

        frame.add(task_panel);
        frame.add(taskview_panel);
        task_panel.button_loginmenu.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); frame.panel1.setVisible(true); frame.panel2.setVisible(true);} );
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
                task_panel.button_addtask.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); add_edit_task(usr_name,"0");} );

                if(Task_all.containsKey(usr_name))
                {
                    task_panel.text_notask.setVisible(false);
                    task_panel.text_task.setVisible(true);
                    for ( Map.Entry<String, String> me : Task_all.get(usr_name).entrySet())
                    {
                        TaskButton button_t = new TaskButton(me.getKey());
                        button_t.addActionListener( e -> { task_panel.setVisible(false); taskview_panel.setVisible(false); add_edit_task(usr_name,me.getKey());} );
                        // Printing keys
                        taskview_panel.add(button_t);

                    }
                }
                else
                {
                    task_panel.text_notask.setVisible(true);
                    task_panel.text_task.setVisible(false);
                }

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

        Map<String,String> paresh_task = new HashMap<>();
        paresh_task.put("study","Study java");
        paresh_task.put("bholu","dug dug");
        paresh_task.put("eat","poha");
        Task_all.put("paresh",paresh_task);

        frame.button_login.addActionListener( e -> task_page() );
        frame.button_register.addActionListener( e -> register_page() );

    }
}
