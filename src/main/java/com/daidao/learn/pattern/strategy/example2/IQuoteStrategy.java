package com.daidao.learn.pattern.strategy.example2;

import java.math.BigDecimal;

/**
 * 报价策略接口
 * */
public interface IQuoteStrategy {
    //获取折后价的价格
    BigDecimal getPrice(BigDecimal originalPrice);
}
