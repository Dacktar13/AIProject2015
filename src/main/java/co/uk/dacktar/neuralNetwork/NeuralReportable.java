package co.uk.dacktar.neuralNetwork;

/**
 * NeuralReportable
 *
 * @author Seth Wheeler
 * @addapted from Jeff Heaton
 * @version 1.1
 */


public interface NeuralReportable
{
    public void update(int retry,double totalError,double bestError);
}

