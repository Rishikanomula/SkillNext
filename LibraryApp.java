import java.util.*;
class Book 
{
    private String title;
    private boolean isAvailable;
    public Book(String title) 
  {
        this.title = title;
        this.isAvailable = true;
    }
    public String getTitle() 
  {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) 
    {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } 
    else 
    {
            System.out.println(title + " is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

public class LibraryApp {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book nb) {
      for (Book eb : books) {
          if (eb.getTitle().equalsIgnoreCase(nb.getTitle().trim())) {
              System.out.println("Duplicate not allowed: " + nb.getTitle());
              return;
          }
      }
      books.add(nb);
      System.out.println(nb.getTitle() + " has been added to the library.");
  }
  
  public void borrowBook(String title) 
  {
        for (Book b : books) 
    {
            if (b.getTitle().equals(title) && b.isAvailable()) {
                b.borrowBook();
                return;
            }
        }
        System.out.println("Book not found or unavailable.");
    }

    public void returnBook(String title)
  {
        for (Book b : books) {
            if (b.getTitle().equals(title) && !b.isAvailable()) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }

    public void displayBooks() 
  {
        System.out.println("\n Books Tile \t\t Status:");
        for (Book b : books) 
    {
           
      System.out.printf("\n %20s",b.getTitle());
      System.out.printf("\t %b",b.isAvailable());
            
        }
    }
  static int menu()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Enter \n 1. Add \n 2. Display \n 3. borrow\n 4. return \n. 5. quit\n Enter choice: ");
    // add try and catch 
    // try{
    //   return sc.nextInt(); }
    // catch(Exception e){

    // }
    return sc.nextInt();
  }
    public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
        LibraryApp library = new LibraryApp();
    int ch;
    String tit="";
    while(true)
    {
      ch = menu();
      switch(ch)
      {
        case 1:
          System.out.print("How many books do you want to add? ");
          int count = sc.nextInt();
          sc.nextLine();
          for (int i = 0; i < count; i++) {
            System.out.print("Enter book title #" + (i + 1) + ": ");
            String title = sc.nextLine();
            Book book = new Book(title.trim());
            library.addBook(book);
          }
          break;

        case 2:
          library.displayBooks();
          break;
        case 3:
          System.out.println("enter title :");
          tit = sc.next();
          library.borrowBook(tit);
          break;
        case 4:
          System.out.println("enter title :");
          tit = sc.next();
          library.returnBook(tit);
          break;
        case 5:
          System.exit(0);
        default:
          System.out.println("invalid choice");
        
          
      }
    }
    }
}