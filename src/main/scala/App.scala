package com.github.zhijie.wang
import com.github.zhijiewang.PeopleLoader
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph
import gremlin.scala._
import shapeless.TypeOf
object Label {
  val Director = "Director"
  val Company = "Company"
}


object App extends App {


  override def main(args: Array[String]): Unit = {
//    val name = Key[String]("DirectorName")
//    val title = Key[String]("Title")
//    val usualName = Key[String]("UsualName")
//    val surName = Key[String]("SurName")
//    val DOB = Key[String]("DOB")
//    val DOD = Key[String]("DOD")
//    val age = Key[String]("Age")
//    val gender = Key[String]("Gender")
//    val directorID = Key[String]("DirectorID")
//    val networkSize = Key[String]("NetworkSize")

    val graph = TinkerGraph.open.asScala()
    PeopleLoader.load(graph)




  }

}