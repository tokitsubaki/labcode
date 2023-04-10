fun main(args: Array<String>) {

    // 文字列を結合したい
    funJoinString()

    // 変数を文字列を埋め込みたい
    funTemplateLiteral()

    // 文字列を抽出したい
    funExtractString()

    // 文字列の長さを求めたい
    funLengthString()

    // 文字列を検索したい
    funSearchString()

    // 文字列を置換したい
    funReplaceString()

    // 文字列を削除したい
    funDropString()

    // 文字列を配列に分割したい
    funSplitString()

    // 文字列をトリミングしたい
    funTrimString()

    // 文字列をパディングしたい
    // 文字列を大文字・小文字に変換したい
    // 文字列を数値に変換したい
    // 数値を文字列に変換したい
    // 文字列が一致しているか確認したい
}

fun funJoinString() {
    
    val s1 = "Hello" + " " + "Kotlin"
    println(s1)

    val s2 = "Kotlin" + 123
    println(s2)

    val s3 = "Hello".plus(" ").plus("Kotlin")
    println(s3)
}

fun funTemplateLiteral() {

    val s1 = "Hello"
    val s2 = "Kotlin"

    val result = "$s1 $s2"
    println(result)
}

fun funExtractString() {

    val s = "Hello Kotlin"

    val r1 = s.substring(0, 5)
    println(r1)

    val r2 = s.substring(6)
    println(r2)

    val r3 = s.substring(6..11)
    println(r3)

    val r4 = s[0]
    println(r4)

    val r5 = s.elementAt(6)
    println(r5)

    val r6 = s.elementAtOrElse(12){'無'}
    println(r6)

    val r7 = s.elementAtOrNull(12)
    println(r7)

    val r8 = s.first()
    println(r8)

    val r9 = s.last()
    println(r9)

    val r10 = s.slice(0..5)
    println(r10)

    val r11 = s.slice(listOf<Int>(0,4,6,11))
    println(r11)

    val r12 = s.take(5)
    println(r12)

    val r13 = s.takeLast(6)
    println(r13)

}

fun funLengthString() {

    val s = "Hello Kotlin"

    val r = s.length
    println(r)
}

fun funSearchString() {
    
    val s = "Hello Kotlin"

    val r1 = s.indexOf("Kotlin")
    println(r1)

    val r2 = s.lastIndexOf("Kotlin")
    println(r2)

    val r3 = s.startsWith("Hello")
    println(r3)

    val r4 = s.endsWith("Kotlin")
    println(r4)

    val r5 = Regex("Kotlin").containsMatchIn(s)
    println(r5)

    val r6 = Regex("Kotlin").matches(s)
    println(r6)

    val r7 = Regex("Kotlin").find(s)
    println(r7?.value)
}

fun funReplaceString() {

    val s = "Kotlin"

    val r1 = "Hello Java".replace("Java", s)
    println(r1)

    val r2 = "Java Java".replace("Java", s)
    println(r2)

    val r3 = "Java Python Ruby".replaceBefore(" Python ", s)
    println(r3)

    val r4 = "Java Python Ruby".replaceAfter(" Python ", s)
    println(r4)

    val r5 = "Java Java Java".replaceAfterLast("Java", s)
    println(r5)

    val r6 = "Java Java Java".replaceBeforeLast("Java", s)
    println(r6)
}

fun funDropString() {

    val s = "Hello Kotlin"

    val r1 = s.drop(6)
    println(r1)

    val r2 = s.dropLast(6)
    println(r2)

    val r3 = s.removePrefix("Hello")
    println(r3)

    val r4 = s.removeSuffix("Kotlin")
    println(r4)

    val r5 = s.removeRange(0, 6)
    println(r5)
}

fun funSplitString() {

    val s = "Kotlin Java Python Ruby"

    val r = s.split(" ")
    println(r)
}

fun funTrimString() {

    val s = "  Hello Kotlin   "

    val r1 = s.trim()
    println(r1)

    val r2 = s.trim(' ', 'H', 'n')
    println(r2)

    val r3 = s.trimStart()
    println(r3)

    val r4 = s.trimEnd()
    println(r4)

}