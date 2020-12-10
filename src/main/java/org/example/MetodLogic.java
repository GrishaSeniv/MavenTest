package org.example;

public class MetodLogic {
    Function function = new Function();
    DataModel dataModel = new DataModel(0.5, 0.001);
    private double expected;

    public double getExpected() {
        return expected;
    }

    public void Logic(){
        for(int i=1; i<=100; i++) {
            if (Math.abs(function.Fprime_X(dataModel.getX0())) < dataModel.getEps()) {

                System.out.println("FINISH\nNUMBER OF ITERARIONS = " + (i-1));

                dataModel.setAbsolut_error(Math.abs(function.Fprime_X(dataModel.getX0()) - dataModel.getEps()));

                System.out.println("F'(x0)=" + function.Fprime_X(dataModel.getX0()));
                System.out.println("Absolut Error = " + dataModel.getAbsolut_error());
                System.out.println("x0=" + dataModel.getX0());

                expected = dataModel.getX0();

                break;

            } else {

                System.out.println("Iteration" + i);
                System.out.println("F'(x0)="+function.Fprime_X(dataModel.getX0()));
                System.out.println("x0=" + dataModel.getX0());

                dataModel.setX1(dataModel.getX0()-function.Fprime_X(dataModel.getX0())/function.Fsecond_X(dataModel.getX0()));
                dataModel.setAbsolut_error(Math.abs(function.Fprime_X(dataModel.getX0()) - dataModel.getEps()));

                System.out.println("Absolut Error = " + dataModel.getAbsolut_error());
                System.out.println("x1=" + dataModel.getX1());

                dataModel.setX0(dataModel.getX1());

                System.out.println();
            }

        }
    }
}
