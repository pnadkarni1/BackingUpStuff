public class MySquare extends MyRectangle {
    public MySquare () {

    }

    public MySquare (int x, int y, int size) {

        super(x, y, size, size);

    }

    @Override
    public boolean setSize(int w, int h) {

        if (w == h) {

            setWidth(w);
            setHeight(h);


            return true;

        }else {

//            System.out.println(h +"=" +w);

            return false;


        }

    }

    public void setSide (int side) {

        setWidth(side);
        setHeight(side);

    }


    public String toString () {

        return "Side: " + getWidth() + " X: " + getStartX() + " Y: " + getStartY();

    }

}
