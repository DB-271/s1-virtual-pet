public class VirtualPet {
    VirtualPetFace face;
    int hunger = 40;
    int energy = 60;
    boolean alive = true;

    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello! Feed me, play with me, and let me sleep.");
    }

    public void feed() {
        if (hunger >= 20) {
            hunger = hunger - 20;
            face.setImage("happy_1");
            face.setMessage("Yum! Thank you.");
        } else {
            face.setImage("annoyed_1");
            face.setMessage("I'm full already!");
        }
    }

    public void play() {
        if (hunger >= 80) {
            face.setImage("hungry_1");
            face.setMessage("I'm too hungry to play. Feed me first.");
        } else {
            if (energy >= 20) {
                hunger = hunger + 20;
                energy = energy - 20;
                face.setImage("exercising_1");
                face.setMessage("That was fun!");
            } else {
                face.setImage("tired_1");
                face.setMessage("I'm too tired to play. Let me sleep.");
            }
        }
    }

    public void sleep() {
        energy = 100;
        hunger = hunger + 20;

        if (hunger >= 100) {
            alive = false;
            face.setImage("pushingdaisies");
            face.setMessage("I got too hungry. Game over.");
        } else {
            face.setImage("asleep_1");
            face.setMessage("Zzz... I feel rested now.");
        }
    }

    public String getStatus() {
        return "Hunger: " + hunger + "\nEnergy: " + energy;
    }

    public boolean isAlive() {
        return alive;
    }
}
