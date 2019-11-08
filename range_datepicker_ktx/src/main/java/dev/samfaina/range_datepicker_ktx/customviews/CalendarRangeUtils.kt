package dev.samfaina.range_datepicker_ktx.customviews

import java.util.*


internal object CalendarRangeUtils {
    /**
     * Resets date time to HH:mm:ss SSS = 00:00:00 000
     *
     * @param date [Calendar]
     */
    fun resetTime(date: Calendar) {
        date.set(Calendar.HOUR, 0)
        date.set(Calendar.MINUTE, 0)
        date.set(Calendar.SECOND, 0)
        date.set(Calendar.MILLISECOND, 0)
    }
}