package org.lubna.fundamentals.week3.Strings;

public class CreatingSubstring {
    String dialogue = "Ok this is not as long!";
    public static void main(String[] args) {
        CreatingSubstring creatingSubstring = new CreatingSubstring();
        creatingSubstring.substring();

    }
        public void substring(){
            System.out.println( "The substring of a given String is ->" + dialogue.substring(10, 22));
        }
}
