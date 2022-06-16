fun main() {
    var answer: Char = 'Y'
    var x: Double
    var y: Double
    var z: Double
    while(answer == 'y' || answer == 'Y') {
        println("####დაწყება####")
        println("შეიყვანეთ პირველი რიცხვი")
        try {
            x = readln().toDouble()
            println("შეიყვანეთ მეორე რიცხვი")
            y = readln().toDouble()
        } catch (e: Exception) {
            println(e.message)
            println("შეიყვანეთ მხოლოდ რიცხვი!")
            continue
        }
        z = x.plus(y)
        println("$x-სა და $y-ს ჯამი არის $z")
        println("გსურთ გამეორება? ( Y-დიახ, N-არა)")
        answer = readln().single()
        while (answer != 'N' && answer != 'Y' && answer != 'n' && answer != 'y') {
            println("შეიყვანეთ მხოლოდ შემოთავაზებული ასოები")
            answer = readln().single()
        }
    }
}


