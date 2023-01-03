package binaryNumberInLinkedList;

import java.io.BufferedWriter;
import java.io.IOException;

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
        	System.out.println(String.valueOf(node.data));
            //bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
            	System.out.println(sep);
                //bufferedWriter.write(sep);
            }
        }
    }
}
