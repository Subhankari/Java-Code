package com.java.practice;
import java.util.*;
import java.util.LinkedList;

public class BinaryTreeTraversal {
	public BinaryTreeTraversal() {
		// TODO Auto-generated constructor stub
	}
	//DLR
	public void PreOrderR(BinaryTreeNode root){
		while(root != null){
			System.out.println(root.data);
			PreOrderR(root.left);
			PreOrderR(root.right);
		}
	}
	//LDR
	public void InOrderR(BinaryTreeNode root){
		while(root!= null){
			InOrderR(root.left);
			System.out.println(root.data);
			InOrderR(root.right);
		}
	}
	//LRD
	public void PostOrderR(BinaryTreeNode root){
		while(root != null){
			PostOrderR(root.left);
			PostOrderR(root.right);
			System.out.println(root.data);
		}
	}
	public List<Integer> PreOrderNR(BinaryTreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode tmp = s.pop();
			res.add(tmp.data);
			if(tmp.right != null){
				s.push(tmp.right);
			}
			if(tmp.left != null){
				s.push(tmp.left);
			}
		}
		return res;
	}
	public List<Integer> InOrderNR(BinaryTreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode curr = root;
		boolean done = false;
		while(!done){
			if(curr != null){
				s.push(curr);
				curr = curr.left;
			}else{
				if(s.isEmpty()){
					done = true;
				}else{
					BinaryTreeNode tmp = s.pop();
					res.add(tmp.data);
					curr = curr.right;
				}
			}
		}
		return res;
	}
	public List<Integer> PostOrderNR(BinaryTreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode prev = null;
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode curr = s.peek();
			if(prev == null || prev.left == curr || prev.right == curr){
				if(curr.left != null){
					s.push(curr.left);
				}
				else if(curr.right != null){
					s.push(curr.right);
				}
			}else if(curr.left == prev){
				if(curr.right != null){
					s.push(curr.right);
				}
			}else{
				res.add(curr.data);
				s.pop();
			}
			prev = curr;
		}
		return res;
	}
	public List<Integer> LevelOrder(BinaryTreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp != null){
				res.add(tmp.data);
				if(tmp.left != null){
					q.offer(tmp.left);
				}
				if(tmp.right != null){
					q.offer(tmp.right);
				}
			}
		}
		return res;
	}

}
