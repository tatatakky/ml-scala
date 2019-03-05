package com.github.tatatakky.ml.tfidf

object Tf {

  //文書doc内のある単語wordのTF値
  def tf(word: String, doc: List[String]): Double = {
    val wcid: Double = wordCountInDoc(word, doc)
    val sumw: Double = sumOfAllCountOfWordInDoc(doc)
    wcid/sumw
  }

  //ある単語wordの文書doc内での出現回数
  def wordCountInDoc(word: String, doc: List[String]): Double = {
    var count: Int = 0
    for(w <- doc){
      if(w == word) count += 1
    }
    count
  }

  //文書doc内のすべての単語の出現回数の和
  def sumOfAllCountOfWordInDoc(doc: List[String]): Double = doc.length

}