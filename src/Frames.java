import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frames {
    private JFrame defaultFrame(int width, int height) {
        JFrame frame = new JFrame("Tiger Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        return frame;
    }
    public JFrame login() {
        JFrame frame = defaultFrame(400, 300);

        JLabel username_label = new JLabel("Usuario");
        frame.getContentPane().add(username_label);

        JTextField username_tf = new JTextField(1);
        frame.getContentPane().add(username_tf);

        JLabel password_label = new JLabel("Password");
        frame.getContentPane().add(password_label);

        JTextField password_tf = new JTextField(1);
        frame.getContentPane().add(password_tf);

        JButton submit_button = new JButton("Login");
        frame.getContentPane().add(submit_button);

        JLabel status_label = new JLabel("");
        frame.getContentPane().add(status_label);

        submit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username_tf.getText().toLowerCase().equals("henktorius") && password_tf.getText().equals("1234")) {
                    status_label.setText("Bienvenido");
                }
                else {
                    status_label.setText("Acceso denegado");
                }
            }
        });

        return frame;
    }
}
