private var t = 0f
private var y = 0f
private var v = 0f
private var step = 0f

fun main() {
    print("Masukkan nilai y (m) : ")
    y = readLine()!!.toFloat()
    print("Masukkan nilai step (sekon) : ")
    step = readLine()!!.toFloat()
    println("t\t\t\tv(t)\t\ty(t) (numerik)")
    while (y >= 0 && y(t) >= 0) {
        v = v(t)
        y = y(t)
        print("%.2f".format(t)+"\t\t")
        print("%.2f".format(v)+"\t\t")
        print("%.4f".format(y)+"\n")
        t += step
    }
}

fun y(t : Float) : Float {
    if (t == 0f) {
        return y
    }
    else {
        return y + v*(t-(t-step))
    }
}

fun v(t : Float) : Float {
    if (t == 0f) {
        return 0f
    }
    else {
        return v - 9.8f*(t-(t-step))
    }
}