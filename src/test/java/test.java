public class test {
    public static void main(String[] args) {
        long l = 0xffffff000000l;
        long w = 0x001001056432l;
        System.out.println(Long.toBinaryString(l&w));
        System.out.println(l&w);
        System.out.println("11111111111111111111111");
    }
}
