fun main(args: Array<String>) {

    // while
    funWhile()

    // do-while
    funDoWhile()

    // for
    funFor()

    // for-until
    funForUntil()

    // for-step
    funForStep()

    // for-downTo
    funForDownTo()

    // Listのfor
    funForList()

    // Mapのfor
    funForMap()

    // foreach
    funForeach()

    // repeat
    funRepeat()
}

fun funWhile() {
    var i = 0
    while (i < 3) {
        println(i)
        i++
    }
}

fun funDoWhile() {
    var i = 0
    do {
        println(i)
        i++
    } while (i < 3)
}

fun funFor() {
    for (i in 1..3) {
        println(i)
    }
}

fun funForUntil() {
    for (i in 1 until 3) {
        println(i)
    }
}

fun funForStep() {
    for (i in 1..3 step 2) {
        println(i)
    }
}

fun funForDownTo() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun funForList() {
    var list = arrayOf("Kotlin", "Java", "Python")
    for (value in list) {
        println(value)
    }
}

fun funForMap() {
    var map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python")
    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun funForeach() {
    (1..3).forEach {
        println(it)
    }
}

fun funRepeat() {
    repeat(3) {
        println(it)
    }
}