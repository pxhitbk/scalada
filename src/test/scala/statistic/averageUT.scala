package statistic

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Unit test for average.
 */
package average {

  class averageUT extends FunSpec with ShouldMatchers {
    describe("average calculations") {
      it("calculate the mean should return right value") {
        val data = List(DataFrequently(19, 1), DataFrequently(20, 3), DataFrequently(21, 3))
        val mean = (new Calculation(data)).mean
        mean should be === 20
      }
      it("Calculate the mean with data that contains outliers should return correct but not represent " +
        "the most frequently occurred") {
        val data = List(
          DataFrequently(19, 3),
          DataFrequently(20, 6),
          DataFrequently(21, 3),
          DataFrequently(145,1),
          DataFrequently(147,1))
        val mean = (new Calculation(data)).mean
        mean should be === 38
      }
      it("Should found upper and lower median number if number of elements is odd") {
        val data = List(
          DataFrequently(19, 1),
          DataFrequently(20, 3),
          DataFrequently(21, 2),
          DataFrequently(100,1),
          DataFrequently(102,1))
        val median = (new Calculation(data)).median
        median.length should be === 2
        median(0) should be === 20
        median(1) should be === 21
      }
      it("Should found one median number if number of elements is even") {
        val data = List(
          DataFrequently(19, 2),
          DataFrequently(20, 3),
          DataFrequently(21, 2),
          DataFrequently(100,1),
          DataFrequently(102,1))
        val median = (new Calculation(data)).median
        median.length should be === 1
        median(0) should be === 20
      }
      it("Should calculate mode numbers by selecting most popular number") {
        val data = List(
          DataFrequently(1, 4),
          DataFrequently(2, 6),
          DataFrequently(3, 4),
          DataFrequently(4, 4),
          DataFrequently(5, 3),
          DataFrequently(6, 2),
          DataFrequently(7, 1),
          DataFrequently(8, 6))
        val mode = (new Calculation(data)).mode
        mode.length should be === 2
        mode(0) should be === 2
        mode(1) should be === 8
      }
    }
  }

}