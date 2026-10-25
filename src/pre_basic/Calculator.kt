package pre_basic

class Calculator {
    private val logs = mutableListOf<String>()

    fun add(a: Int, b: Int) = (a + b).also {
        logs += "add $a $b -> $it"
    }

    fun sub(a: Int, b: Int) = (a - b).also {
        logs += "sub $a $b -> $it"
    }

    fun mul(a: Int, b: Int) = (a * b).also {
        logs += "mul $a $b -> $it"
    }

    fun div(a: Int, b: Int): Int {
        require(b != 0) {"0으로 나눌 수 없습니다."}

        return (a/b).also{
            logs += "div $a $b -> $it"
        }
    }

    fun history(): List<String> = logs.toList()

    fun clear() = logs.clear()


}