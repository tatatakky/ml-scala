package com.github.tatatakky.ml.nn

object FunctionTool {

  abstract trait Functions {
    def f(v: Double): Double
  }

  case object Sigmoid extends Functions {
    import scala.math.exp
    def f(v: Double): Double = 1/(1 + exp(-v))
  }

  case object Step extends Functions {
    def f(v: Double): Double = {
      if(v >= 0) {
        1.0
      } else {
        0.0
      }
    }
  }

  def functions(func: Functions)(u: Double): Double = func match {
    case Sigmoid => func.f(u)
    case Step    => func.f(u)
  }
}