import java.util.List;

public class ReportService {
    public void showReport(List<Habit> habits) {
        System.out.println("\n=== Habit Report ===");

        if (habits.isEmpty()) {
            System.out.println("No habits to show.");
            return;
        }

        for (Habit h : habits) {
            System.out.println(h.getName() + " → Completed Days: " + h.getCompletedDays());
        }

        System.out.println("====================\n");
    }
}