import processing.core._

class ProcessingTest extends PApplet {

  override def settings() {
    size(1024, 768)
  }

  override def setup() {
    background(200)

    textSize(32)
    fill(0, 0, 0)
    text("what it do", 10, 30)
  }

  override def draw() {
    // Your drawing code
  }
}

object ProcessingTest extends App {
  PApplet.main("ProcessingTest")
}
