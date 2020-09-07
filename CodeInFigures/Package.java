public class Package
{
    private int weight;
    private char method;
    private double cost;
    final char AIR = 'A', TRUCK = 'T';
    final int LOWWT = 9;
    final int MEDWT = 17;
    final double LOWAIR = 2.00, LOWTRUCK = 1.50, LOWMAIL = 0.50;
    final double MEDAIR = 3.00, MEDTRUCK = 2.35, MEDMAIL = 1.50;
    final double HIGHAIR = 4.50, HIGHTRUCK = 3.25, HIGHMAIL = 2.15;
    public Package(int packageWeight, char shippingMethod)
    {
        weight = packageWeight;
        method = shippingMethod;
        cost = calculateCost(packageWeight, shippingMethod);
    }

    private double calculateCost(int packageWeight, char shippingMethod)
    {
        double cost;
        if(packageWeight < LOWWT)
        {
            if(shippingMethod == AIR)
                cost = LOWAIR;
            else
            if(shippingMethod == TRUCK)
                cost = LOWTRUCK;
            else
                cost = LOWMAIL;
        }
        else
        if(packageWeight < MEDWT)
        {
            if(shippingMethod == AIR)
                cost = MEDAIR;
            else
            if(shippingMethod == TRUCK)
                cost = MEDTRUCK;
            else
                cost = MEDMAIL;
        }
        else
        {
            if(shippingMethod == AIR)
                cost = HIGHAIR;
            else
            if(shippingMethod == TRUCK)
                cost = HIGHTRUCK;
            else
                cost = HIGHMAIL;
        }
        return cost;
    }

    public void display()
    {
        System.out.println("The package weighs " + weight + " pounds. Shipping method: " + method + ". Cost $" + cost);
    }
    public double getCost()
    {
        return cost;
    }
    public void increaseCost(double c)
    {
        cost = cost + c;
    }
}