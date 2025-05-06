
 class LibraryItem {
    protected String title;
    protected String author;
    protected int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}


class Book extends LibraryItem {
    protected String ISBN;
    protected int numberOfPages;

    public Book(String title, String author, int year, String ISBN, int pages) {
        super(title, author, year);
        this.ISBN = ISBN;
        this.numberOfPages = pages;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}


class Magazine extends LibraryItem {
    protected int issueNumber;
    protected String month;
    protected String editor;

    public Magazine(String title, String author, int year, int issueNumber, String month, String editor) {
        super(title, author, year);
        this.issueNumber = issueNumber;
        this.month = month;
        this.editor = editor;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("Editor: " + editor);
    }
}


class ReferenceBook extends Book {
    protected String fieldOfStudy;
    protected boolean isLendable;

    public ReferenceBook(String title, String author, int year, String ISBN, int pages, String fieldOfStudy, boolean isLendable) {
        super(title, author, year, ISBN, pages);
        this.fieldOfStudy = fieldOfStudy;
        this.isLendable = isLendable;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("Is Lendable: " + (isLendable));
    }
}


class Main {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("Java Programming", "Bill Gates", 2020, "123-456-789", 350);
        LibraryItem item2 = new Magazine("Mein Kampf", "Adolf Hitler", 2023, 45, "March", "German");
        LibraryItem item3 = new ReferenceBook("Medical Encyclopedia", "Dr. Salman", 2018, "987-654-321", 1200, "Medicine", false);

        System.out.println(" :Book Info ");
        item1.displayInfo();

        System.out.println(" :Magazine Info");
        item2.displayInfo();

        System.out.println(" :Reference Book Info ");
        item3.displayInfo();
    }
}
