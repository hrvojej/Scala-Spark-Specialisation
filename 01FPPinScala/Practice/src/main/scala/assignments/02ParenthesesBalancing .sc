def balance(chars: List[Char], numOpens: Int): Boolean = {
  // chars.isEmpty: Boolean returns whether a list is empty
    if (chars.isEmpty) {
      numOpens == 0
    } else {
      //chars.head: Char returns the first element of the list
      val h = chars.head
      val n =
        if (h == '(') numOpens + 1
        else if (h == ')') numOpens - 1
        else numOpens
      //chars.tail: List[Char] returns the list without the first element
      if (n >= 0) balance(chars.tail, n)
      else false
    }
  }

// use toList method to convert from a String to a List[Char]: "(just an) example".toList.
balance("".toList, 0)

