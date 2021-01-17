name := "hello"
version := "1.0"
scalaVersion := "2.12.12"


lazy val persistence = project.in(file("persistence"))
  .settings(
    libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.3" ,
                                           "mysql" % "mysql-connector-java" % "8.0.22" ,
                                       "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test" ,
                                       "org.mockito" % "mockito-scala" % "1.16.13" % "test" ,
                                       "com.h2database" % "h2" % "1.4.200" % "test" ,


    
))

lazy val http = project.in(file("http"))
   .settings(
      libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.2" ,
                                             "com.typesafe.akka" %% "akka-actor" % "2.6.10" ,
                                              "com.typesafe.akka" %% "akka-stream" % "2.6.10" ,
                                             "com.typesafe.akka" %% "akka-http-testkit" % "10.2.2" % "test" ,
                                           "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.10" % "test" ,
                                         "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.10" % "test" ,

))


lazy val root = project.in(file(".")).aggregate(persistence, http)

