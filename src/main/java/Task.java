public class Task {
    private static int itemCount;
    private String itemName;
    private int itemId;
    private boolean isDone;

    public Task(String itemName) {
        this.itemName = itemName;
        itemCount++;
        this.itemId = itemCount;
        this.isDone = false;
    }

    public String getItemName() {
        return itemName;
    }

    public static int getItemCount() {
        return itemCount;
    }

    public int getItemId() {
        return itemId;
    }
    public void markAsDone() {
        this.isDone = true;
    }
    public void markAsUndone() {
        this.isDone = false;
    }
    public void printTask() {
        String status = new String();
        if (isDone) {
            status = "[X]";
        } else {
            status = "[ ]";
        }
        System.out.println(this.itemId + "." + status + " " + this.itemName);
    }
}