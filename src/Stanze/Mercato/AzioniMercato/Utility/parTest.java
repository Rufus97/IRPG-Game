package Stanze.Mercato.AzioniMercato.Utility;


import Stanze.Mercato.AzioniMercato.Utility.TestsPar.TestHp;

public enum parTest {
    NO_HP(new TestHp());


    private TestPar testMethod;

    private parTest(TestPar test){
        this.testMethod = test;
    }
    public TestPar getTest() {
        return testMethod;
    }

}

