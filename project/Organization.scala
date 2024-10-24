import sbt.url

object Organization {
  val organization: String = "com.github.sbt"
  val organizationName: String = "sbt"
  val organizationHomepage: Option[sbt.URL] = Some(url("https://www.scala-sbt.org/"))
}