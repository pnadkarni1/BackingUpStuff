//skeleton class code
public class MyRectangle {
    //declare instance variables here.

    private int width;
    private int height;
    private int startX;
    private int startY;


    public MyRectangle()
    {
        //default constructor -- initialize all instance variables
        //to 0

        width = 0;
        height = 0;
        startX = 0;
        startY = 0;

    }//end of default constructor

    public MyRectangle (int rStartX, int rStartY, int rWidth, int rHeight)
    {
        //initialize instance variables based on parameters shown.
        //be careful to get the order correct!

        startX = rStartX;
        startY = rStartY;
        width = rWidth;
        height = rHeight;

    }//end of constructor all fields

    public void xCord (int rStartX) {

        startX = rStartX;

    }

    public void yCord (int rStartY) {

        startY = rStartY;

    }

    public void width (int rWidth) {

        width = rWidth;

    }

    public void height (int rHeight) {

        height = rHeight;

    }


    public int area()
    {

        int rectangleArea = height * width;

        return rectangleArea;
        //return the area of this Rectangle
    }//end of area

    public boolean isInside(int x, int y)
    {

        int x1 = startX + width;
        int y1 = startY + height;

        if (x >= startX && x <= x1 && y >= startY && y <= y1) {

            return true;

        }else {

            return false;

        }

        //this is the trickiest of the methods to write.  This should
        //return true if point (x,y) is anywhere within the borders of the
        //current MyRectangle (including the borders themselves).  Use a
        //pencil and paper to figure out how this can be determined with
        //just a few simple relational operations.
    }//end of isInside

    public void setSize(int rWidth, int rHeight)
    {
        //update width and height as shown
        width = rWidth;
        height = rHeight;


    }//end of setSize

    public void setPosition(int x, int y)
    {
        //update startX and startY as shown
        startX = x;
        startY = y;

    }//end of setPosition

    public String toString()
    {
        //return the data about this rectangle in a user-friendly manner
        //remember that the user-friendly display should look like the following
        //Width: ZZ Height: ZZ X: ZZ Y: ZZ
        //the ZZ's should be the various numbers for this rectangle

        String data = "Width: " + width + " Height: " + height + " X: " + startX + " Y: " + startY;
        return data;

    }//end of toString

}//end of class
