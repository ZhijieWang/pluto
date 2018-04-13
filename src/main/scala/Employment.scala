package com.github.zhijiewang
import gremlin.scala.id

case class Employment(@id id: Option[Int],
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
case class Company(@id id:Option[Int],
                   name: String,
                   companyID:Option[Int],
                   sector:String,
                   orgnizationType:String,
                   ISIN :Option[String]
                  )
object Employment {
  def load(): Unit ={
  //NED == No means Executive Position
  // NED == Yes means Supervisory Position
    val bufferedSource = io.Source.fromFile("./company.csv")
    val lines = bufferedSource.getLines
    lines.next()
    for (line <-lines){
      val cols = line.split(",").map(_.trim)

    }
    bufferedSource.close()
  }

}
