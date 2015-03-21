package statistic

/**
 * Average calculations: ßMean, Median and Mode.
 */
package average {
  class Calculation(data: List[DataFrequently]) {
    /**
     * Calculate the mean
     * @return the mean
     */
    def mean: Int = {
      val totalElements = data.map(_.frequently).sum
      data.
        foldLeft(0)((result, input) => result + input.value * input.frequently) / totalElements
    }

    /**
     * Line up all value and pick the middle value
     * @return tuple with (lower,upper) format
     */
    def median: Array[Int] = {
      val lst = data.
        foldLeft(List[Int]())((result, input) => List.fill(input.frequently)(input.value) ::: result)
        .sorted
      val size = lst.size
      if (size % 2 == 1) {
        Array(lst(size / 2))
      } else {
        Array(lst(size / 2 -1 ), lst(size / 2))
      }
    }

    /**
     * Set of data most popular value
     * @return
     */
    def mode: Array[Int] = {
      val mostPresent = data.map(_.frequently).max
      data.filter(_.frequently == mostPresent).map(_.value).toArray
    }
  }

  case class DataFrequently(value: Int, frequently: Int)
}



