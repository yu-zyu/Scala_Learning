package chap10.program02

import org.xml.sax.InputSource
import javax.xml.parsers.DocumentBuilderFactory
import java.io.StringReader
import scala.xml._

object XMLParsing {
  def main(args: Array[String]) {
    val xml = 
      <phrase>
        <word>Hello</word>
        <word>Scala</word>
        <word>World</word>
      </phrase> //　これはScalaのXMLリテラル表記
    val input = new InputSource(new StringReader(xml.toString))
    val document = DocumentBuilderFactory.newInstance.
    newDocumentBuilder.parse(input)

    // 要素<word>を取得
    val words = document.getElementsByTagName("word")
    for (i <- 0 to words.getLength-1)
      println(words.item(i).getTextContent)
  }
}

