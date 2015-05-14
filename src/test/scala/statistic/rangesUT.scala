package statistic

import org.scalatest._
import statistic.model.Player

class rangesUT extends FunSpec with ShouldMatchers {
  /*
    Averages give us a way of determining where the center of a set of data is,
    but they don’t tell us how the data varies. Each player has the same average score,
    but there are clear differences between each data set.
    We need some other way of measuring these differences.

    We can differentiate between each set of data by looking at the way in which the scores spread out from the average.
    Each player’s scores are distributed differently, and if we can measure how the scores are dispersed,
    the coach will be able to make a more informed decision.
   */

  val player1Scores = List(
    DataFrequently(7, 1),
    DataFrequently(8, 1),
    DataFrequently(9, 2),
    DataFrequently(10, 2),
    DataFrequently(11, 2),
    DataFrequently(12, 1),
    DataFrequently(13, 1))

  val player2Scores = List(
    DataFrequently(7, 1),
    DataFrequently(9, 2),
    DataFrequently(10, 4),
    DataFrequently(11, 2),
    DataFrequently(13, 1))

  val player3Scores = List(
    DataFrequently(3, 2),
    DataFrequently(6, 1),
    DataFrequently(7, 2),
    DataFrequently(10, 3),
    DataFrequently(11, 1),
    DataFrequently(13, 1),
    DataFrequently(30, 1))

  val player1: Player = Player("Player 1", player1Scores)
  val player2: Player = Player("Player 2", player2Scores)
  val player3: Player = Player("Player 3", player3Scores)



}
