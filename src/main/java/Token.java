public class Token {
    static int size=8;
    int positionX;
    int positionY;
    int id;
    String name;

    static Token[] Tokens = new Token[size*size];

    public Token(int posX,int posY, int ide, String symbol) {
        this.positionX = posX;
        this.positionY = posY;
        this.id = ide;
        this.name = symbol;
    }

    //create TOKENS - list with token objects
    public static void createToken(int posX, int posY, int ide, String symbol) {
        Tokens[ide] = new Token(posX,posY,ide,symbol);
        System.out.print("Token: "+Tokens[ide].name+"| ID:"+Tokens[ide].id);
        System.out.println("| PositionXY: "+Tokens[ide].positionX+"|"+Tokens[ide].positionY);
    }

    public static String getTokenPosition(int id) {
        return (Tokens[id].positionX +"|"+Tokens[id].positionY);
    }

    public static void setPositionXY(int posX, int posY, int ide){
        System.out.println("BEFORE: Pozycja XY: "+Token.getTokenPosition(ide));
        Tokens[ide].positionX = posX;
        Tokens[ide].positionY = posY;
        //initGame.setGameBoard(posX, posY, Tokens[ide].name);
        System.out.println("AFTER: Pozycja XY: "+Token.getTokenPosition(ide));
    }

    public static String getTokenSymbol(int id) {
        return Tokens[id].name;
    }

    public static Token getToken(int id) {
        return Tokens[id];
    }

}


