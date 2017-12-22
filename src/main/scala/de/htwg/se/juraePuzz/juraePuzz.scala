package de.htwg.se.juraePuzz

import de.htwg.se.juraePuzz.model.Player
import de.htwg.se.juraePuzz.controller.Controller
import de.htwg.se.juraePuzz.model.{Grid,Player}
import  de.htwg.se.juraePuzz.aview.Tui
import de.htwg.se.juraePuzz.aview.Gui.SwingGui
object juraePuzz {

  val controller = new Controller(new Grid(2))
  val tui = new Tui(controller)
  val gui = new SwingGui(controller)
  controller.notifyObservers

  def main(args: Array[String]): Unit = {

    var input: String = ""

    do {
      input = scala.io.StdIn.readLine()
      tui.process_input_line(input)
    } while (input != "q")
  }

}
