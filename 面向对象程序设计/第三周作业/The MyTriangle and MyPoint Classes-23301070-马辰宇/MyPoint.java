/**
 * author:@ Chenyu Ma
 * date:2024/3/11
 */
public class MyPoint {
    /**
     * coordinate
     */
    private int x,y;

    /**
     * set coordinate as (0,0)
     */
    public MyPoint(){
        x=0;
        y=0;
    }

    /**
     * set the coordinate
     * @param in_x:x
     * @param in_y:y
     */
    public MyPoint(int in_x,int in_y){
        x=in_x;
        y=in_y;
    }

    /**
     * get the number of x
     * @return x
     */
    public int getX(){
        return x;
    }

    /**
     * get the number of y
     * @return y
     */
    public int getY(){
        return y;
    }

    /**
     * change the x
     * @param in_x:x
     */
    public void setX(int in_x){
        x=in_x;
    }
    /**
     * change the y
     * @param in_y:y
     */
    public void setY(int in_y){
        y=in_y;
    }

    /**
     * change the x and y
     * @param in_x:x
     * @param in_y:y
     */
    public  void setXY(int in_x,int in_y)
    {
        x=in_x;
        y=in_y;
    }

    /**
     * format the output
     * @return the format
     */
    public String toString()
    {
        return "("+getX()+","+getY()+")";
    }

    /**
     * get the distance of the point with the input point
     * @param in_x:x
     * @param in_y:y
     * @return distance
     */
    public double distance(int in_x, int in_y)
    {
        double dis;
        dis=Math.pow((Math.pow((x-in_x),2)+Math.pow((y-in_y),2)),0.5);
        return dis;
    }

    /**
     * get the distance of the point with another point
     * @param another:another point
     * @return distance
     */
    public double distance(MyPoint another)
    {
        double dis;
        dis=Math.pow((Math.pow((x-another.x),2)+Math.pow((y-another.y),2)),0.5);
        return dis;
    }

    /**
     * get the distance of this point and (0,0)
     * @return distance
     */
    public double distance()
    {
        double dis;
        dis=Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);
        return dis;
    }
}
