package de.htwg.se.juraePuzz.controller


import de.htwg.se.juraePuzz.model.gridBaseImpl.{Grid, Level, Matrix}

import scala.swing.Publisher

trait ControllerInterface extends Publisher {

  def create_empty_grid(size: Int): Unit

  def toggleShow(): Unit

  def statusText: String

  def create_Level(): Unit

  def move(xS:Int, yS:Int, xT:Int, yT:Int): Unit

  def undo: Unit

  def redo: Unit

  def solve(): Unit

  def create_Level(l:Level): Unit

  def save: Unit

  def load: Unit

  def gridToString: String

  def gridSize: Int

  def gridMatrix: Matrix
}


import scala.swing.event.Event

class CellChanged extends Event
