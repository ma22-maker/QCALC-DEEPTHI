package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{

    protected double result;

    @Override

    public void printResult(){
    
        System.out.println("Scientific Calculator Result:"+ result );
    
    }
    
    
    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
        setResult(result);
    }
    public void cos(double a){
        result = Math.cos(a);
        setResult(result);
    }
    public void square(double a){
        multiply(a,a);
        // setResult(result);
    }
    
public void tan(double a)
{
    result=Math.tan(a);
    setResult(result);
}


public void log(double a)
{
     result = Math.log(a);
     setResult(result);
}


public void sqrt(double a){

result = Math.sqrt(a);
setResult(result);


}


public void cbrt(double a){


    result = Math.cbrt(a);
    setResult(result);
}



}
