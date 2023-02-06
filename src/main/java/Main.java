import enums.DialogueTypes;
import managers.InputManager;
import managers.OutputDialogueManager;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        OutputDialogueManager.printInteraction(DialogueTypes.GREETINGS);
        obtainUserInputs();
        OutputDialogueManager.printInteraction(DialogueTypes.GOODBYE);
    }

    private static void obtainUserInputs() {
        String line;
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
        while (!InputManager.processInput(line)) {
            line = in.nextLine();
        }
    }
}
