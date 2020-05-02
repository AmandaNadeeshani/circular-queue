3/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularq;

import java.util.Scanner;

/**
 *
 * @author Amanda Nadeeshani
 */
public class CircularQ {

   int qu[] = new int[50];
    int msize, front, rear;
    public CircularQ(int size){
        msize=size;
        front = 0;
        rear=0;
    }
    boolean isem(){
        if(rear ==-1 && front== -1){
            return true;
        }else
            return false;
    }
    boolean isfull(){
        if(rear == msize-1){
            return true;
        }else
            return false;
    }
 public void enq(int data){
        if(!isfull()){
            if((rear+1) % msize != front){
                rear = (rear+1)%msize;
                qu[rear] = data;
                //System.out.println("Enqueue successfull");
            }
        }else{
            System.out.println("Cannot Enter elements the queue is full");
        }
    }
   public int deq(){
        int item;
        if(!isem()){
          front = (front+1)%msize;
          item = qu[front];
           return item;
        }else{
         System.out.println("The queue is empty");
         return 0;
        }
    }
  
  public void front(){
      if(!isem()){
          int item = qu[front+1];
          System.out.println("front is"+ item);
          
      }else{
          System.out.println("empty");
      }
  }

  public void rear(){
      if(!isem()){
          int item = qu[rear];
          System.out.println("rear is" + item);
      }else
          System.out.println("empty1");
  }
  
  
    public static void main(String[] args) {
        System.out.print("enter the que size");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        CircularQ ob= new CircularQ(size);
        ob.enq(23);
        ob.enq(45);
        ob.enq(67);
        ob.front();
        ob.rear();
        ob.deq();
        ob.enq(52);
        ob.front();
        ob.rear();
    }
    
}

