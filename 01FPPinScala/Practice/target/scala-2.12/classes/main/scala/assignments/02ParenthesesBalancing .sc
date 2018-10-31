def checkOpen(chars: List[Char],countOpen: Int): Boolean = {
  if (chars.isEmpty) {
    countOpen == 0
  } else {
    val first = chars.head
    val count =
      if (first == '(') countOpen + 1
      else if (first == ')') countOpen - 1
      else countOpen
    if (count >= 0) checkOpen(chars.tail, count)
    else false
  }
}
def balanced(chars:List[Char]) = {
  checkOpen(chars: List[Char], 0)
}

balanced("Mali medo ide u ducan(gfgh)(hgfh(()))()".toList)





