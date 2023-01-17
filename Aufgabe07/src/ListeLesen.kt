fun main () {
    val list : List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")

    var i = 0
    while(i < list.size){
        println(list[i++])
    }
}