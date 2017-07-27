package pers.ljy.background.share.component.tree;

import com.alibaba.fastjson.JSON;

public class Test2 {

	public static void main(String[] args) {
		AbstractTree tree,leaf1,leaf2,leaf3;
		tree = new Tree("0","root");
		
		leaf1 = new LeafTree("1","节点1","");
		
		leaf2 = new LeafTree("2","节点2","");
		
		
		leaf3 = new LeafTree("3","节点3","");
		
		tree.add(leaf1);
		leaf2.add(leaf3);
		tree.add(leaf2);
		//tree.add(leaf3);
		
		tree.operation();
		
		System.out.println(JSON.toJSON(tree));

	}

}
