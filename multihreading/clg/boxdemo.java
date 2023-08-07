class box {

    int width, height, depth;

    box() {
        width = height = depth;
    }

    box(int dim) {
        width = height = depth = dim;

    }

    box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    box(box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

}

class boxdemo {

    public static void main (String args []){

        Void check box()

        {
            if (width == 0  && height == 0 && depth == 0)
            {
                System.out.println(" box is emoty ");
            }

            else
            {
                if (width == height && height == depth)
                {
                    System.out.println(" box is cube ");

                }

                else
                {
                    System.out.println(" box is cubiod ");

                }
            }


        
        }


        class boxdemo{

            public static void main(String[] args) {
                
                box b1 = new box();
                box b2 = new box(5);
                box b3 = new box (7, 9 , 11);

                
            }
        }
            
        
    }
}
