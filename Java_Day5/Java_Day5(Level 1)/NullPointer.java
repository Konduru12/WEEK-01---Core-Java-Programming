class NullPointer{
    public static void generateexception(){
        String text=null;
        System.out.println("String length "+text.length());
    }
    public static void handleexception(){
        String text=null; 
        try{
            System.out.println("Attempting to get length...");
            System.out.println("String length: " + text.length());
        }catch(java.lang.NullPointerException e){
            System.out.println("Exception caught "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("Generating nullpointerexception");
            generateexception();
        } catch (java.lang.NullPointerException e) {
            System.out.println("Exception caught "+e.getMessage());
        }
        System.out.println("Handling NullPointerException...");
        handleexception();
    }
}
