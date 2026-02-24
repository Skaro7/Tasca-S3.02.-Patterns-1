import level1.Undo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertSame;

class UndoTest {

    @BeforeEach
    void setUp() {
        Undo.resetInstance();
    }

    @Test
    @DisplayName("getInstance should return the same instance")
    void testSingletonReturnsSameInstance () {
        Undo firstInstance = Undo.getInstance();
        Undo secondInstance = Undo.getInstance();
        assertSame(firstInstance, secondInstance, "getInstance should return the same instance");
    }

    @Test
    @DisplayName("addCommand should add commands to history")
    void testAddCommandAddsToHistory() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        assertSame(2, undo.size(), "History should contain 2 commands");
    }

    @Test
    @DisplayName("undoCommand should remove the last command from history")
    void testUndoCommandRemovesLastCommand() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        String lastCommand = undo.undoCommand();
        assertSame("cd carpeta", lastCommand, "undoCommand should return the last command");
        assertSame(1, undo.size(), "History should contain 1 command after undo");
    }

    @Test
    @DisplayName("Show history prints empty message when history is empty")
    void testShowHistoryEmpty() {
        Undo undo = Undo.getInstance();
        assertDoesNotThrow(undo::showHistory);
    }

    @Test
    @DisplayName("Show history does not throw after adding commands and undone")
    void testShowHistoryAfterUndo() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        undo.undoCommand();
        assertDoesNotThrow(undo::showHistory);
    }

    @Test
    @DisplayName("Full test: add two commands, undo one, check history")
    void testFullScenario() {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        String lastCommand = undo.undoCommand();
        assertSame("cd carpeta", lastCommand, "undoCommand should return the last command");
        assertSame(1, undo.size(), "History should contain 1 command after undo");
    }

}
