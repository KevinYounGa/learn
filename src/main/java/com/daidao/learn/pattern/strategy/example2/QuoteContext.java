package com.daidao.learn.pattern.strategy.example2;

import java.math.BigDecimal;

public class QuoteContext {
    private IQuoteStrategy iQuoteStrategy;
    public QuoteContext(IQuoteStrategy iQuoteStrategy){
        this.iQuoteStrategy = iQuoteStrategy;
    }

    public BigDecimal getPrice(BigDecimal originalPrice){
        return iQuoteStrategy.getPrice(originalPrice);
    }
}
