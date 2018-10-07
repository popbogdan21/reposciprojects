
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // I really need to access theses from other classes
    public static Frame frame = new Frame("Threads exercise");
    public static TextArea textArea = new TextArea();
    public static FestivalGate gate = new FestivalGate();

    /**
     * @param args
     *
     * Builds a frame that contains the output
     * Instantiates the Statistics Threads and the Festival Attendee Threads
     *
     */
    public static void main(String[] args) {

        //Building the frame; Maybe should have used JFrame with setDefaultCloseOperation().
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
                frame.dispose();
                System.exit(0);
            }
        });
        frame.setSize(600, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        final Button button2 = new Button("Display Final Statistics");
        button2.setFont(new Font(Font.SERIF, Font.BOLD, 35));
        button2.setEnabled(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nl = System.getProperty("line.separator");
                Main.textArea.append(nl + "Final Statistics");
                StatsBuilder end = new StatsBuilder(gate);
                end.getStats();
                button2.setEnabled(false);
            }
        });
        Panel panel = new Panel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(textArea);
        textArea.setEditable(false);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        panel.add(button2);
        frame.add(panel);
        frame.setVisible(true);
        //end of frame building

        FestivalStatisticsThread statisticsThread = new FestivalStatisticsThread(gate);
        statisticsThread.start();

        List<Thread> attendees = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < 200) {
            attendees.add(new Thread(new FestivalAttendeeThread(TicketType.getTicket(), gate)));
            attendees.get(i).start();
            i++;
        }
        while (j < attendees.size()) {
            if (attendees.get(j).isAlive()) {
                try {
                    attendees.get(j).join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            j++;
        }
        statisticsThread.terminate();
        button2.setEnabled(true);
    }
}

