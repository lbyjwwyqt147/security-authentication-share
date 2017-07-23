package pers.ljy.background.share.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.terracotta.runnel.decoding.Enm;

import scala.annotation.elidable;

/***
 * jsTree 树结果
 * @author ljy
 *
 */
public class JsTree implements Serializable{

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
    private String parent;
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
    private Vector<JsTree> children = new Vector<>();
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
     * @author ljy
     *
     */
    class state{
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
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

	/*public List<JsTree> getChildren() {
		return children;
	}

	public void setChildren(List<JsTree> children) {
		this.children = children;
	}
*/
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
	
	/**
	 * 添加孩子节点
	 * @param tree
	 */
	public void add(JsTree tree){
		this.children.add(tree);
	}
    
	/**
	 * 移除节点
	 * @param tree
	 */
	public void remove(JsTree tree){
		this.children.remove(tree);
	}
	
	public Enumeration<JsTree> getChildren(){
		return children.elements();
	}
    

}
