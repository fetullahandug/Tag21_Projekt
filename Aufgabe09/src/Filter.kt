fun main(){
    var langeListe: List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag")
    println(liste(langeListe))

}

fun liste(list: List<String>): MutableList<String>{
    var list1 = list.toMutableList()
    var list2: MutableList<String> = mutableListOf()
    var i = 0
    do{
         if (i % 2 != 0) {
             list2.add(list1[i])
        }
        i += 1
    } while(i < list1.size)
    return list2
}