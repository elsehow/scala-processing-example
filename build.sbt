import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-processing-example",
    libraryDependencies ++= Seq(
      "org.processing" % "core" % "3.0b5",
      "org.processing" % "net" % "3.0b5",
      "org.processing" % "video" % "3.0b5",
      "org.processing" % "serial" % "3.0b5",
      "org.processing" % "pde" % "3.0b5",
      "org.processing" % "pdf" % "3.0b5")
  )
