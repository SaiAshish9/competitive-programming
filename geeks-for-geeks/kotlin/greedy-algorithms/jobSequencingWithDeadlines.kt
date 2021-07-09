import java.util.*

internal class Main {
    var id = 0.toChar()
    var deadline = 0
    var profit = 0

    constructor() {}
    constructor(id: Char, deadline: Int, profit: Int) {
        this.id = id
        this.deadline = deadline
        this.profit = profit
    }

    fun printJobScheduling(arr: ArrayList<Main?>, t: Int) {
        val n: Int = arr.size()
        Collections.sort(
            arr
        ) { a, b -> b.profit - a.profit }

// sort jobs on the basis of deadlines
        val result = BooleanArray(t)
        val job = CharArray(t)
        for (i in 0 until n) {
            for (j in Math.min(t - 1, arr.get(i).deadline - 1) downTo 0) {

                // iterate from max dealine to 0
                // and choose appropriate jobs using their respective index
                // as we already sorted them  
                if (result[j] == false) {
                    result[j] = true
                    job[j] = arr.get(i).id
                    break
                }
            }
        }
        for (jb: Char in job) {
            System.out.print("$jb ")
        }
        System.out.println()
    }

    companion object {
        fun main(args: Array<String?>?) {
            val arr: ArrayList<Main?> = ArrayList<Main>()
            arr.add(Main('a', 2, 100))
            arr.add(Main('b', 1, 19))
            arr.add(Main('c', 2, 27))
            arr.add(Main('d', 1, 25))
            arr.add(Main('e', 3, 15))
            System.out.println(
                "Following is maximum "
                        + "profit sequence of jobs"
            )
            val job = Main()
            job.printJobScheduling(arr, 3)
        }
    }
}