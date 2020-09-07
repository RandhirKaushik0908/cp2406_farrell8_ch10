public class Candle
{
    private String colour;
    private int height;
    protected double price;
    public String getColour()
    {
        return colour;
    }
    public int getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    public void setColour(String candleColour)
    {
        colour = candleColour;
    }
    public void setHeight(int candleHeight)
    {
        final double PRICE_PER_INCH = 2;
        height = candleHeight;
        price = height * PRICE_PER_INCH;
    }
}