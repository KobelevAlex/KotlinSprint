package variables

fun main() {
    val  seconds:Short= 6480
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secondsRemaining = seconds % 60

    print("0${hours.toString()}:${minutes.toString()}:0${secondsRemaining.toString()}")
}

