package com.august.weekone;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTravel {

	public static void main(String[] args) {
		Node node = new Node(1);
		constructTree(node);
		printTree(node);
//		printNAryTree(node);
	}

	private static void constructTree(Node node) {
		node.children.add(new Node(2));
		node.children.add(new Node(3));
		node.children.add(new Node(4));

		node.children.get(0).children.add(new Node(5));
		node.children.get(0).children.add(new Node(6));
		node.children.get(0).children.add(new Node(7));

		node.children.get(1).children.add(new Node(8));

		node.children.get(2).children.add(new Node(9));
		node.children.get(2).children.add(new Node(10));
		node.children.get(2).children.add(new Node(11));

	}

	private static void printTree(Node node) {
		if (node == null) {
			return;
		}
		// adding root of the Tree to the queue. and then keep iterating the Tree level
		// wise.
		Queue<Node> currentLine = new LinkedList<>();
		currentLine.offer(node);

		while (!currentLine.isEmpty()) {
			int currentSize = currentLine.size();
			for (int i = 0; i < currentSize; i++) {
				Node temp = currentLine.poll();
				assert temp != null;
				System.out.println(temp.val + " ");
				for (Node child : temp.children) {
					currentLine.offer(child);
				}
			}
			System.out.println();
		}
	}

}
