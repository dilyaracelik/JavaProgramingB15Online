package day47_finalKeyword_Abstraction;


public class ExtremeSports extends Sport {

    //    @Override
//    public void doSomething() {
////        super.doSomething();
//        System.out.println("doing extreme sport");
//    }
    // can not override
    // but you can do anything else
    // for example you can overload it
    public void doSomething(int x) {
        System.out.println("doing extreme sport");
    }


    @Override
    // this final keyword is
    // blocking sub class of ExtremeSport
    // to to override this method
//    public final void doSomethingElse() {
    public void doSomethingElse() {
//        super.doSomethingElse();
        System.out.println("doing something else in extreme sport");
    }


}