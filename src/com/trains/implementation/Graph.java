package com.trains.implementation;

import java.util.ArrayList;

//Implementing Graph object

public class Graph {

	private Node[] nodes;
	private int noOfNodes;
	private Edge[] edges;
	private int noOfEdges;

	public Graph(Edge[] edges) {
		this.edges = edges;

		this.noOfNodes = calculateNoOfNodes(edges);
		this.nodes = new Node[this.noOfNodes];

		for (int n = 0; n < this.noOfNodes; n++) {
			this.nodes[n] = new Node();
		}

		this.noOfEdges = edges.length;

		for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++) {
			this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
			this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().add(edges[edgeToAdd]);
		}

	}

	private int calculateNoOfNodes(Edge[] edges) {
		int noOfNodes = 0;

		for (Edge e : edges) {
			if (e.getToNodeIndex() > noOfNodes) {
				noOfNodes = e.getToNodeIndex();
			}
			if (e.getFromNodeIndex() > noOfNodes) {
				noOfNodes = e.getFromNodeIndex();
			}
		}
		noOfNodes++;

		return noOfNodes;
	}

	public void calculateShortestDistance() {
		// node 0 as source
		this.nodes[0].setDistanceFromSource(0);
	
		int nextNode = 0;

		// visit every node
		for (int i = 0; i < this.nodes.length; i++) {
			// loop around the edges of the current node
			ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();

			for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) {
				int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);

				if (!this.nodes[neighbourIndex].isVisited()) {
					int tentative = this.nodes[nextNode].getDistanceFromSource()
							+ currentNodeEdges.get(joinedEdge).getLength();

					if (tentative < nodes[neighbourIndex].getDistanceFromSource()) {
						nodes[neighbourIndex].setDistanceFromSource(tentative);
					}
				}
			}

			// all neighbours checked so node visited
			nodes[nextNode].setVisited(true);

			// next node must be with shortest distance
			nextNode = getNodeShortestDistance();

		}
	}

	private int getNodeShortestDistance() {
		int storedNodeIndex = 0;
		int storedDistance = Integer.MAX_VALUE;

		for (int i = 0; i < this.nodes.length; i++) {
			int currentDistance = this.nodes[i].getDistanceFromSource();

			if (!this.nodes[i].isVisited() && currentDistance < storedDistance) {
				storedDistance = currentDistance;
				storedNodeIndex = i;
			}
		}

		return storedNodeIndex;
	}

	// Display Result

	public void printResult() {
	/*	String output = "Number of Nodes = " + this.noOfNodes;
		output += "\nNumber of Edges = " + this.noOfEdges;

		for (int i = 0; i < this.nodes.length; i++) {
			output += "\n The shortest distance from Node 0 to " + i + " is " + nodes[i].getDistanceFromSource();
		}
*/
		System.out.println("The shortest distance from A to A is: " +nodes[0].getDistanceFromSource());
		System.out.println("The shortest distance from A to B is: " +nodes[1].getDistanceFromSource());
		System.out.println("The shortest distance from A to C is: " +nodes[2].getDistanceFromSource());
		System.out.println("The shortest distance from A to D is: " +nodes[3].getDistanceFromSource());
		System.out.println("The shortest distance from A to E is: " +nodes[4].getDistanceFromSource());
	}

	public Node[] getNodes() {
		return nodes;
	}

	public int getNoOfNodes() {
		return noOfNodes;
	}

	public Edge[] getEdges() {
		return edges;
	}

	public int getNoOfEdges() {
		return noOfEdges;
	}

}
