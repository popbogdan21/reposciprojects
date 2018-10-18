
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public class Frame extends JFrame {

    private TextArea textArea = new TextArea();
    private Button b1 = new Button("Stop");

    public Frame(String title) throws HeadlessException {
        super(title);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));
        this.textArea.setAutoscrolls(true);
        this.textArea.setWrapStyleWord(true);
        this.textArea.setLineWrap(true);
        Scroll scroll = new Scroll(textArea);
        panel.add(new Label("This is an exercise"), BorderLayout.PAGE_START);
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(b1, BorderLayout.PAGE_END);
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(450, 600);
        this.setResizable(false);

    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public Button getButton() {
        return b1;
    }
}
