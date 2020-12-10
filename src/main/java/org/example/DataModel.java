package org.example;

public class DataModel {
    private double  x0,eps,x1,absolut_error;

    public DataModel(double x0, double eps){
        this.x0 = x0;
        this.eps = eps;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setAbsolut_error(double absolut_error) {
        this.absolut_error = absolut_error;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getAbsolut_error() {
        return absolut_error;
    }

    public double getEps() {
        return eps;
    }

    public double getX0() {
        return x0;
    }

    public double getX1() {
        return x1;
    }

}
