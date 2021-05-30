package tumpukan1;
public class stack {
    public static void main (String [] args){
        contoh tumpukan = new contoh(10);
        tumpukan.push(50);
        tumpukan.printData();
        tumpukan.push(100);
        tumpukan.printData();
        tumpukan.pop();
        tumpukan.printData();
        tumpukan.push(60);
        tumpukan.printData();
        tumpukan.push(80);
        tumpukan.printData();
        tumpukan.pop();
        tumpukan.printData();
        long bacaTop = tumpukan.peek();
        System.out.println("nilai top = "+bacaTop);
    }
    
    
}
