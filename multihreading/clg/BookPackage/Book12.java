package BookPackage;

 public class Book12{

    String title, author;

    int price;

    public Book12(String t, String a,  int p) 
    {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println(" title " + title);

        System.out.println(" author " + author);

        System.out.println(" price" + price);

    }

}

