public class Book2
{
    String name = "abc";
    public void showName(String name) 
    {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        Book2 book = new Book2();
        book.showName("123");
    }
}
