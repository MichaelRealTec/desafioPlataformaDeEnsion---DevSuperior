package entities;

public class Video extends Lesson {
	// Atributo
	private String url;
	private int seconds;
	
	// Método Getter e Setter
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	// Método Construtor
	public Video() {
		
	}
	
	public Video(String title, String url, int seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}
	
	// Método
	@Override
	public int duration() {
		return 0;
	}
}
