class readthis
{
    public static void main(String[] args) {
        String str="IAmACompetitiveProgrammer";
        String[] str1=str.split("(?=[A-Z])");
        for(String i:str1)
        {
            System.out.println(i);
        }
    }
}