package cn.knightzz.design;

/**
 * @author 王天赐
 * @title: NetMall
 * @projectName design-patterns
 * @description: 抽象类
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 20:47
 */
public abstract class NetMall {

    /**
     * 定义生成的模板方法
     *
     * @param username
     * @param password
     * @return
     */
    public String generator(String username, String password) {

        if (!login(username, password)) {
            return null;
        }

        // 登陆成功抽取数据
        String msg = extract();

        // 分析数据
        return analyze(msg);
    }

    protected abstract boolean login(String username, String password);

    protected abstract String extract();

    protected abstract String analyze(String msg);
}
