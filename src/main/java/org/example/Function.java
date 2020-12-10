package org.example;

class Function {
    public  double F(double x){

        return 10*x*Math.log(x*Math.exp(1))-(Math.pow(x,2)/2);
    }

    public  double Fprime_X(double x){

        return -x+10*Math.log(x/Math.exp(1))+10;
    }

    public  double Fsecond_X(double x){

        return -1+10/x;
    }
}
