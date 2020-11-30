package JavaCore_11;

public class Task_01 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(0, 0);
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        Warehouse warehouse2 = new Warehouse(0, 0);
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        for (int i = 0; i < 1500; i++) {
            picker1.doWork();
            courier1.doWork();
        }
        System.out.println(warehouse1.toString());
        System.out.printf("Зарплата сборщика: %d \n", picker1.getSalary());
        System.out.printf("Зарплата курьера: %d \n\n", courier1.getSalary());

        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse1.toString());
        System.out.printf("Зарплата сборщика: %d \n", picker1.getSalary());
        System.out.printf("Зарплата курьера: %d \n\n", courier1.getSalary());

        System.out.println(warehouse2.toString());
        System.out.printf("Зарплата сборщика: %d \n", picker2.getSalary());
        System.out.printf("Зарплата курьера: %d \n\n", courier2.getSalary());
    }
}
