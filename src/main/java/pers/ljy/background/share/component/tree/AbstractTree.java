package pers.ljy.background.share.component.tree;

import pers.ljy.background.share.dto.JsTree;

/***
 * 抽象构建
 * @author ljy
 * 它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。在抽象构件中定义了访问及管理它的子构件的方法，如增加子构件、删除子构件、获取子构件等。
 *
 */
public abstract class AbstractTree {
	/**
	 * 添加成员
	 * @param tree
	 */
	public abstract void add(AbstractTree tree); 
	/**
	 * 删除成员
	 */
    public abstract void remove(AbstractTree tree);
    /**
     * 获取成员
     * @param i
     * @return
     */
    public abstract AbstractTree getChild(int i);     
    /**
     * 获取成员
     * @param tree
     * @return
     */
    public abstract AbstractTree getChild(AbstractTree tree); 
    /**
     * 具体业务方法
     */
    public abstract void operation();  

}
