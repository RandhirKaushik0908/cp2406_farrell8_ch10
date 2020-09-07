public class DemoCandles
{
    public static void main(String[] args)
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColour("red");
        aCandle.setHeight(7);
        aScentedCandle.setColour("white");
        aScentedCandle.setScent("Jasmine");
        aScentedCandle.setHeight(7);
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColour() + " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " + aScentedCandle.getScent() + " " +
                aScentedCandle.getColour() + " candle costs $" + aScentedCandle.getPrice());
    }
}