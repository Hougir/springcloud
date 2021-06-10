package com.sx.ideaQuicly;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/5/14 9:28
 */
public class Test {
    /**
     * Alt+1，快速打开或隐藏工程面板
     * Ctrl+Alt+left/right，返回至上次浏览的位置
     * Alt+Up/Down，在方法间快速移动定位
     * Ctrl+Shift+Up/Down，向上/下移动语句
     * Alt+F3，逐个往下查找相同文本，并高亮显示
     * Ctrl+Alt+L，格式化代码
     * Ctrl+E，最近的文件
     * Ctrl+Shift+E，最近更改的文件
     */
    @org.junit.Test
    public void t1() {
        Object o = new Object();

        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o) {

            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
