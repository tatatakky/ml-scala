package com.github.tatatakky.ml.nn

import com.github.tatatakky.ml.nn.FunctionTool._
import com.github.tatatakky.ml.nn.FileRead._
import com.github.tatatakky.ml.nn.IO._

object Nn {

  val inputNum = 2

  def theDataLength[T](data: List[List[T]]): Int = data.length

  def forward(w: List[Double], data: List[Double], useFunction: Functions): Double = {
    var u: Double = 0.0
    for(x <- 0 until inputNum){
      u += data(x) * w(x)
    }
    u -= w(inputNum)
    functions(useFunction)(u)
  }

  def main(args: Array[String]): Unit = {
    val w: List[Double] = List(1.0, 1.0, 1.5)
    val data: List[List[Double]] = readFileToList("path")
    val useFunction: Functions = selectFunctions("1")
    val dataLength: Int = theDataLength(data)
    output(w, data, dataLength, useFunction)
  }
}
