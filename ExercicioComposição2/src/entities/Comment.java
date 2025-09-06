package entities;

//Criar 1 construtor Vazio + 1 Contrutor com argumentos
public class Comment {
	
	private String text;
	
	//1 = Construtor Vazio
	public Comment(){
		
	}

 //2- Contrutor com argumentos
	public Comment(String text) {
		this.text = text;
	}

	//3- Construtor Get and Setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
