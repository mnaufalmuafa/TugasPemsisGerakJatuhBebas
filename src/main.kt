private var t = 0f
private var y = 10f
private var v = 0f
private val step = 0.1f

fun main() {
    println("t\t\tv(t)\t\ty(t) (numerik)")
    var i = 1
    while (y >= 0 && y(t) >= 0) {
        print("%.1f".format(t)+"\t\t")
        print("%.2f".format(v(t))+"\t\t")
        v = v(t)
        print("%.2f".format(y(t))+"\n")
        y = y(t)
        t += step
        i++
    }
}

fun y(t : Float) : Float {
    if (y == 10f && t == 0f) {
        return y
    }
    else {
        return y + v*(t-(t-step))
    }
}

fun v(t : Float) : Float {
    if (v == 0f && t == 0f) {
        return 0f
    }
    else {
        return v - 9.8f*(t-(t-step))
    }
}