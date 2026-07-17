import java.util.Comparator;
import java.util.List;

/**
 * PrioritisationPolicy
 *
 * A "policy" (rule) class responsible for two jobs:
 *   1. Sorting a list of UserStory objects into MoSCoW order
 *      (Must Have first, Won't Have last).
 *   2. Checking whether a UserStory's acceptance criteria "pass",
 *      based on a very simple rule: all three parts (given/when/then)
 *      must be filled in with meaningful (non-empty) text.
 *
 * In a real project this class could be extended to run against
 * live application state instead of just checking text is present.
 */
public class PrioritisationPolicy {

    /**
     * Sorts the given list of stories in place, ordered by MoSCoW
     * priority (Must Have -> Should Have -> Could Have -> Won't Have).
     */
    public void sortByPriority(List<UserStory> stories) {
        stories.sort(Comparator.comparing(story -> story.getPriority().ordinal()));
    }

    /**
     * Very simple acceptance check: passes if the given/when/then
     * fields are all present and non-blank. Returns true (PASS) or
     * false (FAIL).
     */
    public boolean checkAcceptance(UserStory story) {
        return isFilled(story.getGiven())
                && isFilled(story.getWhen())
                && isFilled(story.getThen());
    }

    private boolean isFilled(String text) {
        return text != null && !text.trim().isEmpty();
    }
}