import sbt._

class MyScalaStuff(info: ProjectInfo) extends DefaultProject(info) {

  val essentials = "org.angelsmasterpiece" % "scala-essentials" % "1.0-SNAPSHOT"

  val amRepo = "angelsmasterpiece repo" at "https://github.com/OlegIlyenko/angelsmasterpiece-maven-repo/raw/master"

}
