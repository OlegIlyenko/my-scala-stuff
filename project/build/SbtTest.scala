import sbt._

class MyScalaStuff(info: ProjectInfo) extends DefaultProject(info) {

  val essentials = "org.angelsmasterpiece" % "scala-essentials" % "1.0-SNAPSHOT"
  val scalazCore = "com.googlecode.scalaz" %% "scalaz-core" % "5.1-SNAPSHOT"
  

  val amRepo = "angelsmasterpiece repo" at "https://github.com/OlegIlyenko/angelsmasterpiece-maven-repo/raw/master"
  val scalaToolsSnapshots = "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

  override def consoleInit =
    """
    import scalaz._
    import Scalaz._
    import org.am.scala.stuff._
    import org.am.scala.essentials._

    """
}
