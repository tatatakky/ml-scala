package com.github.tatatakky.ml.nn
import com.github.tatatakky.ml.nn.FunctionTool.Functions
import com.github.tatatakky.ml.nn.Nn._
object IO {
  def output(w: List[Double], data: List[List[Double]], dataLength: Int, useFunction: Functions) = {
    for (x <- 0 until dataLength){
      print(x + " -> ")
      for (y <- 0 until inputNum) {
        print(data(x)(y) + " ")
      }
      println(forward(w, data(x), useFunction))
    }
  }
}