package code.lambda;

interface Draw {
    void draw();
}

// problem without lambda 
public class Lambda {
    public static void main(String[] args) {
        Draw draw = new Draw() {
            public void draw() {
                System.out.println("Draw a picture");
            }
        };
        draw.draw();
    }
}

// solution with lambda
class Solution {

    public static void main(String[] args) {
        Draw draw = () -> System.out.println("Draw another picture");
        draw.draw();

    }

}
