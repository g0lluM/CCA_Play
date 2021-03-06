package controllers

import play.api.mvc._
import java.io._
import scala.io.Source._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index.apply)
  }

  def submit = Action { implicit request =>

    val eventPlace = request.body.asFormUrlEncoded.get("City")(0)
    val eventDetails = request.body.asFormUrlEncoded.get("Details")(0)
    val eventDate = request.body.asFormUrlEncoded.get("Date")(0)
    var eventAbstract = request.body.asFormUrlEncoded.get("Abstract")(0)
    val eventPrice = request.body.asFormUrlEncoded.get("Price")(0)
    val eventSpeaker = request.body.asFormUrlEncoded.get("Speaker")(0)

    val text = eventPlace + "\t" + eventDetails + "\t" + eventDate + " \t" + eventAbstract + "\t" + eventPrice + " \t" + eventSpeaker + "\n"

    val pw = new PrintWriter(new FileOutputStream("events", true)); // Open file with add mode
    pw.write(text)
    pw.close()

    Ok("Event added!")
  }

  def showEvents = Action {

    val events = Array.ofDim[String](50,50)
    var i = 0

    for(line <- fromFile("events").getLines)
    {
      events(i) = line.split("\t")
      i = i+1
    }
    Ok(views.html.showEvents(events))
  }
}
