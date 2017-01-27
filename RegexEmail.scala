
object RegexEmail {

  def unapply(url: String): Option[(String, String)] = {

    val regexpr = """([a-z A-Z 0-9]+)@([a-z A-Z . ]+)""".r //regx used to split Email (a@b.c)

    url match {
      case regexpr(user, domain) => Some(user, domain)
      case _ => None
    }

  }
}

