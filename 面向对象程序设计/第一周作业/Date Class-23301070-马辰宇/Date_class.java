public class Date_class {
    private int year,day,month;
    private int[]md={31,0,31,30,31,30,31,31,30,31,30,31};

    public Date_class(int y,int m,int d){
        setData(y,m,d);
    }

    public void setData (int y, int m, int d)
    {
        if(m==2)
        {
            if(y<=0)
            {
                System.out.println("您的输入无效。\n");
            }
            else if((y%4!=0)||((y%100==0)&&(y%400!=0)))
            {
                if(d>28||d<1)
                {
                    System.out.println("您的输入无效。\n");
                }
                else
                {
                    year=y;
                    day=d;
                    month=m;
                }
            }
            else
            {
                if(d>29||d<1)
                {
                    System.out.println("您的输入无效。\n");
                }
                else
                {
                    year=y;
                    day=d;
                    month=m;
                }
            }
        }
        else if(m>12||m<1)
        {
            System.out.println("您的输入无效。\n");
        }
        else
        {
            if(d<1||d>md[m-1])
                System.out.println("您的输入无效。\n");
            else if(y<=0)
            {
                System.out.println("您的输入无效。\n");
            }
            else
            {
                year=y;
                day=d;
                month=m;
            }
        }
    }
    public void addOneDay ()
    {
        day+=1;
        if(month==2) {
            if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
                if (day > 28) {
                    day = 1;
                    month = 3;
                }
            } else {
                if (day > 29) {
                    day = 1;
                    month = 3;
                }
            }
        }
         else
        {
            if(day>md[month-1])
            {
                month+=1;
                day=1;
            }
        }
        if(month>12)
        {
          month=1;
          year+=1;
        }
    }

    public void display ()
    {
        System.out.println("日期为"+day+"/"+month+"/"+year+".\n");
    }
}