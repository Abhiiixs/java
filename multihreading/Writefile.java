import java.io.*;

class Writefile {

    public static void main(String args[]) {

        String S = "pci bus is provide us data to computer bus ABD == SYTRM" ;

        try {

            FileOutputStream fout = new FileOutputStream("newfile.txt", true);

            char ch[] = S.toCharArray(); // crete array over here

            for (int i = 0; i <ch.length; i++) {
                fout.write(ch[i]);
            }

            fout.close();
            System.out.println(" data write to file ");

        }

        catch (Exception e) {
            System.out.println(e.getMessage());

            return;
        }

    }

}