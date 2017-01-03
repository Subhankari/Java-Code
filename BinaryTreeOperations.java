package com.java.practice;
import java.util.*;
import java.util.LinkedList;

public class BinaryTreeOperations {

	public BinaryTreeOperations() {
		// TODO Auto-generated constructor stub
	}
	//find max element in BinaryTree
	public int MaxInBinaryTree(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		if(root != null){
			int leftmax = MaxInBinaryTree(root.left);
			int rightmax = MaxInBinaryTree(root.right);
			if(leftmax > rightmax){
				maxValue = leftmax;
			}else{
				maxValue = rightmax;
			}
			if(root.data > maxValue){
				maxValue = root.data;
			}
		}
		return maxValue;
	}
	//find max element in BinaryTree Non recursive
	public int MaxInBinaryTreeNR(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(maxValue < tmp.data){
				maxValue = tmp.data;
			}
			if(tmp.left != null){
				q.offer(tmp.left);
			}
			if(tmp.right != null){
				q.offer(tmp.right);
			}
		}
		return maxValue;
	}
	
	//algorithm for searching an element in binary tree
	public boolean SearchInBTR(BinaryTreeNode root, int data){
		boolean found = false;
		while(root != null){
			if(root.data == data){
				return true;
			}else{
				if(root.left != null){
					 found = SearchInBTR(root.left,data);
				}
				if(root.right != null){
					found = SearchInBTR(root.right,data);
				}
			}
		}
		return found;
	}
	
	
	public boolean SearchInBTNR(BinaryTreeNode root, int data){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp.data == data){
				return true;
			}else{
				if(tmp.left != null){
					q.offer(tmp.left);
				}
				if(tmp.right != null){
					q.offer(tmp.right);
				}
			}
		}
		return false;
	}
	
	//insert an element in BT
	public BinaryTreeNode InsertElementNR(BinaryTreeNode root, int data){
		if(root == null){
			root = new BinaryTreeNode(data);
		}else{
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			q.offer(root);
			boolean found = false;
			while(!found){
				BinaryTreeNode tmp = q.poll();
				if(tmp.left != null){
					q.offer(tmp.left);
				}else{
					found = true;
					BinaryTreeNode newnode = new BinaryTreeNode(data);
					tmp.setLeft(newnode);
				}
				if(!found){
					if(tmp.right != null){
						q.offer(tmp.right);
					}else{
						found = true;
						BinaryTreeNode newnode = new BinaryTreeNode(data);
						tmp.setRight(newnode);
					}
				}
			}
		}	
		return root;
	}
	//-----------------------incomplete--------------------------
	public BinaryTreeNode InsertElementR(BinaryTreeNode root, int data){
		boolean done = false;
		while(!done){
			
		}
		if(root == null){
			root = new BinaryTreeNode(data);
		}else{
			while(root != null){
				
			}
		}
		
		return root;
	}
	//---------------------------------------------------------------
	
	//find size of Binary tree
	public int SizeR(BinaryTreeNode root){
		int leftcount = root.left == null ? 0: SizeR(root.left);
		int rightcount = root.right == null ? 0: SizeR(root.right);
		return 1 + leftcount+ rightcount;
	}
	
	public int SizeNR(BinaryTreeNode root){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count = 0;
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp != null){
				count++;			
			}
			if(tmp.left != null){
				q.offer(tmp.left);
			}
			if(tmp.right != null){
				q.offer(tmp.right);
			}
		}
		return count;
	}
	
	// print level order traversal in reverse
	public void ReverseLevelOrder(BinaryTreeNode root){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp != null){
				s.push(tmp);
				if(tmp.left != null){
					q.offer(tmp.left);
				}
				if(tmp.right != null){
					q.offer(tmp.right);
				}
			}
		}
		while(!s.isEmpty()){
			System.out.println(s.pop().getData());
		}		
	}
	
	//maxdepth of BT
	public int maxDepthBTR(BinaryTreeNode root){
		if(root == null){
			return 0;
		}
		int leftDepth = maxDepthBTR(root.left);
		int rightDepth = maxDepthBTR(root.right);
		return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
	}
	
	//pending problem 11 - 15;
	
	
	
	
}
