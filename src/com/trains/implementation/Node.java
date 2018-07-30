package com.trains.implementation;

import java.util.ArrayList;

// Node implementation

public class Node {

	private int distanceFromSource = Integer.MAX_VALUE;

	private boolean visited;

	private ArrayList<Edge> edges = new ArrayList<Edge>();

	// To represent result

	public int getDistanceFromSource() {
		return distanceFromSource;
	}

	public void setDistanceFromSource(int distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}

	// To check if node has been visited

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	// List of edges

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}

}
