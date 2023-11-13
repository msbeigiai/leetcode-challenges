import scala.util.Sorting
object SquaresOfASortedArray extends App {

  def sortedSquares(nums: Array[Int]): Array[Int] = {
    nums
      .map(n => n * n)
      .sorted
  }

  class SortedSquare(val nums: Array[Int]) {
    override def toString(): String = nums.toList.mkString("[", ", ", "]")
  }

  object SortedSquare {
    def apply(nums: Array[Int]) = new SortedSquare(nums.map(n => n * n).sorted)
  }

  val sorted = SortedSquare(Array(-7, -3, 2, 3, 11))
  println(sorted)

//   val sortedSquares = new SortedSquare(Array(-4, -1, 0, 3, 10)).sorteSquare()
//   println(sortedSquares)

}
