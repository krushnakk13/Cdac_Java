
public class ShapeMain {
	public static void main(String[] args) {
		Shape sh = new Rectangle();
		sh.draw();
		sh.findArea();
		sh.erase();
		System.out.println("=====================");
		Shape sh1 = new Circle();
		sh1.draw();
		sh1.findArea();
		sh1.erase();
		
		
	}

}
