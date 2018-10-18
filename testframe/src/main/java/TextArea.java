import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {
    public TextArea() {
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setEditable(false);
        this.setLineWrap(true);
        this.setAutoscrolls(true);
    }
}
