package JavaCore_07;

public class Task_02 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        player1.info();
        //Player player7 = new Player();
        //System.out.println(player1.getCountPlayers());
        while (player1.getStamina() > 1) {
            player1.run();
        }
        System.out.println(player1.getStamina());
        player1.run();
        System.out.println(player1.getStamina());
        player2.info();
        Player player7 = new Player();
        //player7.info();
        Player player8 = new Player();
    }
}
