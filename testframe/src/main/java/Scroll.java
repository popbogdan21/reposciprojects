import javax.swing.*;
import java.awt.*;

public class Scroll extends JScrollPane {
    public Scroll(Component view) {
        super(view);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setAutoscrolls(false);
        this.setSize(450, 500);
    }
}
