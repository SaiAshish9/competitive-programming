import java.util.*
import java.lang.*
import java.io.*

internal class ShortestPath {
    fun minDistance(dist: IntArray, sptSet: Array<Boolean>): Int {
        var min: Int = Integer.MAX_VALUE
        var min_index = -1
        for (v in 0 until V) if (sptSet[v] == false && dist[v] <= min) {
            min = dist[v]
            min_index = v
        }
        return min_index
    }

    fun printSolution(dist: IntArray) {
        System.out.println("Vertex \t\t Distance from Source")
        for (i in 0 until V) System.out.println(i.toString() + " \t\t " + dist[i])
    }

    fun dijkstra(graph: Array<IntArray>, src: Int) {
        val dist = IntArray(V)
        val sptSet: Array<Boolean> = arrayOfNulls(V)
        for (i in 0 until V) {
            dist[i] = Integer.MAX_VALUE
            sptSet[i] = false
        }
        dist[src] = 0
        for (count in 0 until V - 1) {
            val u = minDistance(dist, sptSet)
            sptSet[u] = true
            for (v in 0 until V) if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) dist[v] =
                dist[u] + graph[u][v]
        }
        printSolution(dist)
    }

    companion object {
        const val V = 9
        fun main(args: Array<String?>?) {
            val graph = arrayOf(
                intArrayOf(0, 4, 0, 0, 0, 0, 0, 8, 0),
                intArrayOf(4, 0, 8, 0, 0, 0, 0, 11, 0),
                intArrayOf(0, 8, 0, 7, 0, 4, 0, 0, 2),
                intArrayOf(0, 0, 7, 0, 9, 14, 0, 0, 0),
                intArrayOf(0, 0, 0, 9, 0, 10, 0, 0, 0),
                intArrayOf(0, 0, 4, 14, 10, 0, 2, 0, 0),
                intArrayOf(0, 0, 0, 0, 0, 2, 0, 1, 6),
                intArrayOf(8, 11, 0, 0, 0, 0, 1, 0, 7),
                intArrayOf(0, 0, 2, 0, 0, 0, 6, 7, 0)
            )
            val t = ShortestPath()
            t.dijkstra(graph, 0)
        }
    }
}