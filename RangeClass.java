class RangeClass {
int[] makeRange (int lower, int upper) {
int arr[] = new int[ (upper - lower) + 1 ];

for (int i = 0; i < arr.length; i++) {
arr[i] = lower++;
}
return arr;
}

void methodOne(){
System.out.println("Inside Method ONE");
}

void methodTwo(){
System.out.println("Inside Method TWO");
methodOne();// same as calling methodOne()
}

public static void main (String arg[]) {
int theArray[];
RangeClass rc = new RangeClass();
RangeClass theRange = new RangeClass();

theArray = theRange.makeRange(1,10);
System.out.print("The array: [ ");
for (int i = 0; i < theArray.length; i++) {
System.out.print(theArray[i] + " ");
}
System.out.println("]");
    rc.methodTwo();
}
}

/*
class RangeClass{
    int[] makeRange(int lower, int upper){
        int[] arr;
        int arr[] =new int[(upper - lower) + 1];
        for (int i=0; i < arr.length; i++){
            arr[i] = lower++;
        }
        return arr;
    }
    public static void main(String args[]){
        int rangerArr[];
        RangeClass theRange = new RangeClass();
        rangerArr = theRange.makeRange(1,10);
        for (int i=0; i < rangerArr.length; i++){
            System.out.println( rangerArr[i] + " ");
        }
    }
}*/
