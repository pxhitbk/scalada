package statistic
/**
 * <p>Analyze ranges and variation.</p>
 * <b>Terms:</b> <br/>
 * - <b><i>Outlier:</i></b> a data point on a graph or in a set of results that is very much bigger or smaller than the next nearest data point. <br/>
 */
class Ranges {
  /** Smallest value in range. */
  def lowerBound(data: List[Int]): Int = ???

  /** Largest value in range. */
  def upperBound(data: List[Int]): Int = ???

  /**
   * The range tells us over how many numbers the data extends, a bit like measuring its width
   * */
  def range(data: List[Int]) = lowerBound(data) - upperBound(data)

}

class Quartiles(data: List[Int]) {
  /**
    * 1. Lower quartile is the n ÷ 4 th value. <br/>
    * 2. If this gives you an integer, then the lower quartile is positioned halfway
    * between this position and the next one. Take the average of the numbers at these two positions
    * to get your lower quartile.<br/>
    * 3. If n ÷ 4 is not an integer, then round it up. This gives you the position of the lower quartile.<br/>
    * */
  lazy val lowerQuartile: Int = ???

  /**
   * 1. Start off by calculating 3n ÷ 4.<br/>
   * 2. If it’s an integer, then the upper quartile is positioned halfway between this position and the next.<br/>
   * Add the two numbers at these positions together and divide by 2.
   * 3. If 3n ÷ 4 is not an integer, then round it up. This new number gives you the position of the upper quartile.<br/>
   * */
  lazy val upperQuartile: Int = ???

  lazy val median: List[Int] = ???

  def interQuartileRange(): Int = upperQuartile - lowerQuartile

  private def ascendingSort = data.sortWith(_ < _)
}