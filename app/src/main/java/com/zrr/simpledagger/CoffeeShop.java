package com.zrr.simpledagger;

import dagger.Component;

@Component(modules = DripCoffeeModule.class)
interface CoffeeShop {
    CoffeeMaker maker();
}