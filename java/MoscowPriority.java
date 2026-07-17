/**
 * MoscowPriority
 *
 * Represents the four MoSCoW prioritisation levels used to rank
 * user stories in the backlog: Must Have, Should Have, Could Have,
 * and Won't Have (this time).
 *
 * The order below (MUST_HAVE first, WONT_HAVE last) is used directly
 * for sorting the backlog, via the built-in ordinal() value.
 */
public enum MoscowPriority {
    MUST_HAVE,
    SHOULD_HAVE,
    COULD_HAVE,
    WONT_HAVE;

    /**
     * Returns a friendly, human-readable label for display,
     * e.g. "Must Have" instead of "MUST_HAVE".
     */
    public String label() {
        switch (this) {
            case MUST_HAVE:   return "Must Have";
            case SHOULD_HAVE: return "Should Have";
            case COULD_HAVE:  return "Could Have";
            case WONT_HAVE:   return "Won't Have";
            default:          return this.name();
        }
    }
}