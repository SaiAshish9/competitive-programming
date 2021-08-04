import java.util.*
import java.lang.*
import java.io.*

internal class MST {

    fun minKey(key: IntArray, mstSet: Array<Boolean>): Int {
        var min: Int = Integer.MAX_VALUE
        var min_index = -1
        for (v in 0 until V) if (mstSet[v] == false && key[v] < min) {
            min = key[v]
            min_index = v
        }
        return min_index
    }

    fun printMST(parent: IntArray, graph: Array<IntArray>) {
        System.out.println("Edge \tWeight")
        for (i in 1 until V) System.out.println(parent[i].toString() + " - " + i + "\t" + graph[i][parent[i]])
    }
    
    fun primMST(graph: Array<IntArray>) {
        val parent = IntArray(V)

        val key = IntArray(V)

        val mstSet: Array<Boolean> = arrayOfNulls(V)

        for (i in 0 until V) {
            key[i] = Integer.MAX_VALUE
            mstSet[i] = false
        }

        key[0] = 0 
        parent[0] = -1 

        for (count in 0 until V - 1) {
            val u = minKey(key, mstSet)

            mstSet[u] = true

            for (v in 0 until V)  
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u
                    key[v] = graph[u][v]
                }
        }

        printMST(parent, graph)
    }

    companion object {
        private const val V = 5
        fun main(args: Array<String?>?) {
            val t = MST()
            val graph = arrayOf(
                intArrayOf(0, 2, 0, 6, 0),
                intArrayOf(2, 0, 3, 8, 5),
                intArrayOf(0, 3, 0, 0, 7),
                intArrayOf(6, 8, 0, 0, 9),
                intArrayOf(0, 5, 7, 9, 0)
            )

            t.primMST(graph)
        }
    }
}