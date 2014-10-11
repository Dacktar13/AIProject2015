/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dacktar13.aiproject2015;

import java.util.Objects;

/**
 * Just used to demonstrate JUnit
 *
 * @author mat
 */
public class TestBean {

    private String stringTest;
    private int intTest;

    public TestBean() {
    }

    public TestBean(String stringTest, int intTest) {
        this.stringTest = stringTest;
        this.intTest = intTest;
    }

    public String getStringTest() {
        return stringTest;
    }

    public void setStringTest(String stringTest) {
        this.stringTest = stringTest;
    }

    public int getIntTest() {
        return intTest;
    }

    public void setIntTest(int intTest) {
        this.intTest = intTest;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.stringTest);
        hash = 29 * hash + this.intTest;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TestBean other = (TestBean) obj;
        if (!Objects.equals(this.stringTest, other.stringTest)) {
            return false;
        }
        if (this.intTest != other.intTest) {
            return false;
        }
        return true;
    }

}
