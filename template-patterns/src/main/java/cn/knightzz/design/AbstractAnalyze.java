package cn.knightzz.design;

/**
 * @author 王天赐
 * @title: AbstractAnalyze
 * @projectName design-patterns
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 20:57
 */
public abstract class AbstractAnalyze extends NetMall {
    @Override
    protected String analyze(String msg) {
        System.out.println(msg + " analyze 成功 ... ");
        return "analyze";
    }
}
