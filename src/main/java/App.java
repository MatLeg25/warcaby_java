import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("START GAME!");
        boolean gameEnd = false;

        int size = 8;
        initGame gameBoard = new initGame(size);
        gameBoard.initBoard();
        //gameBoard.getBoard(size);

        int c= 0;
        while (!gameEnd) {
            gameBoard.getBoard(size);
            System.out.println("Select token to move: ");
            Scanner move = new Scanner(System.in);
            int selectedToken = move.nextInt();
            System.out.println("Selected token "+selectedToken);
            System.out.println("Pozycja Y: "+Token.getToken(selectedToken));
            //method to display avaliable moves

            c++;

            if (c==2) {
                gameEnd=true;
            }
        }

    }
}
