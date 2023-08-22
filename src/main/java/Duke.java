/**
 * Main entry point of the bot
 */
public class Duke {

    /**
     * User Interface for generating chats.
     */
    private Ui ui = new Ui();

    /**
     * Task list to store the tasks.
     */
    private TaskList tasks = new TaskList();

    /**
     * Continuously reads user input,
     * parses it into commands, and executes the commands
     * until an exit command is received.
     */
    public void run () {
        ui.showWelcome();
        boolean isExit = false;
        while (!isExit) {
            String userInput = ui.readInput();
            ui.showLine();
            Command command = Parser.parse(userInput);
            isExit =  command.execute(this.tasks,ui);;
            ui.showLine();
        }
    }

    /**
     * The main entry point of the application.
     */
    public static void main(String[] args) {
        new Duke().run();
    }
}
