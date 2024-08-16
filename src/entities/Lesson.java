package entities;

public abstract class Lesson {
	// Atributo
	private String title;
	
	// Método Getter e Setter
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	// Método Construtor
	public Lesson() {
		
	}
	
	public Lesson(String title) {
		this.title = title;
	}
	
	// Método
	public abstract int duration();
}
