package test;

import io.Reader;

import java.io.File;

import model.Node;

import compare.ExhaustiveComparer;
import compare.Result;
import compare.weight.DefaultWeightProvider;

public class Test2 {

	public static void main(String[] args) throws Exception {
		System.out.println("begin");
		Reader reader = new Reader();
		Node a = reader.read(new File("208.xml"));
		Node b = reader.read(new File("208.xml"));
		
		
		ExhaustiveComparer comparerer = new ExhaustiveComparer();
		Result result = comparerer.compare(a, b, new DefaultWeightProvider());
		System.out.println(result);
		
	}

}
