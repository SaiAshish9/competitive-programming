import java.util.*
import java.util.stream.Collectors

internal class ListNode {
    var `val` = 0
    var next: ListNode? = null

    constructor() {}
    constructor(x: Int) {
        `val` = x
    }
}

internal object Main {
    private fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head == null || k == 1) return head
        val fake = ListNode(0)
        fake.next = head
        var pre: ListNode? = fake
        var i = 0
        var p = head
        while (p != null) {
            i++
            if (i % k == 0) {
                pre = reverse(pre, p.next)
                p = pre!!.next
            } else {
                p = p.next
            }
        }
        return fake.next
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

    private fun reverse(pre: ListNode?, next: ListNode?): ListNode? {
        val last = pre!!.next
        var curr = last!!.next
        while (curr !== next) {
            last.next = curr!!.next
            curr.next = pre.next
            pre.next = curr
            curr = last.next
        }
        return last
    }

    private fun display(root: ListNode?) {
        var temp: ListNode? = ListNode()
        temp = root
        while (temp != null) {
            println(temp.`val`)
            temp = temp.next
        }
    }

    private fun linebreak() {
        println("#####################")
    }

    @JvmStatic
    fun main(s: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val list = Arrays.stream(arr).boxed().collect(Collectors.toList())
        val l1 = insert(list)
        linebreak()
        display(l1)
        linebreak()
        val res = reverseKGroup(l1, 2)
        display(res)
        linebreak()
    }
}