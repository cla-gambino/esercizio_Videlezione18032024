public class Rettangolo implements Shape {
    @Override
    public void draw() {
        System.out.println("rettangolo");
    }

    @Override
    public TipiDiShape getShape() {
        return TipiDiShape.RETTANGOLO;
    }

    @Override
    public String toString() {
        return "Rettangolo";
    }
}