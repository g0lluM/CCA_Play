
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
    <h3>Publish your event below:</h3>
    <form action="/submit" method="post">
        <div class="row">
            <div class="col-md-4">
                <label>Place*:
                    <input type="radio" name="City" value="London" selected="true" required/>London
                    <input type="radio" name="City" value="Cambridge"/>Cambridge
                </label>
            </div>
            <div class="col-md-4">
                <label>Details*:
                    <input type="text" id="eventPlace" name="Details" required/>
                </label>
            </div>
            <div class="col-md-4">
                <label>Abstract*: </label>
                <textarea name="Abstract" required></textarea>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <label>Date*:
                     <input type="text" id="eventDate" name="Date" required/>
                </label>
            </div>
            <div class="col-md-4">
                <label>Price*:
                    <input type="radio" name="Price" value="Free" required/>Free
                    <input type="radio" name="Price" value="Paying"/>Paying
                </label>
            </div>
            <div class="col-md-4">
                <label>Speaker*:
                    <input type="text" id="eventSpeaker" name="Speaker" required/>
                </label>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-4">
                <input type="submit" value="Add event"/>
            </div>
            <div class="col-md-4">
            </div>
        </div>
    </form>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Aug 01 16:20:24 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/addEvent.scala.html
                  HASH: 45ae25ed75c9fc518703523eeda2364148616a7a
                  MATRIX: 583->0
                  LINES: 22->1
                  -- GENERATED --
              */
          