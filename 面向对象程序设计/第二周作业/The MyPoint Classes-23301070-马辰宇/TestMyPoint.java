public class TestMyPoint {
    public static void main(String[] args)
    {
        double dis;
        MyPoint myPoint=new MyPoint();
        System.out.println(myPoint.getX());
        MyPoint myPoint_1=new MyPoint(1,1);
        System.out.println(myPoint_1.getY());
        myPoint.setX(2);
        myPoint.setY(3);
        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());
        myPoint.setXY(3,4);
        dis=myPoint.distance();
        System.out.println(dis);
        myPoint_1.setXY(4,4);
        dis=myPoint.distance(myPoint_1);
        System.out.println(dis);
        dis=myPoint.distance(8,16);
        System.out.println(dis);
    }

}
