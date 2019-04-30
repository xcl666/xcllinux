class page16
{
    public static void main(String[] args)
    {
        char [] a={'1', '2', '3', '4', '5', '6', '7'};
        String s1 = new String(a,2,4);
        System.out.println(s1);
        System.out.println(a);
        System.out.println("\t");
        int i = 6;
        int j = i--;
        System.out.println(i);
        System.out.println(j);
        System.out.println("i is: "+i+"\nj is: "+j);
    }
}
