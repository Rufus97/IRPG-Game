package Stanze.Mercato.AzioniMercato.Utility;


import Stanze.Mercato.AzioniMercato.Utility.TestsPar.TestHp;

public enum ParametersToTest {
    NO_HP(new TestHp());


    private TestPar testMethod;
    private ParametersToTest(TestPar test){
        this.testMethod = test;
    }
    public TestPar getTestMethod() {
        return testMethod;
    }

}

