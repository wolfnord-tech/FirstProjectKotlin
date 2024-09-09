fun main() {
    val myAmountsList = AmountsList(mutableListOf())
    val myAmount = Amount(888.57F, "Еда", "12.05.2024")
    val myAmount2 = Amount(45883.12F, "Электроника", "13.06.2023")
    val myAmount3 = Amount(15.12F, "Транспорт", "13.06.2023")
    val myAmount4 = Amount(207.15F, "Еда", "11.06.2023")
    myAmountsList.addElem(myAmount)
    myAmountsList.addElem(myAmount2)
    myAmountsList.addElem(myAmount3)
    myAmountsList.addElem(myAmount4)
    var choose: Int
    while (true) {
        println("Страница трат пользователя")
        println("1. Поиск по категориям")
        println("2. Поиск по дате")
        println("3. Тесты")
        print("4. Завершить работу программы\n>> ")
        choose = readln().toInt()
        when (choose) {
            1 -> {
                print("Введите название категории\n>> ")
                myAmountsList.searchByCategory(readln())
            }
            2 -> {
                print("Введите дату\n>> ")
                myAmountsList.searchByDate(readln())
            }
            3 -> {
                myAmountsList.printArray()
                println("Сумма по категории: " + myAmountsList.countSumByCategory("Еда"))
                println(myAmountsList.array[1].printData())
            }
            4 -> {
                println("\nСпасибо за пользование программой! Желаем вам хорошего времени!")
                return
            }
            else -> println("Неправильный ввод")
        }
        println()
    }
}