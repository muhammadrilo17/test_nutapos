import java.text.SimpleDateFormat
import java.util.Locale
import java.util.Date

class Utils {
    fun generateOrderNumber(): String {
        val orderCount = viewModel.getTotalOrderToday() + 1
        val formattedDate = SimpleDateFormat("yyMMdd", Locale.getDefault()).format(Date())
        return "UM/$formattedDate/$orderCount"
    }
    
}