package AssignmentThree;

public class Colour {

    private String model = "RGB";
    private int componentOne = 0;
    private int componentTwo = 0;
    private int componentThree = 0;

    public Colour(String m, int c1, int c2, int c3){
        model = m;
        this.componentOne = c1;
        this.componentTwo = c2;
        this.componentThree = c3;
    }

    public static boolean satisfiesRange(Colour colour) {
        return true;
    }
}
