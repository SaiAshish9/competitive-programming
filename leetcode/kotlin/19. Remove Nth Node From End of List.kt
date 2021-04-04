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
    var root: ListNode? = null
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var len = 0
        var tmp = head
        while (tmp != null) {
            tmp = tmp.next
            len++
        }
        var toDe = len - n
        val fake = ListNode(-1)
        var parent: ListNode? = fake
        parent!!.next = head
        while (toDe > 0) {
            parent = parent!!.next
            toDe--
        }
        parent!!.next = parent.next!!.next
        return fake.next
    }

    @JvmOverloads
    fun display(temp: ListNode? = root) {
        var temp = temp
        while (temp!!.next != null) {
            print(temp.`val`.toString() + if (temp.next != null) " -> " else "")
            temp = temp.next
        }
        if (temp !== root) print(temp.`val`.toString())
        print("\n")
    }

    @JvmStatic
    fun main(s: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val list = Arrays.stream(arr).boxed().collect(Collectors.toList())
        var temp: ListNode? = ListNode()
        for (i in list.indices) {
            if (list.size == 0) {
                return
            } else if (i == 0) {
                root = ListNode(list[i])
            } else {
                temp = root
                while (temp!!.next != null) {
                    temp = temp.next
                }
                temp.next = ListNode(list[i])
            }
        }
        display()
        val res = removeNthFromEnd(root, 2)
        display(res)
    }
}