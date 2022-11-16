import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {
	private List<Graphic> lista = new ArrayList<Graphic>(); //Composição 0..n
	public void add(Graphic g) { //adicionar "figura" a lista
		lista.add(g);
	}
	public void remove(Graphic g) { //remover "figura" da lista
		lista.remove(g);
	}
	
	public List<Graphic> getChild(){ //Retorna a lista
		return lista;
	}
	public void draw() {//Mostrar as figuras
		for (Graphic graphic : lista) {
			graphic.draw();
		}
	}
}
