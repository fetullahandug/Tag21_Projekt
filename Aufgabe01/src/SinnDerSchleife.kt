fun einsBisZehnOhneSchleife() {
    println(1)
    println(2)
    println(3)
    println(4)
    println(5)
    println(6)
    println(7)
    println(8)
    println(9)
    println(10)
}

fun einsBisZehnMitSchleife() {
    var counter = 1
    while (counter <= 10) {
        println(counter)
        counter++
    }
}

fun main() {
    einsBisZehnMitSchleife()
    einsBisZehnOhneSchleife()
}

// 5 Zeilen Code sparen wir inkl. Klammern

