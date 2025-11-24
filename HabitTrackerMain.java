import java.util.Scanner;

public class HabitTrackerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HabitService habitService = new HabitService();
        ReportService reportService = new ReportService();

        while (true) {
            System.out.println("\n===== Habit Tracker =====");
            System.out.println("1. Add Habit");
            System.out.println("2. Delete Habit");
            System.out.println("3. View Habits");
            System.out.println("4. Mark Habit Completed");
            System.out.println("5. View Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    System.out.print("Enter habit name: ");
                    habitService.addHabit(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter habit name to delete: ");
                    habitService.deleteHabit(sc.nextLine());
                    break;

                case 3:
                    habitService.viewHabits();
                    break;

                case 4:
                    System.out.print("Enter habit name to mark complete: ");
                    habitService.markCompleted(sc.nextLine());
                    break;

                case 5:
                    reportService.showReport(habitService.getHabits());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}