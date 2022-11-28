package cn.knightzz.design;

/**
 * @author 王天赐
 * @title: JDNetMall
 * @projectName design-patterns
 * @description: 模拟京东爬取数据
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 20:54
 */
public class JDNetMall extends AbstractAnalyze {

    protected boolean login(String username, String password) {
        System.out.println("JD 登陆成功 ... ");
        return true;
    }

    protected String extract() {
        System.out.println("JD extract 成功 ... ");
        return "JD";
    }
}
