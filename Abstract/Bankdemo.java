

abstract class Bank
{

    abstract int getROI();

    void  display(String S)
    {
        System.out.println(" branch name " + S);
    }

}



    class SBI extends Bank
    {
        int getROI()
        {
            return 7;
        }

      


    }

    




    class HDFC extends Bank
    {
        int getROI()
        {
            return 8;
        }

    }


class Bankdemo
{
    public static void main(String[] args)
    {


      { Bank b = new SBI();

        b.display("powai");

        System.out.println(" RAte of interest "+ b.getROI()+"%");

        b = new HDFC ();

        b.display("dadar");

        System.out.println(" rate of intrest " + b.getROI()+ " %");

      }
    }


}