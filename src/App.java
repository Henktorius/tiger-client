import javax.swing.*;

public class App {
    private JFrame frame;

    public App(String name, JFrame frame) {
        setFrame(frame);
    }

    public void setFrame(JFrame frame) {
        frame.setVisible(false);
        this.frame = frame;
        frame.setVisible(true);
    }
}
