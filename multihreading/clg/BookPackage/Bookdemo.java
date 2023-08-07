import  BookPackage.Book12;

class Bookdemo{


 
  public static void main(String args[])
  {

     Book12 bk[] = new Book12[3];

      bk[0] = new Book12(" do epic shit ", " akur wariko ", 500);

      bk[1] = new Book12(" cant hurt me ", " david gogins ", 450);

      bk[2] = new Book12(" the almanck of naval ravikant", " navl ravikant", 600);


    for (int i = 0; i < 3; i++)
      {
	      bk[i].display();
      }
  }
}