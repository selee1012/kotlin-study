package kotlin_konas.Introduction

class NamedArguments {
    fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")
}