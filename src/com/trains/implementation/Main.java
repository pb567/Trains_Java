package com.trains.implementation;

public class Main {

	public static void main(String[] args) {
		Edge[] edges = { new Edge(0, 1, 5), new Edge(0, 3, 5), new Edge(0, 4, 7),
				new Edge(1, 2, 4), new Edge(2, 3, 8), new Edge(2, 4, 2), new Edge(3, 2, 8),
				new Edge(3, 4, 6), new Edge(4, 1, 3)

		};

		Graph g = new Graph(edges);
		g.calculateShortestDistance();
			

		g.printResult();
		

	}

}
