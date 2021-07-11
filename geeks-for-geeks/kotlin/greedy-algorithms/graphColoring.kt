import java.io.*
import java.util.*
import java.util.LinkedList

internal class Graph(private val V: Int) {
    private val adj: Array<LinkedList<Integer>>
    fun addEdge(v: Int, w: Int) {
        adj[v].add(w)
        adj[w].add(v)
    }

    fun greedyColoring() {
        val result = IntArray(V)
        Arrays.fill(result, -1)
        result[0] = 0
        val available = BooleanArray(V)
        Arrays.fill(available, true)
        for (u in 1 until V) {
            val it: Iterator<Integer> = adj[u].iterator()
            while (it.hasNext()) {
                val i: Int = it.next()
                if (result[i] != -1) available[result[i]] = false
            }
            var cr: Int
            cr = 0
            while (cr < V) {
                if (available[cr]) break
                cr++
            }
            result[u] = cr
            Arrays.fill(available, true)
        }
        for (u in 0 until V) System.out.println(
            "Vertex " + u + " ---> Color "
                    + result[u]
        )
    }

    companion object {
        fun main(args: Array<String?>?) {
            val g1 = Graph(5)
            g1.addEdge(0, 1)
            g1.addEdge(0, 2)
            g1.addEdge(1, 2)
            g1.addEdge(1, 3)
            g1.addEdge(2, 3)
            g1.addEdge(3, 4)
            System.out.println("Coloring of graph 1")
            g1.greedyColoring()
            System.out.println()
            val g2 = Graph(5)
            g2.addEdge(0, 1)
            g2.addEdge(0, 2)
            g2.addEdge(1, 2)
            g2.addEdge(1, 4)
            g2.addEdge(2, 4)
            g2.addEdge(4, 3)
            System.out.println("Coloring of graph 2 ")
            g2.greedyColoring()
        }
    }

    init {
        adj = arrayOfNulls<LinkedList>(V)
        for (i in 0 until V) adj[i] = LinkedList()
    }
}