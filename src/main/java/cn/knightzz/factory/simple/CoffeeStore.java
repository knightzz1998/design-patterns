package cn.knightzz.factory.simple;

/**
 * @author 王天赐
 * @title: CoffeeStore
 * @projectName design_patterns
 * @description: 咖啡店类
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/15 19:47
 */
public class CoffeeStore {

    /**
     * 售卖咖啡
     * @param coffeeType : 需要的咖啡类型
     * @return
     */
    public Coffee orderCoffee(String coffeeType){

        Coffee coffee = null;
        // 判断需要的咖啡类型
        if ("american".equals(coffeeType)) {
            coffee = new AmericanCoffee();
        }else if ("latte".equals(coffeeType)) {
            coffee = new LatteCoffee();
        }

        // 添加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
