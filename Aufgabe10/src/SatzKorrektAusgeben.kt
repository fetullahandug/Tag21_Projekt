fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts", "mehr ", "nicht ", "ist ", "Satz ", "Dieser ")
    satzAusgabe(umgedrehterSatz)
    println()
}

fun satzAusgabe(list: List<String>) : MutableList<String> {
    var listReturn: MutableList<String> = mutableListOf()
    var i = list.size -1

    do{
        listReturn.add(list[i--])
    }while(i >= 0)

    var c = 0
    while(c < listReturn.size){
        print(listReturn[c++])
    }
    return listReturn
}