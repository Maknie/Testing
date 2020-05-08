package hometasks.first.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeClass
    public void initialization(){
        calculator= new Calculator();
    }

    @Test
    public void sumLongTest(){
        long result = calculator.sum(4785969685741L,741852963741L);
        Assert.assertEquals(result,5527822649482L);
    }

    @Test
    public void sumDoubleTest(){
        double result = calculator.sub(4785969.01d,74185.02d);
        Assert.assertEquals(result, 4711783.99d);
    }

    @Test
    public void subLongTest(){
        long result = calculator.sub(5527822649482L,741852963741L);
        Assert.assertEquals(result,4785969685741L);
    }

    @Test
    public void subDoubleTest(){
        double result = calculator.sub(5527822649482.03d,741852963741.02d);
        Assert.assertEquals(result,4785969685741.01d);
    }


    @Test
    public void multDoubleTestSimple(){
        double result = calculator.mult(5d,7d);
        Assert.assertEquals(result,35d);
    }

    @Test
    public void multDoubleTestExtended(){
        double result = calculator.mult(55278.03d,7418.02d);
        Assert.assertEquals(result,410053532.1006d);
    }

    @Test
    public void multLongTest(){
        long result = calculator.mult(55278L,7418L);
        Assert.assertEquals(result,410052204L);
    }

    @Test
    public void divLongTest(){
        long result = calculator.div(410052204L,7418L);
        Assert.assertEquals(result,55278L);
    }

    @Test
    public void divDoubleTest(){
        double result = calculator.div(410053532.1006d,7418.02d);
        Assert.assertEquals(result,55278.03d);
    }

    @Test
    public void powTestSimple(){
        double result = calculator.pow(5d,2d);
        Assert.assertEquals(result,25d);
    }

    @Test
    public void powTestExtended(){
        double result = calculator.pow(55278.03d,1.02d);
        Assert.assertEquals(result,56383.5906d);
    }

    @Test
    public void sqrtTest(){
        double result = calculator.sqrt(410053532.1006d);
        Assert.assertEquals(result,20249.778569174527d);
    }

    @Test
    public void tgTest(){
        double result = calculator.tg(32.8514d);
        Assert.assertEquals(result,7.3445715146d);
    }

    @Test
    public void ctgTest(){
        double result = calculator.ctg(32.8514d);
        Assert.assertEquals(result,0.1361549817d);
    }

    @Test
    public void cosTest(){
        double result = calculator.cos(32.8514d);
        Assert.assertEquals(result,0.1349102291d);
    }

    @Test
    public void sinTest(){
        double result = calculator.sin(32.8514d);
        Assert.assertEquals(result, 0.9908578253691275d);
    }

    @Test
    public void isPositiveTest(){
        boolean result = calculator.isPositive(410052204L);
        Assert.assertTrue(result);
    }

    @Test
    public void isNegativeTest(){
        boolean result = calculator.isNegative(410052204L);
        Assert.assertFalse(result);
    }


}
