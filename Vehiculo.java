package practico2;


import practico2.Combustible;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public int calcularCostoDeCombustible(int distancia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
