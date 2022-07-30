package com.gontoy.l_template.example.improve;

/**
 * @author gzw
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {}

    @Override
    boolean isWantCondiments() {
        return false;
    }
}
