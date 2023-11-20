package Adapter;

public class EuroCurrencyAdapter implements CurrencyAdapter {
    private static final double EURO_EXCHANGE_RATE = 0.0020;

    @Override
    public double convertToCurrency(double price) {
        return price * EURO_EXCHANGE_RATE;
    }
}
