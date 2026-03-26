public class ExpensesClient {

    public static void main(String[] args) {
        Manager director = new Manager("Big Boss Jane", 5000);

        SalesTeam meatDept = new SalesTeam("Meat Department");
        meatDept.addElement(new Manager("Oleksandr", 1500));
        meatDept.addElement(new Salesperson("Taras", 800));
        meatDept.addElement(new Salesperson("Ivan", 800));
        meatDept.addElement(new Salesperson("Oleg", 800));

        SalesTeam dairyDept = new SalesTeam("Dairy Department");
        dairyDept.addElement(new Manager("Olena", 1500));
        dairyDept.addElement(new Salesperson("Maria", 850));
        dairyDept.addElement(new Salesperson("Anna", 850));
        dairyDept.addElement(new Salesperson("Svitlana", 850));

        SalesTeam candyDept = new SalesTeam("Confectionery Department");
        candyDept.addElement(new Manager("Dmytro", 1600));
        candyDept.addElement(new Salesperson("Iryna", 900));
        candyDept.addElement(new Salesperson("Katerina", 900));
        candyDept.addElement(new Salesperson("Olga", 900));

        SalesTeam supermarket = new SalesTeam("MAIN SUPERMARKET");
        supermarket.addElement(director);
        supermarket.addElement(meatDept);
        supermarket.addElement(dairyDept);
        supermarket.addElement(candyDept);

        pay(supermarket);
    }

    private static void pay(Employee employee) {
        System.out.println("Expenses have been requested...");
        employee.payExpenses();
        System.out.println("All expenses have been paid.\n");
    }
}
