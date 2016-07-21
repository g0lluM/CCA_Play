
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object addEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Events publisher</title>
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/style.css"/>
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/jquery-ui.css">
    <script src="/public/javascripts/jquery-1.10.2.js"></script>
    <script src="/public/javascripts/jquery-ui.js"></script>
    <script src="/public/javascripts/check_fields.js"></script>
</head>

<body>
<div class="container">
    <h1>Publish your event below:</h1>
    <form action="/submit" method="post">
        <div class="row">
            <div class="col-md-6"><p>Place of the event*:</p>
                <p><input type="radio" name="City" value="London" selected="true" required/>London</p>
                <p><input type="radio" name="City" value="Cambridge"/>Cambridge</p><br>

                <p>Details*<br><input type="text" id="eventPlace" name="Details" required/></p>
                <p>Date of the event*<br><input type="text" id="eventDate" name="Date" required/></p>
                <p>Abstract of the event<br><textarea rows=10 cols=40 name="Abstract"></textarea></p>
            </div>
            <div class="col-md-6">
                <p>Price*: <input type="radio" name="Price" value="Free" selected="true" required/>Free <input type="radio" name="Price" value="Paying"/>Paying</p>

                <p>Speaker*<br><input type="text" id="eventSpeaker" name="Speaker" required/></p>

                <input type="submit" value="Add event"/>
            </div>
    </form>
</div>
</div>
</body>
</html> """))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 21 13:18:04 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/addEvent.scala.html
                  HASH: a79c2ba38785bb38abb1a4f1aa9dd745b99c414a
                  MATRIX: 583->0
                  LINES: 22->1
                  -- GENERATED --
              */
          