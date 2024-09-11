class AmountsList(var array: MutableList<Amount>) {
    fun addElem(amount: Amount) {
        array.add(amount)
    }

    fun printArray() {
        for (elem in array)
            println(elem.printData())
    }

    fun countSumByCategory(category: String): Float {
        var cnt = 0.0F
        for (elem in array) {
            if (elem.category == category)
                cnt += elem.amount
        }
        return cnt
    }

    fun searchByCategory(category: String) {
        var cnt = 0
        for (elem in array)
            if (elem.category == category) {
                println(elem.printData())
                cnt += 1
            }
        if (cnt == 0) {
            println("Не найдены траты по этой категории!")
        }
    }

    fun searchByDate(date: String) {
        var cnt = 0
        for (elem in array)
            if (elem.date == date) {
                println(elem.printData())
                cnt += 1
            }
        if (cnt == 0) {
            println("Не найдены траты по этой дате!")
        }
    }
}