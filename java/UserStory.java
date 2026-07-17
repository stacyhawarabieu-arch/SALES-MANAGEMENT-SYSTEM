/**
 * UserStory
 *
 * Represents a single user story from the backlog, in the standard
 * "As a ... I want ... so that ..." format, together with its unique
 * ID, its MoSCoW priority, and a Given-When-Then acceptance scenario.
 */
public class UserStory {

    private final String id;          // e.g. "US-01"
    private final String asA;         // the role, e.g. "student"
    private final String iWant;       // the action wanted
    private final String soThat;      // the benefit/reason
    private final MoscowPriority priority;
    private final String useCaseLink; // e.g. "UC-01"

    // Given-When-Then acceptance criteria
    private final String given;
    private final String when;
    private final String then;

    public UserStory(String id, String asA, String iWant, String soThat,
                      MoscowPriority priority, String useCaseLink,
                      String given, String when, String then) {
        this.id = id;
        this.asA = asA;
        this.iWant = iWant;
        this.soThat = soThat;
        this.priority = priority;
        this.useCaseLink = useCaseLink;
        this.given = given;
        this.when = when;
        this.then = then;
    }

    public String getId() {
        return id;
    }

    public MoscowPriority getPriority() {
        return priority;
    }

    public String getUseCaseLink() {
        return useCaseLink;
    }

    public String getGiven() { return given; }
    public String getWhen()  { return when; }
    public String getThen()  { return then; }

    /**
     * Prints the story in standard "As a / I want / So that" format.
     */
    public String storyText() {
        return String.format("As a %s, I want %s, so that %s.", asA, iWant, soThat);
    }

    @Override
    public String toString() {
        return String.format("[%s] (%s) %s  [Use Case: %s]",
                id, priority.label(), storyText(), useCaseLink);
    }
}