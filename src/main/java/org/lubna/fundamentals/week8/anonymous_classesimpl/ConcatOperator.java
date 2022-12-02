package org.lubna.fundamentals.week8.anonymous_classesimpl;

import org.lubna.fundamentals.week8.interfaces.DoStringStuff;

public class ConcatOperator implements DoStringStuff {
    @Override
    public String operate(String s1, String s2) {
        return s1.concat(s2);
    }
}
