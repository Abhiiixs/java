

import java.lang.Thread;

class Thread_demo{

    public static void main(String[] args) {
        

        try{

            Thread t = Thread.currentThread();     // name / priority / group

        System.out.println(" current thread = " + t);

        
        t.setName(" new thread");

        System.out.println(" after  name changed thread = "+ t);


        for(int i = 0 ; i<=4 ;i++)
        {

            
            System.out.println(i);
            Thread.sleep(2000);
        }

    }
        
    catch(Exception e )
    {
        System.out.println(e.getMessage());
    }

    }
}