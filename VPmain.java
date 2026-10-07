import javax.swing.*;

public class VPmain {
    VirtualPet vp = new VirtualPet();

    public String askForInput(String question) {
        String answer = JOptionPane.showInputDialog(question);

        if (answer == null) {
            answer = "quit";
        }

        return answer;
    }

    public VPmain() {
        while (vp.isAlive()) {
            String action = askForInput(vp.getStatus()
                    + " Choose: feed, play, sleep, or quit");

            if (action.equals("feed")) {
                vp.feed();
            } else if (action.equals("play")) {
                vp.play();
            } else if (action.equals("sleep")) {
                vp.sleep();
            } else if (action.equals("quit")) {
                break;
            } else {
                System.out.println("Please choose a listed action.");
            }
        }
    }

    public static void main(String[] args) {
        new VPmain();
    }
}