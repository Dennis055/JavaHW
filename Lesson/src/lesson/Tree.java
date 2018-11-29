package lesson;

import java.util.ArrayList;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Tree {
		ArrayList<Node>tree = new ArrayList<>();
		
		public void insert(Node node) {
			tree.add(node);
		}
		public void remove() {
			tree.remove(tree.size()-1);
		}
		public Node get(int place) {
			Node node = tree.get(place);
			return node;
		}
		
		
		
		public int getPlace(Node child) {
			return child.place;
		}
		public Node getParent(Node child) {
			  int current_place  = child.place;
			  Node parent = find(current_place/2);
			  return parent;
		}
		public Node find(int place) {
			return this.get(place);
		}
}
