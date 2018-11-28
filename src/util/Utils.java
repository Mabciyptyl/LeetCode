package util;
/**
 * ������
 * @author chenyiAlone
 *
 */
public class Utils {
    /**
     * ��array�����е�p��qԪ�ؽ��н���
     * @param array 
     * @param p 
     * @param q
     */
    public static void exch(int[] array, int p, int q) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
    
    /**
     * ������ӡ���������Ԫ��
     * @param array
     */
    public static void printArray(int[] array) {
        printArray(array);
    }
    
    /**
     * 
     * @param array
     */
    public static void printArray(Object[] array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
    
    /**
     * ��ʼ��һ���Ƿ����������
     * @param n     ����Ԫ�صĸ���
     * @param order �Ƿ�����
     * @return array 
     */
    public static int[] initArray(int n, boolean order) {
        return order ? initArray(n) : shuffle(initArray(n));
    }
    
    /**
     * ��ʼ������һ������n��Ԫ�س�ʼֵΪ0-n������
     * @param n
     * @return
     */
    public static int[] initArray(int n) {
        int[] array = new int[n];
        while (n-- > 0) {
            array[n] = n;
        }
        return array;
    }
    
    /**
     * �������������
     * @param array
     * @return 
     */
    public static int[] shuffle(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int exch = (int)(Math.random()*(i+1));
            exch(array, i, exch);
        }
        return array;
    }
}
