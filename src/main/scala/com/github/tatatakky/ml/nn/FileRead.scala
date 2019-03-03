package com.github.tatatakky.ml.nn
import scala.io.Source
object FileRead {
  def readFileToList(e: String): List[List[Double]] = {
    var a: List[List[Double]] = Nil
    try {
      for (line <- Source.fromFile(e).getLines) {
        a = line.split(" ").toList.map(f => f.toDouble) :: a
      }
      println("File Read Success!!")
    } catch {
      case e: Exception => println("error occurred : " + e)
    }
    a.reverse
  }
}