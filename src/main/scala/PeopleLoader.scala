package com.github.zhijiewang
import com.github.zhijie.wang.Label
import gremlin.scala._
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource
import org.apache.tinkerpop.gremlin.tinkergraph.structure.{TinkerFactory, TinkerGraph}
//implicit val graph = TinkerFactory.createModern.asScala

//for (line <- lines) {
//  val cols = line.split(",").map(_.trim)
//  // do whatever you want with the columns here
//  println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
//}
//bufferedSource.close
////val g = graph.addV(Person)
//3

@label(Label.Director)
case class Director(@id id: Option[Int],
                    name: String,
                    title: String,
                    usualName:String,
                    surName : String,
                    DOB:String,
                    DOD:String,
                    age:String,
                    gender:String,
                    directorID:Option[Int]
                   )

object PeopleLoader {

  def load(graph:ScalaGraph): Unit ={

    val bufferedSource = io.Source.fromFile("./people.csv")
    val lines = bufferedSource.getLines
    lines.next()
    //    lines.next().split(",").map(_.trim)
    for (line <- lines) {
      val cols = line.split(",").map(_.trim)
      graph + Director(None, cols(0), cols(1), cols(6), cols(7),cols(9), cols(10),cols(11), cols(12), Option(cols(15).toInt))

    }
    bufferedSource.close()
  }
}
