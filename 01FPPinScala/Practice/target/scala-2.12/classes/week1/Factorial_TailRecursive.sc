def factorial(n:BigInt):BigInt = {
  if (n == 0) 1 else facIteration(n:BigInt)

  def facIteration(n:BigInt) =
    n*(n-1)
}

factorial(6:BigInt)
