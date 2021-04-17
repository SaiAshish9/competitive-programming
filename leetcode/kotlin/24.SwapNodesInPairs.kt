import java.util.*
import java.util.stream.Collectors

internal class ListNode {
    var `val` = 0
    var next: ListNode? = null

    constructor() {}
    constructor(`val`: Int) {
        this.`val` = `val`
    }

    constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
}

internal object Main {
    private fun swapPairs(head: ListNode?): ListNode? {
        val fakeHead = ListNode(-1)
        fakeHead.next = head
        var node: ListNode? = fakeHead
        while (node?.next!!.next != null) {
            val first = node
            val second = node.next
            val third = node.next!!.next
            first.next = third
            second!!.next = third!!.next
            third.next = second
            node = second
        }
        return fakeHead.next
    }

    private fun display(node: ListNode?) {
        var temp: ListNode? = ListNode()
        temp = node
        while (temp != null) {
            println(temp.`val`)
            temp = temp.next
        }
    }

    private fun insert(l: List<Int>): ListNode? {
        var root: ListNode? = ListNode()
        for (i in l.indices) {
            val data = ListNode(l[i])
            if (i == 0) {
                root = data
            } else {
                var temp: ListNode? = ListNode()
                temp = root
                while (temp!!.next != null) {
                    temp = temp.next
                }
                temp.next = data
            }
        }
        return root
    }

    private fun linebreak() {
        println("#############")
    }

    @JvmStatic
    fun main(s: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4)
        val list = Arrays.stream(arr).boxed().collect(Collectors.toList())
        val l = insert(list)
        linebreak()
        display(l)
        val res = swapPairs(l)
        linebreak()
        display(res)
        linebreak()
    }
}