public class Test_date_class {
    public static void main(String[] args)
    {
        Date_class date=new Date_class(1970,1,1);
        date.setData(2024,4,3);
        date.addOneDay();
        date.display();

        date.setData(2200,2,29);

        date.setData(2024,3,31);
        date.addOneDay();
        date.display();

        date.setData(2024,12,31);
        date.addOneDay();
        date.display();
    }


}
