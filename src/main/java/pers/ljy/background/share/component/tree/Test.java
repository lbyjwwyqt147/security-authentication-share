package pers.ljy.background.share.component.tree;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		
		AbstractTree rootTree,jsTree;
		rootTree = new Tree("0","root");
		jsTree = new JsTree();
		
		JsTree root = new JsTree();
		JsTree tree = new JsTree();
		tree.setId("0");
		tree.setText("root");
		JsTree tree1 = new JsTree();
		tree1.setId("1");
		tree1.setText("叶子节点1");
		JsTree tree2 = new JsTree();
		tree2.setId("2");
		tree2.setText("叶子节点2");
		
		//root.add(tree);

		tree.add(tree1);
		
		tree.add(tree2);
		
		rootTree.add(root);
		
		rootTree.operation();
		
		System.out.println(JSON.toJSON(tree));

	}

}
