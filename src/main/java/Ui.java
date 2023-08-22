import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manages user interaction
 */
public class Ui {

    /**
     * For Storing the chat history
     */
    private ArrayList<String> history = new ArrayList<>();

    /**
     * Scanner object used to read user input.
     */
    private Scanner sc = new Scanner(System.in);

    /**
     * Displays the welcome message to the user.
     */
    public void showWelcome() {
        showLine();
        System.out.println("Hello! I'm Ken");
        System.out.println("What can I do for you?");
        showLine();
    }

    /**
     * Prints a line divider for differentiating user and the bot.
     */
    public void showLine() {
        System.out.println("____________________________________________________________");
    }

    /**
     * Receives user input and adds it to the chat history.
     *
     * @return The user input as a string.
     */
    public String readInput() {
        String userInput = sc.nextLine();  // Read user input
        history.add(userInput); // Update History
        return userInput;
    }

    /**
     * Sends a response to the user and adds it to the chat history.
     *
     * @param response The response to be displayed to the user.
     */
    public void respond(String response) {
        history.add(response); // Update History
        System.out.println(response);
    }

    public void showError(String error) {
        System.out.println("OOPS! "+ error);
    }

    /**
     * Retrieves the last message from the history.
     *
     * @return The last message.
     */
    public String getLastMsg() {
        return history.get(history.size()-1);
    }
}
