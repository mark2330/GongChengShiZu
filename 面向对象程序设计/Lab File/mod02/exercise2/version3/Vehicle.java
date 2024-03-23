public class Vehicle {
    private double load,maxLoad;
    public Vehicle(double m)
    {
        maxLoad=m;
    }
    public double getLoad()
    {
        double new_load=kiloToNewts(load);
        return newtsToKilo(new_load);
    }
    public double getMaxLoad()
    {
        double new_max=kiloToNewts(maxLoad);
        return newtsToKilo(new_max);
    }
    public boolean addBox(double box)
    {
        double new_load=kiloToNewts(load);
        double new_max=kiloToNewts(maxLoad);
        double new_box=kiloToNewts(box);
        if((box+load)>maxLoad)
        {
            return false;
        }
        else {
            new_load+=new_box;
            load=newtsToKilo(new_load);
            return true;
        }
    }

    private double kiloToNewts(double weight) {
        return (weight * 9.8);
    }
    private double newtsToKilo(double weight) {
        return (weight / 9.8);
    }

}
