package test;

import java.util.LinkedList;
import java.util.List;

import model.AttributeNode;
import model.Node;

import compare.ExhaustiveComparer;
import compare.Result;
import compare.weight.DefaultWeightProvider;

public class Test {

	public static void main(String[] args) {
		Node a1 = new AttributeNode("name1", "value1");
		Node a2 = new AttributeNode("name2", "value2");
		List<Node> caChildren = new LinkedList<Node>();
		caChildren.add(a1);
		caChildren.add(a2);
		Node b1 = new AttributeNode("name3", "value3");
		List<Node> cbChildren = new LinkedList<Node>();
		cbChildren.add(b1);
		
		Node characterA = new Node(caChildren);
		Node characterB = new Node(cbChildren);
		
		List<Node> strAChildren = new LinkedList<Node>();
		strAChildren.add(characterB);
		strAChildren.add(characterA);
		
		Node strA = new Node(strAChildren);
		
		Node a3 = new AttributeNode("name4", "value4");
		Node a4 = new AttributeNode("name5", "value5");
		List<Node> ca2Children = new LinkedList<Node>();
		ca2Children.add(a3);
		ca2Children.add(a4);
		Node b2 = new AttributeNode("name3", "value3");
		List<Node> cb2Children = new LinkedList<Node>();
		cb2Children.add(b2);
		
		Node characterA2 = new Node(ca2Children);
		Node characterB2 = new Node(cb2Children);
		
		List<Node> strBChildren = new LinkedList<Node>();
		strBChildren.add(characterA2);
		strBChildren.add(characterB2);
		
		Node strB = new Node(strBChildren);
		
		ExhaustiveComparer comparerer = new ExhaustiveComparer();
		Result result = comparerer.compare(strA, strB, new DefaultWeightProvider());
		System.out.println(result);
		
	}
	
}
