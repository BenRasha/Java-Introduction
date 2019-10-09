package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

class LinearProgramm4 {
    static public void main(String[] args) {
        double number=222.333;
        String numberToString =Double.toString(number);
        String []arr=numberToString.split("\\.");
        String NewArr=arr[1]+"."+arr[0];
        System.out.println(NewArr);
    }
}





