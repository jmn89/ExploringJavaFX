package pgjvx;
//@author sw89

class Player {

    private int SeatNum;
    private boolean inGame;
    private Card c1;
    private Card c2;
    private double chipCount;
    private boolean inHand;
    private final String name;

    public Player(String name2) {
        this.name = name2;
        this.inGame = true;
        this.chipCount = 1000;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getChipCountAsString() {
        return Double.toString(chipCount);
    }

    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }

    public Card getC2() {
        return c2;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public void setC1(Card c1) {
        this.c1 = c1;
    }

    public void setC2(Card c2) {
        this.c2 = c2;
    }

    public void setChipCount(double chipCount) {
        this.chipCount = this.chipCount + chipCount;
    }

    public void setInHand(boolean inHand) {
        this.inHand = inHand;
    }
}
