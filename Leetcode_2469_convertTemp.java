class convertTemper {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double[] convertedTemp = {kelvin, Fahrenheit};
        return convertedTemp;
    }
}