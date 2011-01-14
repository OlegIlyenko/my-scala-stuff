package org.am.scala

package object stuff {
    def test = "This is package object test"

    object Main extends Application {
      println("App.......................")
    }
}

package stuff {
  object Main1 extends Application {
    println("App.......................")
    println("App.......................")

    import scalaz._
    import Scalaz._

    "App....................... cool!!!" |> println
  }
}

