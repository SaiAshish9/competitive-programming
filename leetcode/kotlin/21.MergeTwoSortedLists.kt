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
    private fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        val l3 = ListNode(-1)
        var node: ListNode? = l3
        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                node!!.next = l1
                l1 = l1.next
                node = node.next
            } else {
                node!!.next = l2
                l2 = l2.next
                node = node.next
            }
        }
        if (l1 != null) {
            node!!.next = l1
        } else if (l2 != null) {
            node!!.next = l2
        }
        return l3.next
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

    private fun display(l: ListNode?) {
        var temp: ListNode? = ListNode()
        temp = l
        println("#############")
        while (temp != null) {
            println(temp.`val`)
            temp = temp.next
        }
        println("#############")
    }

    @JvmStatic
    fun main(s: Array<String>) {
        val arr1 = intArrayOf(1, 2, 4)
        val arr2 = intArrayOf(1, 3, 4)
        val list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList())
        val list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList())
        val l1 = insert(list1)
        val l2 = insert(list2)
        display(l1)
        display(l2)
        val res = mergeTwoLists(l1, l2)
        display(res)
    }
}