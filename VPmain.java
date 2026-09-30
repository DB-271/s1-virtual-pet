import javax.swing.*;

public class VPmain {
    VirtualPet vp = new VirtualPet();

    public String askForInput(String q) {
        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                q,
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE);
        return s;
    }

    public VPmain() {
        String response = this.askForInput("Should I wake up?");
        if (response.equals("yes")) {
            face.setImage("awake");
        }
        vp.feed();
        vp.exercise();
        this.waitABeat(1000);
        String ans = this.askForInput("Are you ready to sleep?");
        if (ans.equals("yes"))
            vp.sleep();
        else
            vp.exercise();
    }

    public void waitABeat(int ms) {
        try {
            Thread.sleep(ms); // milliseconds
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        new VPmain();
    }
}
