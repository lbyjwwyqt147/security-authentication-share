package pers.ljy.background.share.component.tree;

import java.io.Serializable;
import java.util.Vector;



/***
 * jsTree 树结构容器
 * @author ljy
 *
 */
public class JsTree extends AbstractTree implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 节点id
	 */
	private String id;
	/**
	 * 父级
	 */
  //  private String parent;
    /**
     * 节点名称
     */
    private String text;
    /**
     * 节点图标
     */
    private String icon;    
    /**
     * 孩子节点
     */
    private Vector<AbstractTree> children = new Vector<>();
    /**
     * 其他属性
     */
    private Object li_attr; 
    /**
     * 其他属性
     */
    private Object a_attr;   
    
    /**
     * 状态
     */
    private JsTreeState state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
*/
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Object getLi_attr() {
		return li_attr;
	}

	public void setLi_attr(Object li_attr) {
		this.li_attr = li_attr;
	}

	public Object getA_attr() {
		return a_attr;
	}

	public void setA_attr(Object a_attr) {
		this.a_attr = a_attr;
	}



	@Override
	public void add(AbstractTree tree) {
		children.add(tree);
		
	}

	@Override
	public void remove(AbstractTree tree) {
		children.remove(tree);
		
	}

	@Override
	public AbstractTree getChild(int i) {
		return children.get(i);
	}


	@Override
	public void operation() {
		 //容器构件具体业务方法的实现
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

	public JsTreeState getState() {
		return state;
	}

	public void setState(JsTreeState state) {
		this.state = state;
	}

	
}
