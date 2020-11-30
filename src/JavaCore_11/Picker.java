package JavaCore_11;

public class Picker implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) { this.warehouse = warehouse; }
    public int getSalary() { return salary; }

    @Override
    public void doWork() {
        this.salary += 80;
        this.warehouse.setCountOrder(this.warehouse.getCountOrder() + 1);
        this.bonus();
    }

    @Override
    public void bonus() {
        if(this.warehouse.getCountOrder() % 1500 == 0) {
            this.salary *= 3;
        }
    }
}
