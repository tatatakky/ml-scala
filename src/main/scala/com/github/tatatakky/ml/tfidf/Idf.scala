package com.github.tatatakky.ml.tfidf

import com.github.tatatakky.ml.tfidf.Main._

object Idf {

  def idf(word: String): Double = {
    import scala.math._
    val n: Double = totalNumberOfDocument(documentTotal)
    val df: Double = numberOfDocumentOfAWord(word)
    log10(n/df) + 1
  }

  //全文書数n
  def totalNumberOfDocument(docTotal: Seq[List[String]]): Double = docTotal.length

  //ある単語wordが出現する文書の数
  def numberOfDocumentOfAWord(word: String): Double = {
    var countDoc: Int = 0
    for(docT <- documentTotal){
      if((docT.contains(word)) == true) countDoc += 1
    }
    countDoc
  }
}
