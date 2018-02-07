package Rmuti.Tree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class TreeApp {
	public static void main( String[] args )
    {
		Node i = new Node("i",null,null);
		Node h = new Node("h",null,null);
		Node f = new Node("f",null,null);
    	Node g = new Node("g",null,null);
    	Node e = new Node("e",h,i);
    	Node ff = new Node("f",null,null);
    	
    	Node c = new Node("c",g,f);
    	Node b = new Node("b",e,ff);
    	Node root = new Node("a",b,c);
    	TreeDraw drawTree = new TreeDraw(root);
    	drawTree.binaryTreeDraw();
    	
    }
}
