package entities;

public class Task extends Lesson{
	// Atributo
	
	private String description;
	private int questionCount;
	
	// Método Getter e Setter
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	
	public int getQuestionCount() {
		return questionCount;
	}
	
	// Método Construtor
	public Task() {
		super();
	}
	
	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}
	
	
	// Método
	@Override
	public int duration() {
		return 0;
	}
}
