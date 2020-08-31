package com.si56baqi.SpringDI;
//构造器的依赖注入
public class TextEditor {
    /*构造器：
    *
    *
    * */
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
  /*  public void spellCheck() {
        spellChecker.checkSpelling();
    }*/


}

