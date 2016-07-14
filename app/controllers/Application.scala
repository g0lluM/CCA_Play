package controllers

import play.api._
import play.api.mvc._
import java.io._


object Application extends Controller {

  def index = Action {
    Ok(views.html.index("It works!"))
  }

  def submit = Action { implicit request =>



    val pw = new PrintWriter(new FileOutputStream("/home/antonin/Bureau/test", true)); // Open file with add mode

    println(pw)

    val eventPlace = request.body.asFormUrlEncoded.get("City")(0)
    val eventDetails = request.body.asFormUrlEncoded.get("Details")(0)
    val eventDate = request.body.asFormUrlEncoded.get("Date")(0)
    val eventAbstract = request.body.asFormUrlEncoded.get("Abstract")(0)
    val eventPrice = request.body.asFormUrlEncoded.get("Price")(0)
    val eventPicture = request.body.asFormUrlEncoded.get("Picture")(0)
    val eventSpeaker = request.body.asFormUrlEncoded.get("Speaker")(0)

    val text = "\n" + eventPlace + "\t" + eventDetails + "\t" + eventDate + "\t" + eventAbstract + "\t" + eventPrice + "\t" + eventPicture + "\t" + eventSpeaker

    println(text)
    pw.write(text)
    pw.close()
    Ok(text)

  }

}
