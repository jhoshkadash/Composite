import java.util.List;

public class Text extends Graphic{
	@Override
	public void add(Graphic g) {}//Métodos do composite não são usados nas leaves(folhas)

	@Override
	public void remove(Graphic g) {}

	@Override
	public List<Graphic> getChild() {
		return null;
	}
	
	@Override
	public void draw() {
		System.out.println("Text");		
	}

}
