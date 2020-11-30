package JavaCore_11;

public class Warehouse {
    private int countOrder, balance;

    public Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public void setCountOrder(int countOrder) { this.countOrder = countOrder; }
    public void setBalance(int balance) { this.balance = balance; }
    public int getCountOrder() { return countOrder; }
    public int getBalance() { return balance; }

    public String toString() {
        return "Количество собранных заказов: " + getCountOrder() + "\nДоход от доставленных заказов:" + getBalance();
    }
}
