organization := "org.effechecka"
name := "effechecka-selector"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val scalaTestV = "3.0.1"
  Seq(
    "joda-time" % "joda-time" % "2.9.3",
    "org.locationtech.spatial4j" % "spatial4j" % "0.6",
    "com.vividsolutions" % "jts-core" % "1.14.0",
    "com.fasterxml.uuid" %  "java-uuid-generator" % "3.1.4",
    "org.scalatest" %% "scalatest" % scalaTestV % "test"
  )
}

publishMavenStyle := true
publishTo := Some("Effechecka Snapshots" at "s3://effechecka.s3-us-east-1.amazonaws.com/snapshots")

