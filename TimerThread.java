import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TimerThread extends Thread{
    public void run( Map<String,String[]> map)
    {
        try {
            // Displaying the thread that is running
            Map<String,Map<String, Vector<String>>> map_time = new HashMap<>();

            for (Map.Entry<String,String[]> entry : map.entrySet())
            {
                // add starting time and date
                if (map_time.containsKey(entry.getValue()[1])) {
                    if ( map_time.get(entry.getValue()[1]).containsKey(entry.getValue()[2])) {
                        map_time.get(entry.getValue()[1]).get(entry.getValue()[2]).add("Start Task : "+entry.getKey());
                    }
                    else {
                        Vector<String> temp = new Vector<>();
                        temp.add("Start Task : "+entry.getKey());
                        map_time.get(entry.getValue()[1]).put( entry.getValue()[2],temp);
                    }
                }
                else {
                    Vector<String> temp = new Vector<>();
                    temp.add("Start Task : "+entry.getKey());
                    Map<String, Vector<String>> temp2= new HashMap<>();
                    temp2.put(entry.getValue()[2],temp);
                    map_time.put(entry.getValue()[1],temp2);
                }

                // add ending time and date

                if (map_time.containsKey(entry.getValue()[3])) {
                    if ( map_time.get(entry.getValue()[3]).containsKey(entry.getValue()[4])) {
                        map_time.get(entry.getValue()[3]).get(entry.getValue()[4]).add("End Task : "+entry.getKey());
                    }
                    else {
                        Vector<String> temp = new Vector<>();
                        temp.add("End Task : "+entry.getKey());
                        map_time.get(entry.getValue()[3]).put( entry.getValue()[4],temp);
                    }
                }
                else {
                    Vector<String> temp = new Vector<>();
                    temp.add("End Task : "+entry.getKey());
                    Map<String, Vector<String>> temp2= new HashMap<>();
                    temp2.put(entry.getValue()[4],temp);
                    map_time.put(entry.getValue()[3],temp2);
                }


                //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
            int a = 0;
            while(a==0)
            {
                SimpleDateFormat formatTime = new SimpleDateFormat("HH.mm");
                String time = formatTime.format(new Date());
                SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                String date = ft.format(new Date());

                if( map_time.containsKey(date) ){
                    if( map_time.get(date).containsKey(time) ) {
                        StringBuilder msg = new StringBuilder();
                        for (String str : map_time.get(date).get(time)) {
                            System.out.print(str + " ");
                            msg.append(str).append('\n');
                        }
                        JOptionPane.showMessageDialog(null, msg.toString(),"Task alert",JOptionPane.INFORMATION_MESSAGE);
                        a=1;
                    }
                }

                /*String date2 = "02.42";
                display time as per format
                System.out.println("Current Time in AM/PM Format is : " + time);
                if(date2.equals(time))
                System.out.println("matching");
                Printing the formatted date
                System.out.println("Formatted Date : " + str);

                // Parsing a custom string
                str = "02/18/1995";
                ft = new SimpleDateFormat("MM/dd/yyyy");
                Date date = ft.parse(str);

                // Printing date as per parsed string on console
                System.out.println("Parsed Date : " + date);*/

            }

        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
