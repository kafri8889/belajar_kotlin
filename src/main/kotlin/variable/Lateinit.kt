package variable

// "lateinit" ini maksudnya inisialisasi variabelnya istilahnya telat lah
// kalo yg "var mutable" itu kan dia langsung ada "value"-nya
// kalo lateinit inisialisasi variabelnya nanti
lateinit var lateinitVariabel: String

// variable "nama1" belum di inisialisasi, kalo kita pake variable yg belum di inisialisasi, nanti bakal ngethrow error
// "lateinit property lateinitVariabel has not been initialized" => variable yg belom di inisialisasi
lateinit var nama1: String

// Kita ga bisa inisialisasi variable yg dikasih modifier "lateinit", nanti dia bakal error
// "'lateinit' modifier is not allowed on properties with initializer"
/*
    lateinit var nama2: String = "my name" // error, 'lateinit' modifier is not allowed on properties with initializer
*/



// Kayaknya lateinit segini doang si

//jadi kayak gini gasi
/*
    name3 = "axelt"
    name4 = "sonta"
*/
//kalo mau print tinggal println antara kedua itu kan kaya ="name4" gtu

// kalo kode di atas equivalennya kayak gini, di kotlin
/*
    var name3 = "axelt"
*/
// iya, kalo mau print tinggal panggil
/*
    println(name3)
*/

fun main() {

    // inisialisasi variable "name1"
    nama1 = "Gweh" // variabel "nama1" udah di inisialisasi, variable nya udah bisa dipake

    println(nama1)



    // Kalo kita belom inisialisasi variabelnya tapi kita panggil/gunakan variable tersebut
    // bakal throw error "lateinit property lateinitVariabel has not been initialized"
    println(lateinitVariabel)

    // inisialisasi lateinit
    lateinitVariabel = "baru di inisialisasi"

    // Nah kode diatas kan kita udah inisialisasi variabelnya
    // kalo kita run kodenya dia berhasil
    println(lateinitVariabel)
}

// ada kang di python, kalo di py dia gini
// None disini maksudnya blm ada valuenya (tipedatanya juga belom tau)
// Sama kayak "lateinit var nama1: String", bedanya kalo dikotlin udah tau tipe datanya
// Jadi variable "nama1" harus diisi sama string, ga bisa sama tipe data lain
//self.namaVariable = None