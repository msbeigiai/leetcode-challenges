import scala.util.Sorting
object SquaresOfASortedArray extends App {

  def sortedSquares(nums: Array[Int]): Array[Int] = {
    nums
      .map(n => n * n)
      .sorted
  }

//   val sorted = sortedSquares(Array(-4, -1, 0, 3, 10))
//   println(sorted)

  sortedSquares(Array(-4, -1, 0, 3, 10)).foreach(print)

}
