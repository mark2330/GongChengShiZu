public class MyTriangle {
    private MyPoint v1,v2,v3;
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v_1,MyPoint v_2,MyPoint v_3){
        v1=v_1;
        v2=v_2;
        v3=v_3;
    }
    public String toString(){
        return "MyTriangle[v1=("+v1.getX()+","+v1.getY()+"),v2=("+v2.getX()+","+v2.getY()+"),v3=("+v3.getX()+","+v3.getY()+")]";
    }
    public double getPerimeter(){
        double p;
        p=v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
        return p;
    }
    public void printType() {
        int same = 0;
        if (v1.distance(v2) == v2.distance(v3)) {
            same++;
        }
        if (v1.distance(v2) == v3.distance(v1)) {
            same++;
        }
        if (v2.distance(v3) == v3.distance(v1)) {
            same++;
        }
        switch (same) {
            case 3:
            {
                System.out.println("equilateral");
                break;
            }
            case 1:
            {
                System.out.println("isosceles");
                break;
            }
            default:
            {
                System.out.println("scalene");
                break;
            }
        }
    }
}