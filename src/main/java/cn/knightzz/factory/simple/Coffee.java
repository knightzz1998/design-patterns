package cn.knightzz.factory.simple;

/**
 * @author 王天赐
 * @title: Coffee
 * @projectName design_patterns
 * @description: 咖啡类
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/15 19:47
 */
public class Coffee {

    /**
     * 获取coffee名称
     * @return
     */
    public String getName(){
        return "Coffee";
    }

    public void addMilk(){
        System.out.println("加牛奶...");
    }

    public void addSugar(){
        System.out.println("加糖...");
    }
}
