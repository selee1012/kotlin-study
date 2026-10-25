package pre_basic

fun main() {
    val calculator = Calculator()

    // 사칙연산 테스트
    println("=== 사칙연산 테스트 ===")
    println("10 + 5 = ${calculator.add(10, 5)}")
    println("10 - 5 = ${calculator.sub(10, 5)}")
    println("10 * 5 = ${calculator.mul(10, 5)}")
    println("10 / 5 = ${calculator.div(10, 5)}")

    // 0으로 나누기 테스트
    println("\n=== 0으로 나누기 ===")
    println("10 / 0 = ${calculator.div(10, 0)}")

    // 연산 기록 출력
    println("\n=== 연산 기록 ===")
    calculator.history().forEachIndexed { index, log ->
        println("${index + 1}. $log")
    }

    // 연산 기록 초기화
    calculator.clear()
    println("\n초기화 후 기록: ${calculator.history()}")
}