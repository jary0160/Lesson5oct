
package lucky7;


public class Dice {

    private int number;

    public Dice() {
        number = 1;
    }

    public int getNumber() {
        return number;
    }

    public void roll() {
        number = (int) (Math.random() * 6 + 1);

    }

}
