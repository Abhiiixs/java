abstract class User {
    abstract int pay();
    abstract int receive();
}
class GoldUser extends User
{
    int pay()   {  return 1;  }
    int receive()   {  return 2;  }
}
class SilverUser extends User
{
    int pay()   {  return 3;  }
    int receive()   {  return 4;  }
}

class abs{
    public static void main(String args[])
    {
        User b;
        b = new GoldUser();
        System.out.println("pay " + b.pay());

        System.out.println("Receive" + b.receive());

        b = new SilverUser();
        System.out.println("pay" + b.pay());

        System.out.println("Receive" + b.receive());
    }
}