package com.company;

public class MyList {
    int val;
    MyList next=null;
    public MyList(int val) {
        this.val=val;
    }
    public void appendToTail(int v) {
        MyList end = new MyList(v);
        MyList current = this;
        while(current.next!=null) {
            current=current.next;
        }
        current.next=end;
    }
    public void showList() {
        MyList current = this;
        while(current!=null) {
            System.out.print(current.val+" ");
            current=current.next;
        }
    }
}
