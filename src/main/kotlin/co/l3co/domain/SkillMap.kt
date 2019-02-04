package co.l3co.domain

enum class SkillMap(val value: Int) {
    BASIC(1),
    INTERMEDIATE(2),
    ADVANCED(3),
    FLUENT(4);

    fun getSkillValue() = value
}