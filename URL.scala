
object URL //(String , String, String,Map[String,String])
{
  def apply(protocal: String, domain: String, path: String, params: Map[String, String]): String = {
    protocal + "://" + domain + "/" + path + "?" + params.map(keyVal => keyVal._1 + "=" + keyVal._2).mkString("&")
  }

  //
  def unapply(url: String): Option[(String, String, String, Map[String, String])] = {
    val protocolParts = url.split("://")
    val domainParts = protocolParts(1).split("/")
    val pathParts = (domainParts.tail).mkString("/")
    val paramsParts = pathParts.split("\\?")
    val path = paramsParts(0)
    val paramList = (paramsParts(1).split("&")).map(_.split("=")).toList
    val map = (paramList.flatMap(x => x.map(y => (x(0), x(1))))).toMap
    Some(protocolParts(0), domainParts(0), path, map)
  }

}
