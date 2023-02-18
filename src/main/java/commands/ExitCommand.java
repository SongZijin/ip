package commands;

import enums.DialogueTypes;
import managers.OutputDialogueManager;
import managers.SaveManager;
import managers.TaskManager;

public class ExitCommand extends Command {

    @Override
    public void execute(TaskManager taskList, SaveManager storage, OutputDialogueManager display) {
        display.printInteraction(DialogueTypes.GOODBYE);
    }

    public static boolean isDone(Command command) {
        return command instanceof ExitCommand;
    }
}
