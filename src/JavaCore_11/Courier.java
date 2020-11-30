package JavaCore_11;

public class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) { this.warehouse = warehouse; }
    public int getSalary() { return salary; }

    @Override
    public void doWork() {
        this.salary += 100;
        this.warehouse.setBalance(this.warehouse.getBalance() + 1000);
        this.bonus();
    }

    @Override
    public void bonus() {
        if(this.warehouse.getBalance() % 1000000 == 0) {
            this.salary *= 2;
        }
    }
}
