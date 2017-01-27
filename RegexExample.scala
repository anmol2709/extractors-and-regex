import scala.util.matching.Regex

object RegexExample extends App{

    val eMail = "knol@knoldus.com"
  val result = RegexEmail.unapply(eMail)

  eMail match {
    case RegexEmail(user, domain) => println(s"user\t=\t$user\ndomain\t=\t$domain")
    case _ => println("Not a Valid E-Mail")
  }
}
