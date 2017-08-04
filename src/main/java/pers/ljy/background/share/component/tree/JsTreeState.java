package pers.ljy.background.share.component.tree;

public class JsTreeState {

	//节点是否打开
	private boolean opened = false; 
	//几点是否禁用
	private boolean disabled = false;    
	//节点是否默认选择
	private boolean selected = false;
	
	public boolean isOpened() {
		return opened;
	}
	public void setOpened(boolean opened) {
		this.opened = opened;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}   
}
