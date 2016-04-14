package project10;

public class Movie {
	
	private String title;
	private String category;
	public Movie (String movieTitle,String movieGenre){
	  title = movieTitle;
	category = movieGenre;
	}
	
public void printTitle(){
System.out.println(getTitle());
}

public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
