package com.trains.implementation;

// Edges implementation

public class Edge {

	// Edge is linked to two nodes and has a length

	private int fromNodeIndex;

	private int toNodeIndex;

	private int length;

	public Edge(int fromNodeIndex, int toNodeIndex, int length) {
		this.fromNodeIndex = fromNodeIndex;
		this.toNodeIndex = toNodeIndex;
		this.length = length;
	}

	// Source node to which the edge is connected

	public int getFromNodeIndex() {
		return fromNodeIndex;
	}

	// Destination node to which the edge is connected

	public int getToNodeIndex() {
		return toNodeIndex;
	}

	// Weight of an each edge

	public int getLength() {
		return length;
	}

	// Neighbouring nodes of the current node

	public int getNeighbourIndex(int nodeIndex) {
		if (this.fromNodeIndex == nodeIndex) {
			return this.toNodeIndex;
		} else {
			return this.fromNodeIndex;
		}
	}
}
