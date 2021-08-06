package com.august.weekone;

import java.util.LinkedList;
import java.util.List;

public class Node {
	public int val;
	public List<Node> children = new LinkedList<>();

	public Node(int val) {
		this.val = val;
	}

	public Node(int val, List<Node> children) {
		this.val = val;
		this.children = children;
	}
}
