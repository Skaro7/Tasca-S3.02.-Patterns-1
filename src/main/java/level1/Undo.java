package level1;

import java.util.Stack;

public class Undo {

    private static Undo instance;
    private final Stack<String> history;

    private Undo() {
        history = new Stack<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        if (command == null) {
            throw new IllegalArgumentException("Command cannot be null or blank.");
        }
        if (command.isBlank()) {
            throw new IllegalArgumentException("Command cannot be null or blank.");
        }
        history.push(command);
    }

    public String undoCommand() {
        if (history.isEmpty()) {
            throw new IllegalStateException("No commands to undo.");
        }
        return history.pop();
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("(empty history)");
        } else {
            System.out.println(String.join(", ", history));
        }
    }

    public static void resetInstance() {
        instance = null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public int size() {
        return history.size();
    }
}