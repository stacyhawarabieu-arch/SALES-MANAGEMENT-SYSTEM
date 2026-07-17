import java.util.ArrayList;
import java.util.List;

/**
 * BacklogDemo
 *
 * A runnable demo class for the Sales Management System project that:
 *   1. Builds the list of user stories from the backlog.
 *   2. Sorts them into MoSCoW priority order.
 *   3. Prints the prioritised backlog.
 *   4. Runs a simple acceptance check on each story and prints
 *      whether it PASSES or FAILS.
 *
 * Compile and run with JDK 21, for example:
 *   javac *.java
 *   java BacklogDemo
 */
public class BacklogDemo {

    public static void main(String[] args) {
        List<UserStory> backlog = buildBacklog();

        PrioritisationPolicy policy = new PrioritisationPolicy();
        policy.sortByPriority(backlog);

        System.out.println("=== Sales Management System — Prioritised Backlog ===");
        for (UserStory story : backlog) {
            System.out.println(story);
        }

        System.out.println();
        System.out.println("=== Acceptance Checks ===");
        for (UserStory story : backlog) {
            boolean passed = policy.checkAcceptance(story);
            String result = passed ? "PASS" : "FAIL";
            System.out.printf("%s - %s: %s%n", story.getId(), result, story.storyText());
        }
    }

    private static List<UserStory> buildBacklog() {
        List<UserStory> stories = new ArrayList<>();

        stories.add(new UserStory(
                "US-01", "salesperson", "to log in with my sales system ID and password",
                "I can access my sales dashboard securely",
                MoscowPriority.MUST_HAVE, "UC-01",
                "a registered salesperson with a valid system ID and password",
                "the salesperson submits the login form with correct credentials",
                "the system grants access and redirects to the sales dashboard"));

        stories.add(new UserStory(
                "US-02", "salesperson", "to view my active leads and opportunities",
                "I can track my sales pipeline",
                MoscowPriority.MUST_HAVE, "UC-02",
                "a logged-in salesperson with assigned leads",
                "the salesperson opens the Sales Pipeline section of the dashboard",
                "the system displays open opportunities with dates, values, and status"));

        stories.add(new UserStory(
                "US-03", "salesperson", "to download a PDF sales report after a period of work",
                "I can review my performance and customer activity",
                MoscowPriority.SHOULD_HAVE, "UC-03",
                "a salesperson with completed opportunities",
                "the salesperson clicks Download Report",
                "the system generates and downloads a PDF report containing sales figures, dates, and account summaries"));

        stories.add(new UserStory(
                "US-04", "user of the portal", "to switch between light and dark themes",
                "I can use the system comfortably at night",
                MoscowPriority.COULD_HAVE, "UC-04",
                "a user is on any page of the portal",
                "the user clicks the theme toggle switch",
                "the interface switches theme and remembers the choice next visit"));

        stories.add(new UserStory(
                "US-05", "salesperson", "to receive an SMS reminder before a follow-up",
                "I do not miss an important customer meeting",
                MoscowPriority.WONT_HAVE, "UC-05",
                "a salesperson with an upcoming follow-up and a valid phone number on file",
                "the follow-up meeting is 1 day away",
                "the system sends an SMS reminder to the salesperson's registered number"));

        return stories;
    }
}
