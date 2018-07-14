package hw_OOP.Lesson_2_Task_4_Library;

public class Book {
	private String name;
    private String author;
    private String publishing;
    private int yearEdition;
    private int amountPages;
    private int price;
    private String typeOfBinding;

    public Book(String author, String publishing, int yearEdition) {
        this.author = author;
        this.publishing = publishing;
        this.yearEdition = yearEdition;
    }
    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearEdition() {
        return yearEdition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearEdition=" + yearEdition +
                ", amountPages=" + amountPages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
