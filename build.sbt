name := "aws-glue-101"

version := "0.1"

scalaVersion := "2.12.7"

resolvers ++=Seq(
  "AWS" at "https://aws-glue-etl-artifacts.s3.amazonaws.com/release/"
)
libraryDependencies ++= Seq(
  "com.amazonaws" % "AWSGlueETL" % "3.0.0" % "provided",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.2"
)

Compile / scalacOptions ++= Seq("-deprecation")