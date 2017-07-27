package pers.ljy.background.share.component.tree;

import java.util.Vector;

public class Tree extends AbstractTree {
	
	/**
	 * 节点id
	 */
	private String id;

    /**
     * 节点名称
     */
    private String text;
    
    public Tree(String id,String text){
    	this.id = id;
    	this.text =text;
    }
	
	private Vector<AbstractTree> children = new Vector<>();

	@Override
	public void add(AbstractTree tree) {
		this.children.add(tree);
		
	}

	@Override
	public void remove(AbstractTree tree) {
		this.children.remove(tree);
		
	}

	@Override
	public AbstractTree getChild(int i) {
		return this.children.get(i);
	}

	@Override
	public void operation() {
		//递归调用成员构件的业务方法
        for(Object obj:children) {
            ((AbstractTree)obj).operation();
        }
	}

	public Vector<AbstractTree> getChildren() {
		return children;
	}

	public void setChildren(Vector<AbstractTree> children) {
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
