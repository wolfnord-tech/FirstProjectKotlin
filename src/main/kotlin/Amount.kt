class Amount(var amount: Float,
             var category: String, var date: String) {
    fun printData(): String = "Расход: $amount юаней по категории $category за $date"
}