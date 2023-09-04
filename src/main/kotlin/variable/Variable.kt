package variable

fun main() {

    // dikotlin, kalo mau deklarasi variabel ada beberapa cara
    // contoh pake "val" sama "var"

    // val => nilai dari variable tersebut tidak bisa diubah (immutable)
    // var => nilai dari variable tersebut bisa diubah (mutable)

    // Contoh
    val immutable = "hello"
    var mutable = "world"

    // Ganti value dari variable
    /*
        immutable = "halo" // error, "Kotlin: Val cannot be reassigned"
        mutable = "dunia" // ganti value dari "world" menjadi "dunia"
    */

    // Bisa diliat dari kode diatas, dibagian bawah "immutable" ada garis merah
    // nah, itu dia error, kalo valuenya gabisa diubah "Val cannot be reasigned"

    // kalo di run dapet error "Kotlin: Val cannot be reassigned"



    // Kita juga bisa nambahin tipe datanya
    val immutable2: String = "hello"
    var mutable2: String = "hello"

    // Kalo tipe data sama valuenya ga sesuai dia juga bakal error
    /*
        val immutable3: String = 3 // error, tipe data "string" tapi ngasih value "integer"
    */



    // lateinit didalam curly bracket {}
    var nomor: Int

    /*
        println(nomor) // error, "Variable 'nomor' must be initialized"
    */

    nomor = 31 // isi variabel "nomor" dengan nilai "31"

    /*
        println(nomor) // 31
    */

}