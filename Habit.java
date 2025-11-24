public class Habit {
    String name;
    int completedDays;

    public Habit(String name) {
        this.name = name;
        this.completedDays = 0;
    }

    public String getName() {
        return name;
    }

    public int getCompletedDays() {
        return completedDays;
    }

    public void markCompleted() {
        completedDays++;
    }
}