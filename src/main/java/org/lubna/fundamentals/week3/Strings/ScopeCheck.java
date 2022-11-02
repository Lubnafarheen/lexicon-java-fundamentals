package org.lubna.fundamentals.week3.Strings;

public class ScopeCheck {
    public int number = 0;
    private static int number2 = 0;

    public static void main(String[] args) {

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.print();
        staticPrint();
    }

    public void print() {
        int number = 20;
        System.out.println("Field: " + this.number + " LocalVariable: " +number);
    }


    public static void staticPrint() {
        int number2 = 12;
        System.out.println("Field: " + ScopeCheck.number2 + " LocalVariable: " +number2);
    }
}
