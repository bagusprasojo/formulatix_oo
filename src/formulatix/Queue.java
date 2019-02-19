package formulatix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bprasojo
 */

public class Queue {
    private int Head;
    private int Tail;
    private int Size;
    private int [] Data;
    
    private boolean  IsEmpty(){
        return Tail == -1;
    }
    
    private boolean  IsFull(){
        return Tail == Size - 1;
    }
    
    public void Enqueue(int AData){
        if (IsEmpty()){
            Head = 0;
            Tail = 0;
            
            Data[Tail] = AData;
            //System.err.println("Data " + AData + " Added In Queue Index " + Tail );
        } else if (!IsFull()){
            Tail++;
            Data[Tail] = AData;
            //System.err.println("Data " + AData + " Added In Queue Index " + Tail );            
        }        
    }
    
    public int Dequeue(){
        int d = 0;
        if (!IsEmpty()){
        
            int i;
            d = Data[Head];

            //Data[Tail] = null;
            for (i=Head;i <= Tail-1; i++){
                Data[i] = Data[i+1];            
            }

            Tail = Tail - 1;
            
        }
        
        return d; 
    }
    
    public Queue(int ASize){
        Data = new int[ASize];
        Size = ASize;
        
        Head = -1;
        Tail = -1;
    }
    
    public static void main(String[] args) {
        Queue Q = new Queue(8);
        
        Q.Enqueue(90);
        Q.Enqueue(91);
        
        System.out.println(Q.Data[0]);
        System.out.println(Q.Data[1]);
        
        int dt = Q.Dequeue();
        System.out.println("Data : " + dt);
        
        dt = Q.Dequeue();
        System.out.println("Data : " + dt);
        
        dt = Q.Dequeue();
        System.out.println("Data : " + dt);
        
        dt = Q.Dequeue();
        System.out.println("Data : " + dt);
    }
    
}


