import java.util.*

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
    private fun mergekLists(lists: Array<ListNode?>): ListNode? {
        val q = PriorityQueue<ListNode?>(
            1.coerceAtLeast(lists.size)
        ) { e1, e2 -> e1!!.`val` - e2!!.`val` }
        for (i in lists.indices) {
            if (lists[i] != null) {
                q.add(lists[i])
            }
        }
        // Iterator i = q.iterator();
        // while(i.hasNext()){
        //   display((ListNode)i.next());
        // }
        val fakeHead = ListNode(-1)
        var p: ListNode? = fakeHead
        while (!q.isEmpty()) {
            val n = q.poll()
            if (n!!.next != null) {
                q.add(n.next)
            }
            n.next = null
            p!!.next = n
            p = n
        }
        return fakeHead.next
    }

    private fun lineBreak() {
        println("#####################")
    }

    private fun display(l: ListNode?) {
        var temp = l
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

    @JvmStatic
    fun main(s: Array<String>) {
        val lists = arrayOfNulls<ListNode>(2)
        val list1 = listOf(1, 4, 5)
        val list2 = listOf(1, 3, 4)
        lineBreak()
        val l1 = insert(list1)
        val l2 = insert(list2)
        lists[0] = l1
        lists[1] = l2
        //  list1.stream().forEach(x->{
        //  System.out.println(x);
        //  });
        display(l1)
        lineBreak()
        display(l2)
        lineBreak()
        val res = mergekLists(lists)
        display(res)
        lineBreak()
    }
}