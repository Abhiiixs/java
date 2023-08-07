import java.io.*;

class readfile{

   
    public static void main(String args[])
    {
        int i ;

        if(args.length != 1 )
        {
            System.out.println(" file is not specifed ");

            return;
        }

        else{

            try{

                FileInputStream fin = new FileInputStream(args[0]);

                do{
                    i = fin.read();
                    
                    if(i !=-1 )
                    
                    System.out.println((char)i);

                    
            
                }while(i != -1);

                fin.close();
            }




            catch (FileNotFoundException e)
            {

                System.out.println(" specific file does not exists");
                return;
            }

            catch (IOException e) {

                System.out.println(" file read error");
                return;
                
            }

            
        }
    }
}

   

