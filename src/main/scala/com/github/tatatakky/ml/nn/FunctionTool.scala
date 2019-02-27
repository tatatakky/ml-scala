package com.github.tatatakky.ml.nn

import scala.math.exp

object FunctionTool {

  abstract trait Functions {
    def f(v: Double): Double
  }

  class Sigmoid extends Functions {

    def f(v: Double): Double = 1/(1 + exp(-v))

  }

  class Step extends Functions {

    def f(v: Double): Double = {
      if(v >= 0) {
        1.0
      } else {
        0.0
      }
    }
  }


}