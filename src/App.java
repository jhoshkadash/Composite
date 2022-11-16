
public class App {
	public static void main(String[]Args) {
		Graphic g = new Picture(); //g é o objeto composto pai que deve possuir todos os outros objetos
		
		Picture p = new Picture();
		Line l = new Line();
		Rectangle r = new Rectangle();
		Text t = new Text();
		p.add(l);
		p.add(r);
		p.add(t);
		//objeto p instanciado e adicionado figuras no composite
		
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		g.add(p); //adicionado o objeto composto p
		g.add(l1);
		g.add(r1); // e adicionado objetos folha no objeto composto g
		
		
		p.draw();
		System.out.println();
		g.draw(); 
		
		
	}
}
