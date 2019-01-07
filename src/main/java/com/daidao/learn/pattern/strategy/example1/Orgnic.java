package com.daidao.learn.pattern.strategy.example1;

@PriceRegion(max = 10000)
public class Orgnic implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
