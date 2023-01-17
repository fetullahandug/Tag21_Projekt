fun main() {
    println("Hier drucken wir jede Erhöhung von i aus:")
    var wirdInSchleifeGedruckt = 1
    while (wirdInSchleifeGedruckt <= 3) {
        println("i ist jetzt " + wirdInSchleifeGedruckt)
        wirdInSchleifeGedruckt++
    }

    println("Hier drucken wir nur das Endergebnis aus:")
    var wirdNachSchleifeGedruckt = 1
    while (wirdNachSchleifeGedruckt < 3) {
        wirdNachSchleifeGedruckt++
    }
    println(wirdNachSchleifeGedruckt)


    /* FRAGEN:
    * 1. Schaut mit dem Debugger nach, welchen Wert die Variable wirdInSchleifeGedruckt am Ende der Schleife hat.
    * Warum wird nicht dieser Wert ausgegeben?
    * --> Weil die Schleifenbedingung das erfordert (solange machen solange i <= 3)
    *
    * 2. Zweite Schleife exkl. 3 erste inkl. 3
    * */

}