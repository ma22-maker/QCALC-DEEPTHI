package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
   
 private double result;


 public double getResult() {

    return result;

}

public void clearResult() {

    result = 0;

}

public void setResult(double value) {

   this.result = value;

}


public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

}



  
public final void add(int num1, int num2){

    add((double)num1, (double)num2);

}


public final void subtract(int num1, int num2)
{
    // setResult(num1-num2);
    // printResult();
    subtract((double)num1, (double)num2);
}


public final void multiply(int num1, int num2)
{
    // setResult(num1*num2);
    // printResult();
    multiply((double)num1, (double)num2);
}


public final void divide(int num1, int num2)

{
//    setResult(num1/num2);
//    printResult();
      divide((double)num1, (double)num2);
}
///////////////////////////////////////////////////////////////////////

public void add(double num1, double num2){

     result = num1 + num2;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    // this.result = result;
    setResult(result);
    printResult();

}

// public void subtract(double num1, double num2)
// {
//     setResult(num1-num2);
//     printResult();
// }

public void subtract(double num1, double num2){

     result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }
    setResult(result);
    printResult();

}

public void multiply(double num1, double num2)
{   result=num1*num2;
    
    if((result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }
    setResult(result);
    printResult();
}

public void divide(double num1, double num2)

{  
    if(num2 == 0.0){

        throw new ArithmeticException("Divide By Zero");

    }

    result = num1 / num2;
    
    if((result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }
   setResult(result);
   printResult();
}


}
