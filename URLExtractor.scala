
object URLExtractor extends App {
  val myMap = Map(("state", "hash"), ("isauthcode", "true"), ("code", "112"))
//  val myUrl = URL("https", "aws.amazon.com", "console/home", myMap)
val myUrl="https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"


  myUrl match {
    case URL(protocal, domain, path, params)=>println(s"protocal\t=\t$protocal\ndomain\t=\t$domain\npath\t=\t$path\nparams\t=\t$params")
    case _ => println("Not a Valid URL")
  }


  //Code to print the following format:
  /**
    * protocal =” https”
	domain   = “aws.amazon.com”
	path        =”/console/home”
	params = Map(“state” -> “hash”, “isauthcode” -> “true”, “code” -> 112)
    */


}
