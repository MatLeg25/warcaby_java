public class Token {
    int positionX;
    int positionY;
    int id;
    String name;

    static Token[] LISTA = new Token[100];


    public Token(int posX,int posY, int ide, String symbol) {
        this.positionX = posX;
        this.positionY = posY;
        this.id = ide;
        this.name = symbol;
    }

    public static void createToken(int posX, int posY, int ide, String symbol) {
        LISTA[ide] = new Token(posX,posY,ide,symbol);
        System.out.println(LISTA[ide].positionX);
    }

    public static int getToken(int id) {
        return LISTA[id].positionY;
    }
}
