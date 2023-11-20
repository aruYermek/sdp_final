package Adapter;

public class DollarCurrencyAdapter implements CurrencyAdapter {
    private static final double DOLLAR_EXCHANGE_RATE = 0.0022;

    @Override
    public double convertToCurrency(double price) {
        return price * DOLLAR_EXCHANGE_RATE;
    }
}

