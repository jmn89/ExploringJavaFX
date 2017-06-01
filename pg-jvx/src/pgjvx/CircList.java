package pgjvx;
//@author jmn89

public class CircList {

    private Player tail;
    public static int size = 0;

    private void insert(Player p) {

        if (tail == null) {

            p.setToLeft(p);
            p.setToRight(p);

        } else {

            p.setToRight(tail);
            p.setToLeft(tail.getToLeft());

            tail.setToLeft(p);

        }

        tail = p;
        size++;
        p.setSeatNum(size);

    }

    private void remove(int seat) {

        if (seat >= 1 && seat <= size) {                    // if (... && if seat is occupied)

            Player t = tail.getToLeft();

            while (seat != t.getSeatNum()) {

                t = t.getToLeft();
            }

            System.out.println("Removing Seat Number == " + t.getSeatNum());
            t.getToRight().setToLeft(t.getToLeft());
            t.getToLeft().setToRight(t.getToRight());
            size--;
            System.out.println("Removed Seat Number == " + t.getSeatNum() + "\n" + "Seat Count == " + size);

        } else {

            System.out.println("Seat " + seat + " is Empty!");
        }
    }

    public void testListAddRemove() {

        Player p1 = new Player("A");
        Player p2 = new Player("B");
        Player p3 = new Player("C");
        Player p4 = new Player("D");

        this.insert(p1);
        this.insert(p2);
        this.insert(p3);
        this.insert(p4);
        this.remove(4);
        this.remove(99);

        System.out.println("1 == " + this.tail.getToLeft().getName());
        System.out.println("2 == " + this.tail.getToLeft().getToLeft().getName());
        System.out.println("3 == " + this.tail.getToLeft().getToLeft().getToLeft().getName());
        System.out.println("4 == " + this.tail.getToLeft().getToLeft().getToLeft().getToLeft().getName());
        System.out.println("5 == " + this.tail.getToLeft().getToLeft().getToLeft().getToLeft().getToLeft().getName());
        System.out.println("6 == " + this.tail.getToLeft().getToLeft().getToLeft().getToLeft().getToLeft().getToLeft().getName());

    }

}
