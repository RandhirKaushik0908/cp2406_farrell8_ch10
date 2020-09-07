public class InsuredPackage extends Package
{
    InsuredPackage(int weight, char method)
    {
        super(weight, method);
        final double LOWCOST = 1.01, MEDCOST = 3.01;
        final double LOWINS = 2.45, MEDINS = 3.95, HIGHINS = 5.55;
        double insuranceCost;
        if(getCost() < LOWCOST)
            insuranceCost = LOWINS;
        else
        if(getCost() < MEDCOST)
            insuranceCost = MEDINS;
        else
            insuranceCost = HIGHINS;
        increaseCost(insuranceCost);
    }
}