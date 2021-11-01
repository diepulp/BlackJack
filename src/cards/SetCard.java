package cards;

public class SetCard extends Card {
    private final String SHAPE;
    private final int NUMBER;
    private final String SHADING;
    private final String COLOR;

    public SetCard(String shape, int number, String shading, String color){
        super(shape + color);
        this.SHAPE= shape;
        this.NUMBER = number;
        this.SHADING = shading;
        this.COLOR = color;
    }

    public String getShape() {
        return SHAPE;
    }

    public int getNumber() {
        return NUMBER;
    }

    public String getShading() {
        return SHADING;
    }

    public String getColor() {
        return COLOR;
    }
    public String toString(){
        return super.getCardText();
    }
}
