package chap05.section6.association

/**
 * @author 이승환
 * @since 2023-05-23
 *
 * 연관관계
 * - 2개의 서로 분리된 클래스가 연결을 가지는 것, 단방향 혹은 양방향으로 연결 될 수 있다.
 */
class Patient(val name: String) {
    fun doctorList(d: Doctor) { // 인자로 참조
        println("")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) { // 인자로 참조
        println("")
    }
}

fun main() {
    val doc = Doctor("lsh") // 객체가 따로 생성됨.
    val patient = Patient("kim")

    doc.patientList(patient)
    patient.doctorList(doc)
}