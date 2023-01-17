fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)

    var i = 0
    while(i < list.size){
        list[i] = list[i] * 2
        i++
    }

    i = 0
    while(i < list.size){
        println(list[i])
        i++
    }
}