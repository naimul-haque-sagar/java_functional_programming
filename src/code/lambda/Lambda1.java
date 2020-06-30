package code.lambda;

interface DrawSomething {

    void drawPicture(int x, int y);
}

public class Lambda1 {

    static DrawSomething drawSomething = (x, y) -> System.out.println(x + y);

    static DrawSomething drawSomething1 = (a, b) -> System.out.println(a + b);

    public static void main(String[] args) {
        int x = 2, y = 4;
        drawSomething.drawPicture(x, y);
        drawSomething1.drawPicture(y, y);
    }
}
