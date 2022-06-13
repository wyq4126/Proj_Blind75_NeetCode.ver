package test;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class TestDemo {

    @Test
    public void test1() {
        int a = 36, b = 10;
        System.out.println("放在此位 余数 " + (a % b));
        System.out.println("进位 整除 " + (a / b));
    }

}
