package com.abstract_;

public class AbstractDetail02 {

}
//抽象方法不能与private、final 和 static配合使用 (三者与重写违背)
abstract class H {
    abstract void hello();
//    abstract static  void hello1();

//    abstract final void hello2();
//    abstract private void hi();
}
