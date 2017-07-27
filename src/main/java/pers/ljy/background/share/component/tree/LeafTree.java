package pers.ljy.background.share.component.tree;

public class LeafTree extends AbstractTree {

	/**
	 * 节点id
	 */
	private String id;

    /**
     * 节点名称
     */
    private String text;
    /**
     * 节点图标
     */
    private String icon;    
	
    public  LeafTree(String id,String text,String icon){
    	this.id = id;
    	this.text = text;
    	this.icon = icon;
    }
	
	@Override
	public void add(AbstractTree tree) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(AbstractTree tree) {
		// TODO Auto-generated method stub

	}

	@Override
	public AbstractTree getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub

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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	

}
