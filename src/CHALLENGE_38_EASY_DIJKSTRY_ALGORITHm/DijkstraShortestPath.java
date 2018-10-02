/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_38_EASY_DIJKSTRY_ALGORITHm;

/**
* Implementacja algorytmu Dijkstry do znajdowania najkrotszych sciezek w grafie
* z krawedzami o nieujemnych wagach.
*
* created by mephisto
* www.algorytm.org
*/
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
 
/**
* Krawedz grafu skierowanego. Zawiera informacje od ktorej do ktorej krawedzi
* jest poprowadzona krawedz oraz zawiera jej wage(np. dlugosc, czas itd).
*
* @author mephisto
*/
class DirectedEdge {
// wierzcholek zrodlowy
private final int from;
// wierzcholek docelowy
private final int to;
// waga
private final long weight;
 
public DirectedEdge(int from, int to, int weight) {
this.from = from;
this.to = to;
this.weight = weight;
}
 
public int from() {
return from;
}
 
public int to() {
return to;
}
 
public long getWeight() {
return weight;
}
 
@Override
public String toString() {
return String.format("%d->%d (%d) ", from, to, weight);
}
}
 
/**
* Graf skierowany reprezentowany za pomoca list sasiedztwa danych wierzcholkow
* skierowanych.
*
* @author mephisto
*/
class DirectedGraph {
// liczba wierzcholkow
private final int v;
// liczba krawedzi
private int e;
// listy sasiedztwa
private List<DirectedEdge>[] neighborhoodLists;
 
@SuppressWarnings("unchecked")
public DirectedGraph(int v) {
this.v = v;
this.e = 0;
this.neighborhoodLists = (List<DirectedEdge>[]) new List[v];
for (int i = 0; i < v; i++) {
neighborhoodLists[i] = new ArrayList<DirectedEdge>();
}
}
 
public int getNumberOfEdges() {
return e;
}
 
public int getNumberOfVertices() {
return v;
}
 
/**
* Dodaje krawedz skierowana do odpowiedniej listy sasiedztwa, listy
* wierzcholka, z ktorej zaczyna sie krawedz.
*
* @param edge
*            krawedz, ktora ma zostac dodana do grafu
*/
public void addEdge(DirectedEdge edge) {
neighborhoodLists[edge.from()].add(edge);
e++;
}
 
/**
* Zwraca liste sasiedztwa danego wierzcholka.
*
* @param v
*            indeks wierzcholka skierowanego
* @return zwraca iterowalna kolekcje krawedzi skierowanych
*/
public Iterable<DirectedEdge> getNeighborhoodList(int v) {
return neighborhoodLists[v];
}
}
 
/**
* ShortestPath - algorytm Dijkstry
*
* @author mephisto
*/
public class DijkstraShortestPath {
 
/**
* Reprezentuje dystans do danej krawedzi. Uzywane do przechowywania w
* kolejce priorytetowej do wyboru najkrotszej krawedzi.
*
* @author mephisto
*/
class DistanceToEdge implements Comparable<DistanceToEdge> {
// krawedz
private final int edge;
// odleglosc do tej krawedzi
private long distance;
 
public DistanceToEdge(int edge, long distance) {
this.edge = edge;
this.distance = distance;
}
 
public long getDistance() {
return distance;
}
 
public void setDistance(long distance) {
this.distance = distance;
}
 
public int getEdge() {
return edge;
}
 
@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + getOuterType().hashCode();
result = prime * result + (int) (distance ^ (distance >>> 32));
result = prime * result + edge;
return result;
}
 
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
DistanceToEdge other = (DistanceToEdge) obj;
if (!getOuterType().equals(other.getOuterType()))
return false;
if (distance != other.distance)
return false;
if (edge != other.edge)
return false;
return true;
}
 
@Override
public int compareTo(DistanceToEdge param) {
int cmp = new Long(distance).compareTo(param.getDistance());
 
if (cmp == 0) {
return new Integer(edge).compareTo(param.getEdge());
}
return 0;
}
 
private DijkstraShortestPath getOuterType() {
return DijkstraShortestPath.this;
}
}
 
// ////////////////////////////////////////////////////////////////////
// przechowuje krawedz z ktorej jest najblizej do biezacej okreslonej
// indeksem tablicy
private DirectedEdge[] edgeTo;
// przechowuje najkrotsze znalezione odleglosci do danego wierzcholka
private Long[] distanceTo;
// kolejka przechowujaca biezace krawedzie uszeregowane od najkrotszej do
// najdluzszej
private Queue<DistanceToEdge> priorityQueue;
 
public DijkstraShortestPath(DirectedGraph graph, int source) {
// inicjacja wewnetrznych struktur
edgeTo = new DirectedEdge[graph.getNumberOfVertices()];
distanceTo = new Long[graph.getNumberOfVertices()];
priorityQueue = new PriorityQueue<DistanceToEdge>(
graph.getNumberOfVertices());
 
// dla kazdego wierzcholka v ustawiamy najwieksza mozliwa wartosc jaka
// moze przechowywac
for (int v = 0; v < graph.getNumberOfVertices(); v++) {
distanceTo[v] = Long.MAX_VALUE;
}
// odleglosc do wierzcholka zrodlowego to 0
distanceTo[source] = 0L;
 
// wstawiamy wierzholek zrodlowy do kolejki, od niego rozpoczynamy
// poszukiwania
priorityQueue.offer(new DistanceToEdge(source, 0L));
 
// przeprowadzamy relaksacje grafu dopoki kolejka nie jest pusta
while (!priorityQueue.isEmpty()) {
relax(graph, priorityQueue.poll().getEdge());
}
 
}
 
private void relax(DirectedGraph graph, int v) {
// przegladamy listy sasiedztwa wszystkich wierzcholkow
for (DirectedEdge edge : graph.getNeighborhoodList(v)) {
int w = edge.to();
 
// sprawdzamy czy zmiana wierzcholka skroci dystans z wierzcholka
// zrodlowego
if (distanceTo[w] > distanceTo[v] + edge.getWeight()) {
distanceTo[w] = distanceTo[v] + edge.getWeight();
edgeTo[w] = edge;
DistanceToEdge dte = new DistanceToEdge(w, distanceTo[w]);
 
// jesli jest juz krawedz o tej wadze to ja usuwamy, bo
// znalezlismy lepsza droge
priorityQueue.remove(dte);
// wstawiamy nowa krawedz z aktualna znaleziona odlegloscia
priorityQueue.offer(dte);
}
}
 
}
 
// jesli zwrocona wartosc wynosi Long.MAX_VALUE to oznacza, ze dany
// wierzcholek jest nieosiagalny ze zrodla
public long getDistanceTo(int v) {
return distanceTo[v];
}
 
// jesli istnieje droga do danego wierzcholka jest mniejsza od
// Long.MAX_VALUE, ktore zostalo inicjalnie ustawione dla wszystkich
// wierzcholkow
public boolean hasPathTo(int v) {
return distanceTo[v] < Long.MAX_VALUE;
}
 
// jesli nie istnieje sciezka do danego wierzcholka zostanie zwrocona pusta
// kolekcja
public Iterable<DirectedEdge> getPathTo(int v) {
Deque<DirectedEdge> path = new ArrayDeque<DirectedEdge>();
// jesli nie istnieje sciezka zwroc pusta sciezke
if (!hasPathTo(v)) {
return path;
}
// dopoki istnieje krawedz dodawaj ja do stosu
// krawedz zrodlowa jest oznaczona jako null
for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
path.push(e);
}
return path;
}
 
/**
* @param args
*/
public static void main(String[] args) {
// Rozwiazanie przykladu z lekcji HEGARTYMATHS
// http://www.youtube.com/watch?v=xT5o1QCeWS8
DirectedGraph graph = new DirectedGraph(7);
graph.addEdge(new DirectedEdge(0, 1, 4));
graph.addEdge(new DirectedEdge(0, 2, 3));
graph.addEdge(new DirectedEdge(0, 3, 7));
 
graph.addEdge(new DirectedEdge(1, 3, 1));
graph.addEdge(new DirectedEdge(1, 5, 4));
 
graph.addEdge(new DirectedEdge(2, 3, 3));
graph.addEdge(new DirectedEdge(2, 4, 5));
 
graph.addEdge(new DirectedEdge(3, 4, 2));
graph.addEdge(new DirectedEdge(3, 5, 2));
graph.addEdge(new DirectedEdge(3, 6, 7));
 
graph.addEdge(new DirectedEdge(4, 6, 2));
 
graph.addEdge(new DirectedEdge(5, 6, 4));
 
int source = 0;
DijkstraShortestPath shortestPath = new DijkstraShortestPath(graph,
source);
 
// Wyswietla najkrotsze sciezki
for (int target = 0; target < graph.getNumberOfVertices(); target++) {
if (shortestPath.hasPathTo(target)) {
System.out.printf("%d do %d (%d)  ", source, target,
shortestPath.getDistanceTo(target));
if (shortestPath.hasPathTo(target)) {
for (DirectedEdge edge : shortestPath.getPathTo(target)) {
System.out.print(edge);
}
}
} else {
System.out.printf("%d do %d - brak sciezki  ", source, target);
}
System.out.println();
}
 
}
}