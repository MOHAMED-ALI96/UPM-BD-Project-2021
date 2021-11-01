name := "big-data-project"

version := "0.1"

scalaVersion := "2.13.7"

//idePackagePrefix := Some("org.bigdata.project")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.0",
  "org.apache.spark" %% "spark-sql" % "3.2.0"
)
