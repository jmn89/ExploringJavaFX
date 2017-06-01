package pgjvx;
//@author sw89

class Player {

    private String name;
    private int seatNum;
    private Player toLeft;
    private Player toRight;

    public Player() {
        
    }

    public Player(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int i) {
        seatNum = i;
    }

    public Player getToLeft() {
        return toLeft;
    }

    public void setToLeft(Player p) {
        toLeft = p;
    }

    public Player getToRight() {
        return toRight;
    }

    public void setToRight(Player p) {
        toRight = p;
    }

}
