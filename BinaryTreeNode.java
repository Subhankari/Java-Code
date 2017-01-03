package com.java.practice;

public class BinaryTreeNode {
	public int data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;

	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
	}
	public BinaryTreeNode(int d){
		data = d;
		left = null;
		right = null;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int d){
		data = d;
	}
	public BinaryTreeNode getLeft(){
		return this.left;
	}
	public void setLeft(BinaryTreeNode l){
		left = l;
	}
	public BinaryTreeNode getRight(){
		return this.right;
	}
	public void setRight(BinaryTreeNode r){
		right = r;
	}
}
