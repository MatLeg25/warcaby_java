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


/*
    static Token[] Tokens = new Token[size*size];

    public Token(int posX,int posY, int ide, String symbol) {
        this.positionX = posX;
        this.positionY = posY;
        this.id = ide;
        this.name = symbol;
    }*/


    public void getBoard(int size) {

        //fill label X
        for (int i = 0; i < size; i++) {
            labelX[i] = String.valueOf(i);
        }
        //display Label X by for each loop
        System.out.print("+ ");
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
       // Token Tokens1[] = new Token[size*size];
        int counter=0;
        for(int x=0;x<size;x++) {
            for(int y=0;y<size;y++) {
               // counter++;
                //Player1 positions
                if((y%2==1 && x%2==0 && x<3) || (y%2==0 && x%2==1 && x<3)) {
                    gameBoard[x][y] = "F";
                   // Tokens1[counter] = new Token(x,y,counter,"F");
                    Token.createToken(x,y,counter,"X");
                  //  System.out.print("TokenID: "+Tokens1[counter].name+"| ID:"+Tokens1[counter].id);
                   // System.out.println("| PositionXY: "+Tokens1[counter].positionX+"|"+Tokens1[counter].positionY);
                    gameBoard[x][y] = Token.getTokenSymbol(counter);
                    counter++;
                }
                //Player2 positions
                if((y%2==1 && x%2==0 && x>=size-3) || (y%2==0 && x%2==1 && x>=size-3)) {
                    gameBoard[x][y] = "E";
                    //Tokens1[counter] = new Token(x,y,counter,"E");
                    Token.createToken(x,y,counter,"Y");
                    //System.out.print("TokenID: "+Tokens1[counter].name+"| ID:"+Tokens1[counter].id);
                    //System.out.println("| PositionXY: "+Tokens1[counter].positionX+"|"+Tokens1[counter].positionY);
                    gameBoard[x][y] = Token.getTokenSymbol(counter);
                    counter++;
                }
            }
        }
        System.out.println("Create tokens:");
    }

    public void setGameBoard(int x, int y, String symbol) {
        this.gameBoard[x][y] = symbol;
    }

    public void showBoard(int size) {

        //fill label X
        for (int i = 0; i < size; i++) {
            labelX[i] = String.valueOf(i + 1);
        }
        //display Label X by for each loop
        System.out.print("+ ");
        for (String j : labelX) {
            System.out.print(j+" - ");
        }
        System.out.println();

        //DISPLAY BOARDS
        int c= 0;
        for(int x=0;x<size;x++) {
            System.out.print(labelX[x]+"|");
            for(int y=0;y<size;y++) {
                Token obiekt = Token.getToken(c);
                //System.out.println("OBIEKT: "+obiekt.id);
                System.out.print(gameBoard[x][y]+" | ");
                c++;
            }
            System.out.println();
        }
    }
}
