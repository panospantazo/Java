class Book 
{
    private String title;
    private String author;
    
    public Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public Book()
    {
        this.title = "Empty";
        this.author = "Empty";
    }
    
    public String getter_title()
    {
        return title;
    }
    
    public String getter_author()
    {
        return author;
    }
    
    public void setter_title(String title)
    {
        this.title = title;
    }
    
    public void setter_author(String author)
    {
        this.author = author;
    }
}