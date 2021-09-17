package chap02.program02

import chap02.program01._

class HelloSub extends Hello {
  override def getMessage():String = {
    "Hello world from HelloSub class!"
  }
}

