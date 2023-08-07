// scanner class 



import java.util.Scanner;



class scannerxd 
{

    public static void main(String args[]) {

        try (Scanner person = new Scanner(System.in)) {
            System.out.println(" enter name ");

            String nm = person.nextLine();

            System.out.println(" enter age");

            int age = person.nextInt();

            System.out.println(" enter phone number");

            long number = person.nextLong();

            System.out.println(" enter cgpa ");

            Double cgpa = person.nextDouble();

            System.out.println("detilas are ");

            System.out.println(" name " + nm);

            System.out.println(" age" + age);

            System.out.println(" number " + number);

            System.out.println("cgpa " + cgpa);
        }

    }
}