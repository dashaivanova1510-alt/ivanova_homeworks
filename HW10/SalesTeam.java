import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Employee {
    private final String teamName;
    private final List<Employee> members = new ArrayList<>();

    public SalesTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addElement(Employee employee) {
        members.add(employee);
    }

    @Override
    public void payExpenses() {
        System.out.println("--- Processing payments for: " + teamName + " ---");
        for (Employee member : members) {
            member.payExpenses();
        }
    }
}
