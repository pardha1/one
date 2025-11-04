class encrypt{
    public static void main(String[] args) {
        String s="Xfruqj%ymnx%nx%jshw~uyji%yj}y";
        int i =5;
        char[] chararr=s.toCharArray();
        for(char c:chararr){
            c-=5;
            System.out.print(c);
        }

    }
}