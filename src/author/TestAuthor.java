package author;

public class TestAuthor {

	public static void main(String[] args) {
		Author author = new Author("Alex","alex@gmail.com",'m');
		System.out.println(author);
		author.setEmail("alex@yahoo.com");
		System.out.println(author.toString());
	}

}
