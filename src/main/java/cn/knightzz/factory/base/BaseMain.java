package cn.knightzz.factory.base;

/**
 * @author 王天赐
 * @title: BaseMain
 * @projectName design_patterns
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/15 20:17
 */
public class BaseMain {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        String name = coffee.getName();
        System.out.println(name);
    }
}
