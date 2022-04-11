package CircleLab;

public class Point {
	int x, y;

	public Point() {
		x = 7;
		y = 0;

	}

	public Point(int aa, int bb) {
		x = aa;
		y = bb;
	}

	public void setX(int aa) {
		x = aa;

	}

	public int getX() {
		return x;
	}

	public void setY(int bb) {
		y = bb;

	}

	public int getY() {
		return y;
	}

	public String toString() {
		String str = "(" + x + "," + y + ")";
		return str;

	}
}
