package com.github.tatatakky.ml.tfidf

import com.github.tatatakky.ml.tfidf.Tfidf._

object Main {

  val document1: List[String] = List("apple", "lemon", "lemon")
  val document2: List[String] = List("apple", "orange")
  val vector = Vector.empty

  val documentTotal: Seq[List[String]] = vector :+ document1 :+ document2

  def main(args: Array[String]): Unit = {

    var counter: Int = 1
    for(document <- documentTotal){
      println("document" + counter + " : " + tfidf("apple", document))
      counter += 1
    }
  }
}