import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("START GAME!");
        boolean gameEnd = false;

        int size = 8;
        initGame gameBoard = new initGame(size);
        gameBoard.initBoard(); //create game board
        //gameBoard.getBoard(size);

        int c= 0;
        while (!gameEnd) {
            gameBoard.getBoard(size);
            //gameBoard.showBoard(size);
            System.out.println("Select token to move: ");
            Scanner move = new Scanner(System.in);
            int selectedToken = move.nextInt();
            System.out.println("Selected token "+selectedToken);
            System.out.println("Pozycja XY: "+Token.getTokenPosition(selectedToken));
            //method to display avaliable moves
            System.out.println("Select positions to move: ");
            System.out.print("Select positions X: ");
            Scanner moveX = new Scanner(System.in);
            int selectedTokenX = move.nextInt();
            System.out.print("Select positions Y: ");
            Scanner moveY = new Scanner(System.in);
            int selectedTokenY = move.nextInt();
            System.out.println("NA Pozycja XY: "+selectedTokenX + "|"+selectedTokenY);
            Token.setPositionXY(selectedTokenX,selectedTokenY, selectedToken);
            c++;

            if (c==2) {
                gameEnd=true;
            }
        }

    }
}
