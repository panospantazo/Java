import java.util.Scanner;


public class Library_project 
{

    public static void main(String[] args) 
    {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the library's menu");
        System.out.println("-----------------------------");
        
        while(true)
        {
            int ch;
            
            System.out.println("Press 1: Add a book to the library.");
            System.out.println("Press 2: Display all the books of the library.");
            System.out.println("Press 3: Exit\n");
            
            System.out.print("Select your choice: ");
            ch = scanner.nextInt();

            switch(ch)
            {
                case 1:
                Book book = new Book();
                book = create_book();
                library.addBook(book);
                break;
                
                case 2:    
                library.displayBooks();
                break;
                
                case 3:
                System.out.println("Thank you for your cooperation!");
                System.exit(0);
                
                default:
                    System.out.println("Invalid choice.Select again!");
            }
        }
    }
    
    public static Book create_book()
    {
        Scanner scanner = new Scanner(System.in);
        Book x = new Book();
        String title,author;
        
       
        System.out.println("Give me the title of the book: ");
        title = scanner.nextLine();
        
        System.out.println("Give me the author of the book: ");
        author = scanner.nextLine();
        
        x.setter_author(author);
        x.setter_title(title);
        
        return x;
        
    }  
}
