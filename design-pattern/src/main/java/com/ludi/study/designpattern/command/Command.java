package com.ludi.study.designpattern.command;

/**
 * @author 陆迪
 * @date 2020/3/15 13:57
 * 命令角色
 */
public interface Command {

    void execute();
    void undo();
}
