fun main(){
    var x= listOf(0,1,1,1,1,1,0,0,1);
    var zeroes= mutableListOf<Int>();
    zeroes.add(0);
    for(i in 1 until  x.size-1){
         if(x[i]==0){
             zeroes.add(i);
         }
    }
    zeroes.add(x.size-1)
    var max=0;
    var diff=0;
    var current =0;

    for(i in 0 until zeroes.size-2){
        diff = zeroes[i + 2] - zeroes[i];
        if (diff > max) {
            max = diff;
            current = zeroes[i + 1];
        }
    }

    if (zeroes.size == 2 && x[x.size - 1] == 0) {
        current = x.size - 1;
    }

    println(current)

}