package Practise;

import java.util.Scanner;

public class Stack {
	int []stacks;
	int top,size ;
	
	Stack(){
	
		top = -1;
		stacks = new int[1];
		size = 1;
	}
	void push(int x){
		
		stacks[++top] = x;
		expand();
			
	}
	void expand(){
		int []temp = new int[++size];
		for(int i = 0;i <= top;i++){
			temp[i] = stacks[i];
		}
		stacks = new int[size];
		for(int i = 0; i <=top; i++)
			stacks[i] = temp[i];
	}
	int pop(){
		int n = stacks[top--];
		return n;
	}
	void display(){
		for(int i = top; i >= 0; i--){
			System.out.print(stacks[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Stack s = new Stack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(9);
		s.pop();
		s.display();
		

	}

}
