package lab2;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		Square sq = new Square(300, 300, 200);
			sq.draw(w);
			sq.move(40,40);
			sq.draw(w);
			sq.move(40, -80);
			sq.draw(w);
	}
}
