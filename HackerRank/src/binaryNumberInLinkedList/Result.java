package binaryNumberInLinkedList;

class Result {

    /*
     * Complete the 'getNumber' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_SINGLY_LINKED_LIST binary as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static long getNumber(SinglyLinkedListNode binary) {
    // Write your code here
        long  decimal = binary.data;
        
        while(binary.next != null)  {
            decimal = (decimal << 1) | binary.next.data;
            binary = binary.next;
        }
                
        return decimal;
    }

}
