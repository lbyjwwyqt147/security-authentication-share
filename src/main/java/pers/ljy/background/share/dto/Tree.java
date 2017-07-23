package pers.ljy.background.share.dto;

import com.alibaba.fastjson.JSON;

public class Tree {


	 JsTree root = null;  
	  
    public Tree() {  
        root = new JsTree();  
    }  
  
    public static void main(String[] args) {  
        Tree tree = new Tree();  
        tree.root.setId("0");
        tree.root.setText("集团");
        JsTree nodeB = new JsTree();  
        nodeB.setId("1");
        nodeB.setText("总公司");
        JsTree nodeC = new JsTree();  
        nodeC.setId("4");
        nodeC.setText("分公司");
          
        nodeB.add(nodeC);  
        tree.root.add(nodeB);  
        System.out.println(JSON.toJSON(tree.root));  
    }  

}
