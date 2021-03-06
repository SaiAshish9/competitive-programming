import java.lang.Math.pow
import kotlin.math.pow

class Node(var data:Int){
    var next:Node?=null;
}

class Main{

    var root:Node? = null;

    fun push(data: Int){
        var node= Node(data);
        if(root == null){
            root =node;
        }else{
            var q:Node? = root;
            while (q?.next != null){
                q= q?.next;
            }
            q?.next = node;
        }
    }

    fun getCount():Int{
        var count:Int =0;
        var p: Node? = root;
        while (p!=null){
            count++
            p=p.next
        }
        return count
    }

    fun sum(count:Int):Int{
        var x=0;
        var temp: Node? = root;

           for (i in count-1 downTo -1){
               x+= (temp?.data?.times(10.0.pow(i.toDouble())))?.toInt() ?: 0
               temp=temp?.next
           }
            return x

    }

    fun display(){
        var temp:Node? = root;
        while (temp != null){
            println(temp.data)
            temp = temp.next
        }
    }

}

fun main() {
    var l1= Main()
    var l2 = Main()
    l1.push(2)
    l1.push(4)
    l1.push(3)
    l2.push(5)
    l2.push(6)
    l2.push(4)
    l1.display()
    l2.display()
    var sum = l1.sum(l1.getCount())+l2.sum(l2.getCount())
    var x= sum
    var res=0
    while (x>0){
        res= res*10 + x%10
        x/=10
    }
    println("Answer : $res")
}

