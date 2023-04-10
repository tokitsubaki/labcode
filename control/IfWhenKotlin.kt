fun main(args: Array<String>) {

    // if文の基本形
    funIfBasic()

    // if文で値を返す
    funIfReturn()

    // 三項演算子風
    funTernaryOperator()

    // IntRange
    funIfIntRange()

    // whenの基本形
    funWhenBasic()

    // whenのIntRange
    funWhenIntRange()

    // whenで値を返す
    funWhenReturn()

    // whenの引数なし
    funWhenNonArg()

    // whenのケースをまとめる
    funWhenOrCase()
    funWhenOrCase2()

}

fun funIfBasic() {
    val a = 3
    val b = 5

    if (a > b) {
        println("a のほうが大きい")
    } else if (a < b) {
        println("b のほうが大きい")
    } else {
        println("a と b は同じ")
    }
}

fun funIfReturn() {
    val a = 3
    val b = 5

    // 式として利用する場合は最低でもelseが必須であり、基本的にその結果は全て同じ型
    // ただし例外をスローする、あるいはNothing型を返す場合はOK
    val result = if (a > b) {
        println("a のほうが大きい")
        "$a > $b"
    } else if (a < b) {
        println("b のほうが大きい")
        "$a < $b"
    } else {
        println("a と b は同じ")
        "$a = $b"
    }

    println(result)
}

fun funTernaryOperator() {
    val a = 3
    val b = 5

    val result = if (a > b) "$a > $b" else if (a < b) "$a < $b" else "$a = $b"
    println(result)

}

fun funIfIntRange() {
    val n = 1

    val result = if (n in 0..10) "nは0から10の数値である" else "nは0から10の数値でない"
    println(result)

    if (n in 1..10) {
        println("nは1から10の範囲")
    } else if (n in 11..20) {
        println("nは11から20の範囲")
    } else {
        println("それ以外")
    }

}

fun funWhenBasic() {
    val s = "A"

    when (s) {
        "A" -> {
            println("A")
        }
        "B" -> println("B")
        else -> println("その他")
    }
}

fun funWhenIntRange() {
    val n = 10

    when (n) {
        in 1..10 -> println("1から10の範囲である")
        !in 1..9 -> println("1から9の範囲でない")
        else -> println("どれにも該当しない")
    }
}

fun funWhenReturn() {
    val s:Any = "ABC"

    val result = when (s) {
        is String -> s.length
        else -> 0
    }
    println(result)
}

fun funWhenNonArg() {
    val a = 3
    val b = 5

    when {
        a > b -> println("a のほうが大きい")
        a < b -> println("b のほうが大きい")
        else -> println("a と b は同じ")
    }
}

fun funWhenOrCase() {
    val n = 1

    when (n) {
        0, 1 -> println("0または1")
        in 2..5 -> println("2から5")
        else -> println("その他")
    }
}

fun funWhenOrCase2() {
    val n = 1

    when (n) {
        1,2,3,4,5,6,7,8,9,10 -> println("nは1から10の範囲")
        11,12,13,14,15,16,17,18,19,20 -> println("nは11から20の範囲")
        else -> println("それ以外")
    }
}
