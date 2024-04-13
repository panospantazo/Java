import java.util.ArrayList;

public class Library 
{
    ArrayList<Book> Library;
    
    public Library()
    {
        this.Library = new ArrayList<>();
    }
    
    public void addBook(Book book)
    {
        Library.add(book);
    }
    
    public void displayBooks() 
    {
        if(Library.isEmpty())
        {
            System.out.println("The Library is empty");
        }
        else
        {
            int i;

            for (i = 0; i < Library.size(); i++) 
            {
                System.out.println(i+1+"st Book");
                System.out.println("---------");
                System.out.println("The title of the book is: " + Library.get(i).getter_title());
                System.out.println("The author of the book is: " + Library.get(i).getter_author());
                System.out.println("\n");
            }
        }
    }
}

