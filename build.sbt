name := "ti-models-calls"

organization := "org.bom4v.ti"

version := "0.0.1"

scalaVersion := "2.11.11"

crossScalaVersions := Seq("2.11.11", "2.12.4")

checksums in update := Nil

libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.16.0"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.9.4" % "test"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snaspshots"),
  "Local repository"     at "http://localhost/mavenrepo/",
  Resolver.mavenLocal
)


javacOptions in Compile ++= Seq("-source", "1.8",  "-target", "1.8")

scalacOptions ++= Seq("-deprecation", "-feature")

publishTo := Some("TI Maven Repo" at "http://localhost/mavenrepo/")

cleanKeepFiles += target.value / "test-reports"
