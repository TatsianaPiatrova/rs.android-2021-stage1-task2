package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var word = a
        for (liter in word)
        {
            if (!b.contains(liter, true)) {
               word =  word.replace(liter.toString(),"",true )
            }
        }
        if (word.equals(b, true))
            return "YES"
        else return "NO"
    }
}
