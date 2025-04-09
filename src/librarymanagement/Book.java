package librarymanagement;

public class Book {
	private String title;
	private String subtitle;
	private static int totalBooks;

	public Book(String title) {
		this.title = title;
		this.subtitle = "";
		totalBooks++;
	}

	public Book(String title, String subtitle) {
		this.title = title;
		this.subtitle = subtitle;
		totalBooks++;
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void updateTitle(String title) {
		this.title = title;
	}

	public void updateSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public void displayInfo() {
		System.out.println("Title : " + title);
		if (!subtitle.isEmpty()) {
			System.out.println("Subtitle : " + subtitle);
		}
		System.out.println();
	}

	public static int getTotalBooks() {
		return totalBooks;
	}

}
