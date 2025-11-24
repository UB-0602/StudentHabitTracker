import java.util.ArrayList;
import java.util.List;

public class HabitService {
    private List<Habit> habits = new ArrayList<>();

    public void addHabit(String name) {
        habits.add(new Habit(name));
        System.out.println("Habit added successfully!");
    }

    public void deleteHabit(String name) {
        boolean removed = habits.removeIf(h -> h.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Habit deleted.");
        } else {
            System.out.println("Habit not found.");
        }
    }

    public void viewHabits() {
        if (habits.isEmpty()) {
            System.out.println("No habits found.");
            return;
        }
        System.out.println("Your Habits:");
        for (Habit h : habits) {
            System.out.println("- " + h.getName() + " | Completed Days: " + h.getCompletedDays());
        }
    }

    public void markCompleted(String name) {
        for (Habit h : habits) {
            if (h.getName().equalsIgnoreCase(name)) {
                h.markCompleted();
                System.out.println("Marked complete!");
                return;
            }
        }
        System.out.println("Habit not found.");
    }

    public List<Habit> getHabits() {
        return habits;
    }
}