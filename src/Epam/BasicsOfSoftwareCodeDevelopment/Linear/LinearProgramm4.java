package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

class LinearProgramm4 {
    static void output(String[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if( i==2)
            {
                System.out.print(".");
            }
        }
    }
    static public void main(String[] args) {
        double number=222.333;
        String numberToString =Double.toString(number);
        String []arr=numberToString.split("");
        String temp = null;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=2;j<arr.length;j++)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        output(arr);
        //needs improvement//;
    }
}





