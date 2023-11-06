//skeleton class code
public class MyRectangle {
    //declare instance variables here.
    private int width;
    private int height;
    private int startX;
    private int startY;
    //getters
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getStartX(){
        return startX;
    }
    public int getStartY(){
        return startY;
    }
    //setters
    public void setWidth(int sWidth){
        width = sWidth;
    }
    public void setHeight(int sHeight){
        height = sHeight;
    }
    public void setStartX(int sStartX){
        startX = sStartX;
    }
    public void setStartY(int sStartY){
        startY = sStartY;
    }
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
        width = rWidth;
        height = rHeight;
        startX = rStartX;
        startY = rStartY;
    }//end of constructor all fields
    public boolean setSize(int rWidth, int rHeight)
    {
        //update width and height as shown
        width = rWidth;
        height = rHeight;
        return true;

    }//end of setSize
    public int area()
    {
        //return the area of this Rectangle
        return width * height;
    }//end of area

    public boolean isInside(int x, int y)
    {
        //this is the trickiest of the methods to write.  This should
        //return true if point (x,y) is anywhere within the borders of the
        //current MyRectangle (including the borders themselves).  Use a
        //pencil and paper to figure out how this can be determined with
        //just a few simple relational operations.
        if (x >= startX && x <= startX + width && y >= startY && y <= startY + height){
            return true;
        }
        else{
            return false;
        }
    }//end of isInside



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
        return "Width: " + width + " Height: " + height + " X: " + startX + " Y: " + startY;
    }//end of toString
}

