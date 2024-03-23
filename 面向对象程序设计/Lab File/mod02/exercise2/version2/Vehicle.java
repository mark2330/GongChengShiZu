public class Vehicle {
    private double load,maxLoad;
    public Vehicle(double m)
    {
        maxLoad=m;
    }
    public double getLoad()
    {
        return load;
    }
    public double getMaxLoad()
    {
        return maxLoad;
    }
    public boolean addBox(double box)
    {
        if((box+load)>maxLoad)
        {
            return false;
        }
        else {
            load += box;
            return true;
        }
    }
}
