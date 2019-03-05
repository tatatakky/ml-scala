package com.github.tatatakky.ml.tfidf

import com.github.tatatakky.ml.tfidf.Tf._
import com.github.tatatakky.ml.tfidf.Idf._

object Tfidf {

  def tfidf(word: String, doc: List[String]): Double = tf(word, doc) * idf(word)

}