
//ATENÇÃO => Sempre que tiver uma COLEÇÃO criar o Add e o Remove comments.

package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//Para não ficar Instanciando direto... Passa ela como uma Variavel para o programa todo. [Moment é passado como = DD/MM/YYYY HH:MM:SS 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	//provate static permite 1 unica instancia para a aplicação inteira 
	
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//1 post tem VÁRIOS COMENTARIOS = logo temos que abrir a lista de nome Coments(indicado na UML)
	
	private List <Comment> comments = new ArrayList<>();//ATENÇÃO => Sempre que tiver uma COLEÇÃO criar o Add e o Remove comments.
	
	
	public Post() {
		
	}

	//1- Construtor com argumento (ATENÇÃO: LISTA NÃO COLOCA NO CONSTRUTOR.)
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	//2- Getters + Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	/* Atenção nesse setComments. Pq ele recebe uma Lista como argumento e modifica a lista 
	 * 
	public void setComments(List<Comment> comments) {
		this.comments = comments;
		
	}*/
	
	
	
	//ATENÇÃO => Sempre que tiver uma COLEÇÃO (Não fazer o metodo get e set do -comments) ....criar o Add e o Remove.
	public void addComment(Comment comment) {
	comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
		}
	
	//String Builder permite concatenar diversos textos utilizando a função .append (Evita a geração de memoria, pois é uma coisa só)
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
	

}
