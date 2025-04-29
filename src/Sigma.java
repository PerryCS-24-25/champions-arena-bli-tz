import java.util.List;
import java.util.ArrayList;

/**
 * Your champion. Change the class name, the name field, and make it yours!
 */
public class Sigma extends Champion {
    public static final String NAME = "Sigma";

    public Sigma() {
        // Create a champion with an attack of 5, a defense of 5, and max health of 40
        super("Sigma", 6, 4, 100);
    }

    @Override
    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>(super.getActions());
        actions.add(new Jab()); // Replace with your custom actions
        return actions;
    }
}