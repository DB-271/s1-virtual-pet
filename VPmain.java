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
                    + " Choose: feed, play, pet, sleep, wait, or quit");

            if (action.equals("quit")) {
                return;
            } else if (action.equals("feed")) {
                String food = askForInput("Choose: meal or treat");
                if (food.equals("quit")) {
                    return;
                }
                vp.feed(food);
            } else if (action.equals("play")) {
                String game = askForInput("Choose: active or gentle");
                if (game.equals("quit")) {
                    return;
                }
                vp.play(game);
            } else if (action.equals("pet")) {
                vp.pet();
            } else if (action.equals("sleep")) {
                vp.sleep();
            } else if (action.equals("wait")) {
                vp.waitTurn();
            } else {
                System.out.println("Please choose one of the listed actions.");
            }
        }
    }

    public static void main(String[] args) {
        new VPmain();
    }
}
