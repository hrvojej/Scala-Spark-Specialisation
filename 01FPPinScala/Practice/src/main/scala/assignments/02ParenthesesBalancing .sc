var numOpens=0

def balance(chars: List[Char]): Boolean = {
  if (chars.isEmpty) {
  } else {
    val h = chars.head
    val n =
      if (h == '(') numOpens + 1
      else if (h == ')') numOpens - 1
      else numOpens
    if (n >= 0) balance(chars.tail, n)
    else false
  }
}

balance("fsfssdfs(hfhgf)ggdgdf(jghjg)()()")