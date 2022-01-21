package com.yys.demo18_代理模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:13
 */
//代理者
public class WangPo implements Happy {
    JinLian jl;

    public WangPo(JinLian jl) {
        this.jl = jl;
    }

    @Override
    public void happy() {
        System.out.println("王婆以做头发的名义把金莲和西门庆约到房间...");
        jl.happy();
        System.out.println("王婆打扫卫生了....");
    }
}
