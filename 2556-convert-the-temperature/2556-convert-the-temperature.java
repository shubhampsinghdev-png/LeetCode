class Solution {
    public double[] convertTemperature(double degree) {
        double kelvin = degree + 273.15;
        double fah = degree * 1.80 + 32.00;
    return new double[] {kelvin , fah};
    }
}