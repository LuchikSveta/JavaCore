package JavaCore_Final;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class Task_main {
    public static void main(String[] args) {
        ChessBoard board1 = new ChessBoard();
        ChessBoard board2 = new ChessBoard();

        MyShips ships1 = new MyShips();
        MyShips ships2 = new MyShips();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Начнем расставлять корабли на поле Player1. Другой игрок, не смотри!");
        createBoardShips(board1, ships1);
        System.out.println("Для создания поля игрока2 и скрытия текущего поля нажмите на корзину для очистки консоли, а затем Enter");
        scanner.nextLine();
        System.out.println("Начнем расставлять корабли на поле Player2. Другой игрок, не смотри!");
        createBoardShips(board2, ships2);
        System.out.println("Для начала игры нажмите на корзину для очистки консоли, а затем Enter");
        scanner.nextLine();

        Random rand = new Random();
        int player = rand.nextInt(1) + 1;
        boolean game = true;
        int playGame;
        while(game) {
            if (player == 1) {
                playGame = play(board1, ships1, player);
                if (playGame == 1){
                    player = 2;
                }
            } else {
                playGame = play(board2, ships2, player);
                if(playGame == 1){
                    player = 1;
                }
            }
            if(playGame == 0){
                game = false;
            }
        }
        System.out.println("Игра окончена, победил Игрок"+player);
    }

    public static void createBoardShips(ChessBoard board, MyShips ships) {
        createShip("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y;x,y)", board, ships, 4);
        createShip("Введите координаты первого трехпалубного корабля (формат: x,y;x,y;x,y;x,y)", board, ships, 3);
        createShip("Введите координаты второго трехпалубного корабля (формат: x,y;x,y;x,y)", board, ships, 3);
        createShip("Введите координаты первого двухпалубного корабля (формат: x,y;x,y)", board, ships, 2);
        createShip("Введите координаты второго двухпалубного корабля (формат: x,y;x,y)", board, ships,  2);
        createShip("Введите координаты третьего двухпалубного корабля (формат: x,y;x,y)", board, ships,  2);
        createShip("Введите координаты первого однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты второго однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты третьего однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты четвертого однопалубного корабля (формат: x,y)", board, ships,  1);
        board.print();
    }

    public static void createShip(String text, ChessBoard board, MyShips ships, int size) {
        try {
            System.out.println(text);
            Scanner scanner = new Scanner(System.in);
            String shipIn = scanner.nextLine();
            int k = 0;
            String[] fields = shipIn.split(";");
            if (fields.length != size) {
                throw new MyException(1);
            }
            int[][] arrayCoordinates = new int[fields.length][];
            for (String i : fields) {
                arrayCoordinates[k] = new int[]{Integer.parseInt(i.split(",")[0]), Integer.parseInt(i.split(",")[1])};
                k++;
            }
            for (int[] i : arrayCoordinates) {
                if (i.length != 2) {
                    throw new MyException(2);
                }
                if(!Pattern.matches("\\d,\\d", "i[0],i[1]")) {
                    throw new MyException(3);
                }
                if (i[0] < 0 || i[0] > 9 || i[1] < 0 || i[1] > 9) {
                    throw new MyException(3);
                }
                if (board.getShip(i[0], i[1]).equals("\uD83D\uDFE6")) {
                    throw new MyException(4);
                }
                if (board.getShip(i[0], i[1]).equals("\uD83D\uDEE5")) {
                    throw new MyException(5);
                }
            }
            if (arrayCoordinates.length == 2) {
                int x1 = arrayCoordinates[0][0];
                int y1 = arrayCoordinates[0][1];
                int x2 = arrayCoordinates[1][0];
                int y2 = arrayCoordinates[1][1];
                if (!((x1 == x2 && abs(y1 - y2) == 1) || (y1 == y2 && abs(x1 - x2) == 1))) {
                    throw new MyException(6);
                }
            }
            if (arrayCoordinates.length == 3) {
                int x1 = arrayCoordinates[0][0];
                int y1 = arrayCoordinates[0][1];
                int x2 = arrayCoordinates[1][0];
                int y2 = arrayCoordinates[1][1];
                int x3 = arrayCoordinates[2][0];
                int y3 = arrayCoordinates[2][1];
                int[] x = {x1, x2, x3};
                int[] y = {y1, y2, y3};
                Arrays.sort(x);
                Arrays.sort(y);
                if (!(((x1 == x2 && x1 == x3) && (y[2] - y[1] == 1 && y[1] - y[0] == 1)) || ((y1 == y2 && y1 == y3) && (x[2] - x[1] == 1 && x[1] - x[0] == 1)))) {
                    throw new MyException(6);
                }
            }
            if (arrayCoordinates.length == 4) {
                int x1 = arrayCoordinates[0][0];
                int y1 = arrayCoordinates[0][1];
                int x2 = arrayCoordinates[1][0];
                int y2 = arrayCoordinates[1][1];
                int x3 = arrayCoordinates[2][0];
                int y3 = arrayCoordinates[2][1];
                int x4 = arrayCoordinates[3][0];
                int y4 = arrayCoordinates[3][1];
                int[] x = {x1, x2, x3, x4};
                int[] y = {y1, y2, y3, y4};
                Arrays.sort(x);
                Arrays.sort(y);
                if (!(((x1 == x2 && x1 == x3 && x1 == x4) && (y[3] - y[2] == 1 && y[2] - y[1] == 1 && y[1] - y[0] == 1)) || ((y1 == y2 && y1 == y3 && y1 == y4) && (x[3] - x[2] == 1 && x[2] - x[1] == 1 && x[1] - x[0] == 1)))) {
                    throw new MyException(6);
                }
            }
            Ship ship = new Ship(size);
            for (int[] i : arrayCoordinates) {
                board.setShip(i[0], i[1]);
                ship.addShip(new ShipCoordinates(i[0], i[1]));
                if (i[0] > 0) {
                    if (i[1] > 0) {
                        if (board.getShip(i[0] - 1, i[1] - 1).equals("⬜")) {
                            board.setHalo(i[0] - 1, i[1] - 1);
                        }
                        if (board.getShip(i[0], i[1] - 1).equals("⬜")) {
                            board.setHalo(i[0], i[1] - 1);
                        }
                    }
                    if (board.getShip(i[0] - 1, i[1]).equals("⬜")) {
                        board.setHalo(i[0] - 1, i[1]);
                    }
                }
                if (i[0] < 9) {
                    if (i[1] > 0 && board.getShip(i[0] + 1, i[1] - 1).equals("⬜")) {
                        board.setHalo(i[0] + 1, i[1] - 1);
                    }
                    if (board.getShip(i[0] + 1, i[1]).equals("⬜")) {
                        board.setHalo(i[0] + 1, i[1]);
                    }
                }
                if (i[1] < 9) {
                    if (i[0] > 0 && board.getShip(i[0] - 1, i[1] + 1).equals("⬜")) {
                        board.setHalo(i[0] - 1, i[1] + 1);
                    }
                    if (board.getShip(i[0], i[1] + 1).equals("⬜")) {
                        board.setHalo(i[0], i[1] + 1);
                    }
                    if (i[0] < 9 && board.getShip(i[0] + 1, i[1] + 1).equals("⬜")) {
                        board.setHalo(i[0] + 1, i[1] + 1);
                    }
                }
            }
            ships.addShip(ship);
        } catch (MyException e) {
            System.out.println(e.toString());
            createShip(text, board, ships, size);
        }
    }

    public static int play(ChessBoard board, MyShips ships, int player){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Игрок" + player + ", произведите выстрел:");
            String field = scanner.nextLine();
            if(!Pattern.matches("\\d,\\d", field)) {
                throw new MyException(3);
            }
            int x = Integer.parseInt(field.split(",")[0]);
            int y = Integer.parseInt(field.split(",")[1]);
            int result = 1;
            for (Ship ship : ships.getShipList()) {
                for(ShipCoordinates shipCoordinates: ship.getShipCoordinates()) {
                    if (shipCoordinates.getX() == x && shipCoordinates.getY() == y) {
                        board.killShip(x, y);
                        ship.deleteShipCoordinates(shipCoordinates);
                        if (ship.getShipLength() == 0) {
                            ships.deleteShip(ship);
                            System.out.println("Утопил!");
                        } else {
                            System.out.println("Попадание!");
                        }
                        if (ships.getCountShips() == 0)
                            result = 0;
                        else {
                            result = 2;
                        }
                        break;
                    }
                }
                if(result != 1){
                    break;
                }
            }
            if(result == 1){
                System.out.println("Мимо!");
            }
            return result;
        } catch (MyException e) {
            System.out.println(e.toString());
            return play(board, ships, player);
        }
    }
}
