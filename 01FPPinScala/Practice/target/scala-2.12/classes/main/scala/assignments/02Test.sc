def checkOpen(chars:List[Char], countOpen:Int):Boolean = {
  if (chars.isEmpty) {
    countOpen == 0
  } else {
    val char = chars.head
    val count =
      if (char == '(') countOpen +1
      else if (char == ')') countOpen -1
      else countOpen
    if (count >= 0) checkOpen(chars.tail, count)
    else false
  }
}

def balanced(chars:List[Char]) =
  checkOpen(chars:List[Char],countOpen = 0)

balanced("Perica ide u duckas() pero ()".toList)