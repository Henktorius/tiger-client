import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frames frames = new Frames();
        App app = new App("Tiger Client", frames.login());
    }
}