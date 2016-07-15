
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Events publisher</title>
        <link rel="stylesheet" type="text/css" href="/assets/stylesheets/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="/assets/stylesheets/style.css"/>
        <link rel="stylesheet" type="text/css" href="/assets/stylesheets/jquery-ui.css">
        <script src="/assets/javascripts/jquery-1.10.2.js"></script>
        <script src="/assets/javascripts/jquery-ui.js"></script>
        <script src="/assets/javascripts/check_fields.js"></script>
    </head>

    <body>
        <div class="container">
            <h1>Publish your event below:</h1>
            <form action="/submit" method="post">
                <div class="row">
                    <div class="col-md-6"><p>Place of the event*:</p>
                        <p><input type="radio" name="City" value="London" selected="true"/>London</p>
                        <p><input type="radio" name="City" value="Cambridge"/>Cambridge</p><br>

                        <p>Details*<br><input type="text" id="eventPlace" name="Details" required/></p>
                        <p>Date of the event*<br><input type="text" id="eventDate" name="Date" required/></p>
                        <p>Abstract of the event<br><textarea rows=10 cols=40 name="Abstract"></textarea></p>
                    </div>
                    <div class="col-md-6">
                        <p>Price*<br><input type="radio" name="Price" value="Free" selected="true"/>Free <input type="radio" name="Price" value="Paying"/>Paying</p>

                        <p>Speaker*<br><input type="text" id="eventSpeaker" name="Speaker" required/></p>
                        <p>Picture<br><input type="file" name="Picture" accept="image/gif, image/jpeg, image/png"/></p>

                        <br><br><br><br><br><br><input type="submit" value="Add event"/>
                    </div>
            </form>
        </div>
        </div>
    </body>
</html> """))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jul 15 10:54:30 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/main.scala.html
                  HASH: 75977adab6f92eacf2586f3a0a7871f5b3817971
                  MATRIX: 509->1|627->31|655->33
                  LINES: 19->1|22->1|24->3
                  -- GENERATED --
              */
          