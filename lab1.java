 class lab{  
    public static void main(String[] args){  
       // System.out.println("Hello world");  
       System.out.println(args.length);
       for (int i = 0; i < args.length; i++) {
             System.out.print(args[i]+" ");
           } 

       int len = Integer.parseInt(args[1]);
       for (int i = 0; i < len ; i++) {
             System.out.println(args[0]);
           }
       
    }  
}  