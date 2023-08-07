class shape{
   

    void draw(){
        System.out.println("idk the shape");
    }


}

class square extends shape{

void draw()
{
    System.out.println(" its square");
}

}


class over{


    public static void main(String[] args) {
        

        shape r= new shape();

        r.draw();
    }
}