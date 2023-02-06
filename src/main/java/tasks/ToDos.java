package tasks;

import enums.DialogueTypes;
import managers.OutputDialogueManager;
public class ToDos extends Task{
    private int itemId;
    public ToDos(String itemName) {
        super(itemName);
        incrementItemCount();
        this.itemId = getItemCount();
    }

    @Override
    public void printTask() {
        String status;
        if (super.isDone()) {
            status = "[T] [X]";
        } else {
            status = "[T] [ ]";
        }
        System.out.println(this.itemId + "." + status + " " + this.getItemName());
    }

    @Override
    public void printTaskWithoutId() {
        System.out.println( "  [T] " + this.getItemName());
        OutputDialogueManager.printInteraction(DialogueTypes.COUNT_OF_TASKS);
        System.out.println(getItemCount());
    }
}
