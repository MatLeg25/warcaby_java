public class initGame {
    int size = 8;
    private String[][] gameBoard = new String[size][size];
    String[] labelX = new String[size];
    String[] labelY = new String[size];
    String[] LIST = new String[size];


    public initGame(int size) {
        String positions = "";
        int counter = 1;
        //int[][] gameBoard = new int[size][size];
        for(int x=0;x<size;x++) {
            for(int y=0;y<size;y++) {
                gameBoard[x][y] = ".";
                positions+= " "+counter+"|";
                counter++;
            }
        }
    }

    public void getBoard(int size) {

        //fill label X
        for (int i = 0; i < size; i++) {
            labelX[i] = String.valueOf(i + 1);
        }
        //display Label X by for each loop
        System.out.print("X ");
        for (String j : labelX) {
            System.out.print(j+" - ");
        }
        System.out.println();

        //DISPLAY BOARDS
        for(int x=0;x<size;x++) {
            System.out.print(labelX[x]+"|");
            for(int y=0;y<size;y++) {
                System.out.print(gameBoard[x][y]+" | ");
            }
            System.out.println();
        }
    }

    public void initBoard() {
        Token Tokens[] = new Token[size*size];
        int counter=0;
        for(int x=0;x<size;x++) {
            for(int y=0;y<size;y++) {
               // counter++;
                //Player1 positions
                if((y%2==1 && x%2==0 && x<3) || (y%2==0 && x%2==1 && x<3)) {
                    gameBoard[x][y] = "F";
                    Tokens[counter] = new Token(x,y,counter,"F");
                    Token.createToken(x,y,counter,"X");
                    System.out.print("TokenID: "+Tokens[counter].name+"| ID:"+Tokens[counter].id);
                    System.out.println("| PositionXY: "+Tokens[counter].positionX+"|"+Tokens[counter].positionY);
                    counter++;
                }
                //Player2 positions
                if((y%2==1 && x%2==0 && x>=size-3) || (y%2==0 && x%2==1 && x>=size-3)) {
                    gameBoard[x][y] = "E";
                    Tokens[counter] = new Token(x,y,counter,"E");
                    System.out.print("TokenID: "+Tokens[counter].name+"| ID:"+Tokens[counter].id);
                    System.out.println("| PositionXY: "+Tokens[counter].positionX+"|"+Tokens[counter].positionY);
                    counter++;
                }
            }
        }

        System.out.println("Create tokens:");
        //Token [] Tokens = new Token[size];
        //new Token(1,2,3,"F");
        //Tokens[counter] = new Token(x,y,counter,"T");
        //System.out.println(Tokens[counter].identificator);


    }
}
