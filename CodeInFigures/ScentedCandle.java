public class ScentedCandle extends Candle
{
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String candleScent)
    {
        scent = candleScent;
    }
    @Override
    public void setHeight(int candleHeight)
    {
        final double PRICE_PER_INCH = 3;
        super.setHeight(candleHeight);
        price = candleHeight * PRICE_PER_INCH;
    }
}