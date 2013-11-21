package compare;

import java.util.Map;

import model.Node;

import compare.weight.IWeightProvider;

public interface IComparable<T extends Node> {

	public double compare(T b, IWeightProvider weightProvider);
	
	public double compare(T b, IWeightProvider weightProvider, Map<Node, Node> predefinedPairs);
	
}
