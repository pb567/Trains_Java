TRAINS
==========

The local commuter railroad services a number of cities in Taiwan. Because of the
mountainous local geography, all of the tracks are 'one-way.' That is, a route from Kaoshiung to Taipei
does not imply the existence of a route from Taipei to Kaoshiung. In fact, even if both of these routes
do happen to exist, they are distinct and are not necessarily the same distance as the tracks may have
to go over different terrain!

The purpose of this problem is to help the railroad provide its customers with information about the
routes. In particular, you will compute the distance along a certain route, the number of different
routes between two towns, and the shortest route between two cities.

Input: A directed graph (see Test Input below) where a node represents a city and an edge represents
a route between two cities. The weighting of the edge represents the distance between the two
cities. A given route will never appear more than once, and for a given route, the starting and ending
city will not be the same city.

1. Calculate the length of the shortest route (in terms of distance to travel) from A to A.
2. Calculate the length of the shortest route (in terms of distance to travel) from A to B.
3. Calculate the length of the shortest route (in terms of distance to travel) from A to C.
4. Calculate the length of the shortest route (in terms of distance to travel) from A to D.
5. Calculate the length of the shortest route (in terms of distance to travel) from A to E.

**Test Input:**

For the test input, the towns are named using the first few letters of the
alphabet from A to E. A route between two towns (A to B) with a distance
of 5 is represented as <A,B,5>.

Graph:

<A,B,5>

<B,C,4>

<C,D,8>

<D,C,8>

<D,E,6>

<A,D,5>

<C,E,2>

<E,B,3>

<A,E,7>

<br>

**Expected Output:**

Output #1: 0

Output #2: 5

Output #3: 9

Output #4: 5

Output #5: 7

