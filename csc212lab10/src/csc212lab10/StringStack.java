/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

/**
 *
 * @author Justin
 */
public class StringStack {

    String[] stack;
    int top;

    public StringStack(int maxSize) {
        stack = new String[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        if (top == stack.length -1){
            return true;
        }
        return false;
    }

    public void push(String s) {
        if (!this.isFull()) {
            top++;
            stack[top] = s;
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public String pop() {
        if (!this.isEmpty()) {
            String temp = stack[top];
            top--;
            return temp;
        } else {
            return null;
        }
    }

}
