public class TestMyTriangle {
    public static void main(String[] args){
        double p;
        MyTriangle tri=new MyTriangle(0,0,2,0,1,1);
        MyPoint v1=new MyPoint(0,0);
        MyPoint v2=new MyPoint(3,0);
        MyPoint v3=new MyPoint(3,4);
        MyTriangle tri_1=new MyTriangle(v1,v2,v3);
        System.out.println(tri);
        p=tri_1.getPerimeter();
        System.out.println(p);
        tri_1.printType();
        tri.printType();
    }
}
