package ClassWork;

public class Inter {
    public static void main(String[] args) {
        Summable sum1;
        //x + x^2 + y + y^2 + x^3

        sum1 = ((x, y) -> (int)Math.round(x + Math.pow(x, 2) + y + Math.pow(y, 2) + Math.pow(x, 3)));
    }
}
