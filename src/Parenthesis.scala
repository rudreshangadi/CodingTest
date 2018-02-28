

object Parenthesis {

  def _printParenthesis(str: Array[Char], pos: Int, n: Int, open: Int, close: Int): Unit = {
    if (close == n) {
      for (i <- 0 until str.length) System.out.print(str(i))
      println()
      return
    }
    else {
      if (open > close) {
        str(pos) = '}'
        _printParenthesis(str, pos + 1, n, open, close + 1)
      }
      if (open < n) {
        str(pos) = '{'
        _printParenthesis(str, pos + 1, n, open + 1, close)
      }
    }
  }

  def printParenthesis(str: Array[Char], n: Int): Unit = {
    if (n > 0) _printParenthesis(str, 0, n, 0, 0)
  }

  // driver program
  def main(args: Array[String]): Unit = {
    val n = 3
    val str = new Array[Char](100)
    printParenthesis(str, n)
  }
}