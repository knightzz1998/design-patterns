package cn.knightzz.desgin.test;

import cn.knightzz.design.JDNetMall;
import cn.knightzz.design.NetMall;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: ApiTest
 * @projectName design-patterns
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 20:46
 */
public class ApiTest {

    @Test
    public void test_TemplateDesign() {

        NetMall netMall = new JDNetMall();

        netMall.generator("root", "123456");

    }
}
