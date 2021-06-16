package subtask1

import java.time.DateTimeException
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
        fun toTextDay(day: String, month: String, year: String): String =
        try {
            var date: LocalDateTime = LocalDateTime.of(year.toInt(), month.toInt(), day.toInt(), 0, 0)
            date.format(DateTimeFormatter.ofPattern("d MMMM, eeee").withLocale(Locale("ru")))
        }
        catch (e:DateTimeException)
        {
            "Такого дня не существует"
        }
    }
}
